public class UserInputValidator {
    public static void validateUsername(String username) {
        assert username.matches("^[a-zA-Z][a-zA-Z0-9_]{4,19}$") : "Invalid username";
    }

    public static void validateEmail(String email) {
        assert email.matches("^[A-Za-z0-9._%+-]+@[A-Za-z0-9.-]+\\.[A-Z|a-z]{2,}$") : "Invalid email address";
    }

    public static void validateAge(int age) {
        assert age >= 17 && age <= 99 : "Invalid age";
    }
}