import java.util.*;

public class Practice {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("John");
        list.add("Doe");
        list.add("John"); // allow duplicates
        System.out.println(list.get(0));
        System.out.println(list);

        Set<String> set = new HashSet<>();
        set.add("John");
        set.add("Doe");
        set.add("John"); // not allow duplicates
        System.out.println(set);

        Map<String, Integer> map = new HashMap<>();
        map.put("John", 25);
        map.put("Doe", 30);
        map.put("John", 28); // update value
        System.out.println(map.get("Doe"));
        System.out.println(map.containsKey("John"));

        Queue<String> queue = new LinkedList<>();
        queue.offer("John");
        queue.offer("Doe");
        System.out.println(queue.poll());
        System.out.println(queue);
    }
}