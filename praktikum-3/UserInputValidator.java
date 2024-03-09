import java.util.regex.Pattern;

public class UserInputValidator {
    public static void validateUsername(String username) {
        // Persyaratan untuk username: minimal 5 karakter, maksimal 20 karakter,
        // hanya huruf, angka, dan underscore (_), harus diawali dengan huruf
        assert username.matches("^[a-zA-Z]\\w{4,19}$") : "Username tidak valid";
    }

    public static void validateEmail(String email) {
        // Persyaratan untuk email: harus berbentuk email yang valid
        assert Pattern.matches("^[a-zA-Z0-9_+&*-]+(?:\\.[a-zA-Z0-9_+&*-]+)*@(?:[a-zA-Z0-9-]+\\.)+[a-zA-Z]{2,7}$", email) : "Email tidak valid";
    }

    public static void validateAge(int age) {
        // Persyaratan untuk usia: di antara 17 tahun hingga 99 tahun
        assert age >= 17 && age <= 99 : "Usia tidak valid";
    }

    public static void main(String[] args) {
        // Contoh penggunaan validasi
        validateUsername("Saki_123"); // Valid username
        validateEmail("saki@example.com"); // Valid email
        validateAge(25); // Valid usia

        // Contoh penggunaan validasi dengan input yang tidak memenuhi persyaratan
        validateUsername("s"); // Tidak valid, kurang dari 5 karakter
        validateEmail("saki@com"); // Tidak valid, email tidak valid
        validateAge(15); // Tidak valid, usia kurang dari 17 tahun
    }
}