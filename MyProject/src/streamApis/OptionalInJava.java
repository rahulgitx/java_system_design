package streamApis;
import java.util.*;
public class OptionalInJava {

        public static Optional<User> findUserById(int id) {
            // Simulating database lookup
            if (id == 1) {
                return Optional.of(new User("Alice"));
            } else {
                return Optional.empty(); // No user found
            }
        }

        public static void main(String[] args) {
            // Safely handling the absence of a user
            Optional<User> optionalUser = findUserById(2);

            String name = optionalUser
                    .map(User::getName)  // Get the name if user exists
                    .orElse("Default User"); // Fallback if user is absent

            System.out.println("User name: " + name);
        }

}

class User {
    private String name;

    public User(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
