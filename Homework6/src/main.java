public class main {
public static void main (String[] args) {
        MojaLiczbaWrapper liczba1 = new MojaLiczbaWrapper(5);
        MojaLiczbaWrapper liczba2 = new MojaLiczbaWrapper(-3);

    System.out.println("Czy liczba " + liczba1 + " jest dodatnia: " + liczba1.jestDodatnia());
    System.out.println("Czy liczba " + liczba2 + " jest dodatnia: " + liczba2.jestDodatnia());

    System.out.println("kwadrat pierwszej liczby wynosi: " + liczba1.doKwadratu());
    System.out.println("kwadrat drugiej liczby wynosi: " + liczba2.doKwadratu());
        }
}