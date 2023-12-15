package org.example;

import org.example.dao.UserDAO;
import org.example.entity.User;
import org.example.entity.UserItems;

/**
 * Hello world!
 */
public class App {


    public static void main(String[] args) {

        //tworzenie tabeli jesli nie ma
        UserDAO userDAO = new UserDAO();

        // Wyświetlenie danych z pobranego rekordu
        /*UserItems user = userDAO.getById(1);
        System.out.println("ID: " + user.getId() + ", User ID: " + user.getUserId() +
                ", Item Name: " + user.getItemName() + ", Quantity: " + user.getQuantity());*/

        // linia na usuwanie danych
        //userDAO.deleteById(1);

        // aktualizowanie danych
        UserItems bartosz = userDAO.getById(2);
        bartosz.setUserId(244);
        userDAO.update(bartosz);

        /* wstawianie nowych wierszy
        UserDAO.saveUser(new UserItems(123, "Computer", 2));
        UserDAO.saveUser(new UserItems(23, "Mouse", 2));
        UserDAO.saveUser(new UserItems(44, "SDD Drive", 2));
        UserDAO.saveUser(new UserItems(54, "USB Cables", 6));
        UserDAO.saveUser(new UserItems(543, "Screen", 4));
       */

/*        userDAO.saveUser(new User("Alina", "alina@wp.pl"));
        userDAO.saveUser(new User("Malina", "malian@wp.pl"));
        userDAO.saveUser(new User("Bartosz", "bartosz@wp.pl"));
        userDAO.saveUser(new User("Paweł", "pawel@wp.pl"));*/
/*
        User bartosz = userDAO.getById(9);
        bartosz.setEmail("bartosz@gmail.com");
        userDAO.update(bartosz);*/

  /*      for (int i = 0; i < 10; i++) {
            userDAO.saveUser(new User("Zbysio" + i, "zbysio" + i + "@wp.pl"));
        }
*/

        // userDAO.getAll().forEach(it -> System.out.println(it));
    }
}
