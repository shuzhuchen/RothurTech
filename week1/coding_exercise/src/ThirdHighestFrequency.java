import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

public class ThirdHighestFrequency {
    public static Character findThirdHighestFrequency(char[] arr) {
        // count the frequency of each character
        Map<Character, Long> freqMap = 
                new String(arr)
                    .chars()
                    .mapToObj(c -> (char) c)
                    .collect(Collectors.groupingBy(
                            Function.identity(), 
                            Collectors.counting()
                ));
        
        // sort by frequency in descending order
        List<Map.Entry<Character, Long>> sortedList =
                freqMap.entrySet()
                        .stream()
                        .sorted((e1, e2) ->
                                Long.compare(e2.getValue(), e1.getValue()))
                        .collect(Collectors.toList());

        // get 3rd highest frequency character
        if (sortedList.size() >= 3) {
            return sortedList.get(2).getKey();
        }

        return null;
    }

    public static void main(String[] args) {
        char[] arr = {'a', 'b', 'b', 'c', 'c'};
        Character result = findThirdHighestFrequency(arr);

        if (result != null) {
            System.out.println("Third highest frequency char: " + result);
        } else {
            System.out.println("Not enough unique characters.");
        }
    }
}
