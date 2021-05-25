import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

/**
 * Java 8 Stream api collectors example
 *
 * @version JavaProgramTo.com
 */
public class StringCountDuplicateCharJava8Streams {

    public static void main(String[] args) {
        printCountOfDuplicateCharJava8Stream("bbbcccccddddddaaaa");
    }

    // Using hashmap : print count of each character in a given string.
    private static void printCountOfDuplicateCharJava8Stream(String input) {

        // Step 1
        IntStream intStream = input.chars();

        // Step 2
        Stream<Character> charsStream = intStream.mapToObj(ch -> (char) ch);

        // Step 3
        Map<Character, Long> output = charsStream.collect(Collectors.groupingBy(ch -> ch, Collectors.counting()));

        //all three combined steps
        Map<Character, Long> output2 = input.chars().mapToObj(ch -> (char) ch).collect(Collectors.groupingBy(ch -> ch, Collectors.counting()));
        
        System.out.println(output);
        System.out.println(output2);

    }

}

Using MAP

input : abcdabd
output : {a=2, b=2, c=1, d=2}

import java.util.LinkedHashMap;
import java.util.Map;

public class StringFindDuplicatesMain {

	public static void main(String[] args) {
		String str = "abcdabd";
		Map<Character, Integer> charCountMap = new LinkedHashMap<Character, Integer>();
		
		for (int i = 0; i < str.length(); i++) {
			char c = str.charAt(i);

			if (charCountMap.containsKey(c)) {
				charCountMap.put(c, charCountMap.get(c) + 1);
			} else {
				charCountMap.put(c, 1);
			}
		}
		System.out.println(charCountMap);
	}

}


