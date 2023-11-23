import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        List<Book> ksiazki = new ArrayList<>();
        ksiazki.add(new Book("Kodowanie", "Zdzisiek Javovski", 2020));
        ksiazki.add(new Book("Miksowanie", "Zosia Samosia", 1999));
        ksiazki.add(new Book("Zycie w Polsce", "Zenek Politykowski", 1990));
        ksiazki.add(new Book("Podroz do wnetrza ziemii", "Juliusz Verne", 1980));
        ksiazki.add(new Book("Moje Panstwo", "Jarek Kaczynski", 2005));

        System.out.println("Info o zbiorze: ");
        for (Book book : ksiazki){
            System.out.println(book.toString());
        }

        System.out.println("\nKsiazki starsze:");
        int index = 0;
        while (index< ksiazki.size()){
            Book book = ksiazki.get(index);
            if (book.getYear() < 2000){
                System.out.println(book.toString());
            }
            index++;
        }
    }
}