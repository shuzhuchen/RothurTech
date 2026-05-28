import java.util.Optional;

public class OptionalDemo {

    public static void main(String[] args) {

        String name = "John Doe";

        Optional<String> optionalName = Optional.ofNullable(name);

        System.out.println("\nName exists:");
        System.out.println(
                optionalName.orElse("Unknown Name")
        );

        System.out.println(
                optionalName.orElseThrow(
                        () -> new RuntimeException("Name missing")
                )
        );
    }
}