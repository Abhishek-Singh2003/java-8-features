package Stram_API;

import java.util.*;
import java.util.stream.*;

public class Stream_API_EX
{

	    public static void main(String[] args) {

	        // Step 1: Ek List banate hain
	        List<Integer> numbers = Arrays.asList(10, 25, 40, 55, 70, 85, 90, 25, 40);

	        System.out.println("Original List:");
	        System.out.println(numbers);

	        // Step 2: Stream start karte hain
	        List<Integer> filteredList = numbers.stream()

	            // Step 3: Filter - sirf 50 se bade numbers
	            .filter(n -> n > 50)

	            // Step 4: Map - sab numbers ko 10 add karke modify karo
	            .map(n -> n + 10)

	            // Step 5: Sorted - ascending order me
	            .sorted()

	            // Step 6: Collect - result ko List me convert karo
	            .collect(Collectors.toList());

	        System.out.println("\nFiltered + Mapped + Sorted List:");
	        System.out.println(filteredList);

	        // Step 7: Count - 50 se bade numbers kitne the
	        long count = numbers.stream()
	                .filter(n -> n > 50)
	                .count();

	        System.out.println("\nCount of numbers greater than 50: " + count);

	        // Step 8: Unique numbers (Set me collect)
	        Set<Integer> uniqueSet = numbers.stream()
	                .collect(Collectors.toSet());

	        System.out.println("\nUnique numbers (using Collectors.toSet()):");
	        System.out.println(uniqueSet);
	    }
}


