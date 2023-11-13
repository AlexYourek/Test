import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
// Pętla for
        for (int i = 0; i <= 10000; i += 100) {
            System.out.print(i + " ");
        }

        System.out.println(" ");

// Pętla while
        int j = 0;
        while (j <= 10000) {
            System.out.print(j + " ");
            j += 100;
        }

    }
}
