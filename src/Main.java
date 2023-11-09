public class Main {
    public static void main(String[] args) {

        BankAccount account1 = new BankAccount("1360 0000",5000,"Jan Kowalski");
        BankAccount account2 = new BankAccount("9876 1111",1000,"Zofia Kowalska");
        BankAccount account3 = new BankAccount("1360 2222",4000,"Józek Kowalski");

        account1.displayBalance();
        account2.displayBalance();
        account3.displayBalance();

        account1.deposit(100);
        account2.withdraw(200);
        account3.deposit(300);

        account1.displayBalance();
        account2.displayBalance();
        account3.displayBalance();

    }
}