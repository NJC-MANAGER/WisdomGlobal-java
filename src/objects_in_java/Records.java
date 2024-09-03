package objects_in_java;

public class Records {

    // Record definition should be outside the main method
    public record Account(
            int id,
            int customerId,
            String type,
            double balance
    ) {
        // Method added to the record
        public void aNewMethod() {
            System.out.println("New method added to a record!");
        }
    }
//Records can be instantiated just like classes
    Account account = new Account(13344, 12212, "Checking", 4033.93);
    public static void main(String[] args) {
        // Create an instance of the Account record
        Account account = new Account(1, 1001, "Savings", 1500.50);

        // Call the custom method
        account.aNewMethod();

        // Access record components
        System.out.println("Account ID: " + account.id());
        System.out.println("Customer ID: " + account.customerId());
        System.out.println("Account Type: " + account.type());
        System.out.println("Balance: " + account.balance());
    }
}
