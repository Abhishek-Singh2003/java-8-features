package Lambda_Expression;


public class ClassA {

    void display() {
    	
    	System.out.println("Implementing Lambda Expressions\n");

         // InterfaceA x = (int data) -> System.out.println("Hello World : " + data);    // 1st way
        //  InterfaceA x = (data) -> System.out.println("Hello World : " + data);       // 2nd way
       //   InterfaceA x = data -> System.out.println("Hello World : " + data);        // 3rd way (ONLY for single parameter)

        
        InterfaceA x = () -> System.out.println("Hello from meth1");
        x.meth1();

        InterfaceB y = (int num1, int num2) -> System.out.println("Addition : " + (num1 + num2));
        y.meth2(99, 1);

        InterfaceC z = (int num3, int num4) -> {
            if (num3 <= 10) {
                System.out.println("if block executed");
                return 100 + num3;
            } else {
                System.out.println("else block executed");
                return 1000 + num4;
            }
        };

        int result = z.meth3(50, 10);
        System.out.println("meth3() is returning : " + result);
    }

    public static void main(String[] args) {
        ClassA aobj = new ClassA();
        aobj.display();
    }
}


 