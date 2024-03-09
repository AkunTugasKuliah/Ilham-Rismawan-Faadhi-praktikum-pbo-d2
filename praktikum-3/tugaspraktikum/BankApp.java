public class BankApp {
    public static void main(String[] args) {
        try {
            BankAccount account = new BankAccount(500.0);

            // Skenario saldo mencukupi
            account.withdraw(200.0);
            System.out.println("Saldo saat ini: $" + account.getBalance());

            // Skenario saldo tidak mencukupi
            account.withdraw(400.0);
        } catch (InsufficientFundsException e) {
            System.out.println(e.getMessage());
        }
    }
}