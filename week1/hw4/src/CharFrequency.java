import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

public class CharFrequency {

    public static void main(String[] args) {

        char[] arr = {'a', 'a', 'b', 'b', 'c'};

        Map<Character, Long> freq =
                new String(arr)
                        .chars()
                        .mapToObj(i -> (char) i)
                        .collect(Collectors.groupingBy(
                                Function.identity(),
                                Collectors.counting()
                        ));

        System.out.println(freq);
    }
}