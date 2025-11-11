package Lambda_Expression;


import java.util.ArrayList;
import java.util.HashMap;

public class ClassB {

    void display() {
        System.out.println("Implementing Lambda Expression with Collection and Array\n");

        // Lambda expression implementing InterfaceD
        InterfaceD obj = (al, arr) -> {
            HashMap<Integer, String> map = new HashMap<>();

            // Loop chalake dono ko combine karte hain
            for (int i = 0; i < al.size() && i < arr.length; i++) 
            {
                map.put(al.get(i), arr[i]);
            }

            return map; // HashMap return kar rahe hain
        };

        // Ab ArrayList aur Array create karte hain
        ArrayList<Integer> list = new ArrayList<>();
        list.add(101);
        list.add(102);
        list.add(103);

        String[] names = {"Abhi", "Rohan", "Simran"};

        // Lambda ko call karte hain
        HashMap<Integer, String> result = obj.meth1(list, names);

        // Result print karte hain
        System.out.println("Returned HashMap: " + result);
    }

    public static void main(String[] args) {
        ClassB bobj = new ClassB();
        bobj.display();
    }
}
