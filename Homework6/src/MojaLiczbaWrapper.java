public class MojaLiczbaWrapper {
    private int liczba;

    public MojaLiczbaWrapper(int liczba) {
        this.liczba = liczba;
    }

    public boolean jestDodatnia() {
        return liczba > 0;
    }

    public int doKwadratu() {
        return liczba * liczba;
    }

    public String toString() {
        return String.valueOf(liczba);
    }
}

