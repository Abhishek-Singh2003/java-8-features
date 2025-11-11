package Optional_class;


import java.util.Optional;

public class ClassA

{
    public static void main(String[] args) {
        
        // 1️⃣ Normal value ke saath Optional banana
        Optional<String> name1 = Optional.of("Abhishek");
        
        // 2️⃣ Null value ke saath (safe way)
        Optional<String> name2 = Optional.ofNullable(null);
        
        // 3️⃣ Empty Optional
        Optional<String> name3 = Optional.empty();

        // 4️⃣ isPresent() check
        if (name1.isPresent()) {
            System.out.println("Name1: " + name1.get());
        } else {
            System.out.println("Name1 is empty");
        }

        if (name2.isPresent()) {
            System.out.println("Name2: " + name2.get());
        } else {
            System.out.println("Name2 is empty");
        }

        // 5️⃣ orElse() use — agar null ho to default value dega
        String result = name2.orElse("Default Name");
        System.out.println("Name2 (with default): " + result);

        // 6️⃣ ifPresent() — agar value hai to action perform karo
        name1.ifPresent(val -> System.out.println("Value is present: " + val));
    }
}
