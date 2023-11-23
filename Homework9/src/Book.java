public class Book {
    private String title;
    private String author;
    private int Year;

    public Book(String title, String author, int year) {
        this.title = title;
        this.author = author;
        Year = year;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public int getYear() {
        return Year;
    }

    @Override
    public String toString() {
        return "Book{" +
                "title='" + title + '\'' +
                ", author='" + author + '\'' +
                ", Year=" + Year +
                '}';
    }
}
