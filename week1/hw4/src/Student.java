import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Student {
    private String name;
    private int age;
    private int score;
    private String gender;

    public Student(String name, int age, int score, String gender) {
        this.name = name;
        this.age = age;
        this.score = score;
        this.gender = gender;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public int getScore() {
        return score;
    }

    public String getGender() {
        return gender;
    }

    @Override
    public String toString() {
        return name + " age=" + age + " score=" + score;
    }

    public static void main(String[] args) {
        List<Student> list = new ArrayList<>();
        list.add(new Student("Alice", 20, 85, "girl"));
        list.add(new Student("Bob", 22, 90, "boy"));
        list.add(new Student("Charlie", 19, 58, "boy"));
        list.add(new Student("Diana", 21, 92, "girl"));

        List<String> namesStartingWithA = list.stream()
                .map(Student::getName)
                .filter(name -> name.startsWith("A"))
                .collect(Collectors.toList());

        int totalScore = list.stream()
                .mapToInt(Student::getScore)
                .sum();

        List<String> passedStudentNames = list.stream()
                .filter(student -> student.getScore() >= 60)
                .map(Student::getName)
                .collect(Collectors.toList());

        List<String> allNames = list.stream()
                .map(Student::getName)
                .collect(Collectors.toList());

        Map<Integer, Long> ageFrequency = list.stream()
                .collect(Collectors.groupingBy(Student::getAge, Collectors.counting()));

        Map<String, Long> genderCount = list.stream()
                .collect(Collectors.groupingBy(Student::getGender, Collectors.counting()));

        System.out.println("Names starting with A: " + namesStartingWithA);
        System.out.println("Total score: " + totalScore);
        System.out.println("Student names whose score >= 60: " + passedStudentNames);
        System.out.println("All names: " + allNames);
        System.out.println("Age frequency: " + ageFrequency);
        System.out.println("Gender count: " + genderCount);
    }
}