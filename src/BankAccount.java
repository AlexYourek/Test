public class BankAccount {
    /*Stwórz klasę BankAccount, która reprezentuje konto bankowe.
Klasa powinna zawierać pola, takie jak numerKonta, saldo i wlasciciel,
oraz konstruktor, który umożliwia tworzenie obiektów BankAccount z określonym numerem konta,
saldem początkowym i właścicielem. Dodaj metody do wpłacania i wypłacania środków
oraz wyświetlania aktualnego salda. Stwórz kilka kont bankowych,
wykonaj operacje wpłaty i wypłaty, a następnie wyświetl ich saldo.*/
private String accountNumber;
private double balance;
private String owner;

    public BankAccount(String accountNumber, double startBalance, String owner) {
        this.accountNumber = accountNumber;
        this.balance = startBalance;
        this.owner = owner;
    }

    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("wpłacasz: " + amount);
        } else {
            System.out.println("zła kwota");
        }
    }

        public void withdraw(double amount) {
            if (amount > 0 && amount <= balance) {
                balance -= amount;
                System.out.println("wypłacasz: " + amount);
            } else {
                System.out.println("zła kwota, lub brak środków");
            }
        }

        public void displayBalance() {
            System.out.println("saldo konta " + accountNumber + ": " + balance);
        }
    }
