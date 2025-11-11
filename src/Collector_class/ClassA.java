package Collector_class;

import java.util.*;
import java.util.stream.*;

public class ClassA 
{
    public static void main(String[] args) {
        List<String> names = Arrays.asList("Abhishek singh", "Ravi", "Ankit", "Ravi", "Neha");

        // 1️⃣ toList()
        List<String> list = names.stream().collect(Collectors.toList());
        System.out.println("List: " + list);

        // 2️⃣ toSet()
        Set<String> set = names.stream().collect(Collectors.toSet());
        System.out.println("Set (duplicates removed): " + set);

        // 3️⃣ counting()
        long count = names.stream().collect(Collectors.counting());
        System.out.println("Count: " + count);

        // 4️⃣ joining()
        String joined = names.stream().collect(Collectors.joining(", "));
        System.out.println("Joined: " + joined);

        // 5️⃣ groupingBy()
        Map<String, Long> group = names.stream()
                .collect(Collectors.groupingBy(name -> name, Collectors.counting()));
        System.out.println("Grouped by count: " + group);

        // 6️⃣ partitioningBy()
        Map<Boolean, List<String>> partition = names.stream()
                .collect(Collectors.partitioningBy(name -> name.length() > 5));
        System.out.println("Partitioned (length > 5): " + partition);
    }
}
