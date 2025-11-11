package Parallel_Stream;
import java.util.*;

public class ClassA
{
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1,2,3,4,5,6,7,8,9,10);

        System.out.println("Sequential Stream:");
        numbers.stream()
               .forEach(n -> System.out.println(Thread.currentThread().getName() + " -> " + n));

        System.out.println("\nParallel Stream:");
        numbers.parallelStream()
               .forEach(n -> System.out.println(Thread.currentThread().getName() + " -> " + n));
    }
}
