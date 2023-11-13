import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int poczatkowaWartosc = scanner.nextInt();

        for (int i = poczatkowaWartosc; i>=0; i-=2){
            System.out.println(i + "");
        }

        System.out.println();

        int wartoscWhile = poczatkowaWartosc;
        while (wartoscWhile >=0){
            System.out.println(wartoscWhile + " ");
            wartoscWhile -=2;
        }
    }
}