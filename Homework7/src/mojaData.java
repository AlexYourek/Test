public class mojaData {
    private int year;
    private int day;
    private int month;

    public mojaData (int year, int month, int day) {
        this.year = year;
        this.month = month;
        this.day = day;
    }

    public boolean rokPrzestepny() {
        return (year % 4 == 0);
    }

    public int ileDni(int month);
    if (month < 1 || month > 12) {
        return -1;
    }

    
}
