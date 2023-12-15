package org.example.dao;

import org.example.entity.User;
import org.example.entity.UserItems;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.LinkedList;
import java.util.List;

import static org.example.DBConnector.createDBConnection;

public class UserDAO {

    private static final String TABLE_NAME = "user_items";

    public UserDAO() {
        Connection connection = createDBConnection();
        Statement statement = null;
        try {
            statement = connection.createStatement();
            // TWORZENIE TABELI
            String sql = "CREATE TABLE IF NOT EXISTS " + TABLE_NAME + " (" +
                    "id BIGINT AUTO_INCREMENT PRIMARY KEY," +
                    "user_id INT," +
                    "item_name VARCHAR(50) NOT NULL," +
                    "quantity INT NOT NULL);";

            statement.executeUpdate(sql);
            statement.close();
            connection.close();
            System.out.println("User table ready!");
        } catch (SQLException e) {
            System.out.println("Błąd podczas tworzenia statement " + e.getMessage());
        }
    }

    public static void saveUser(UserItems user) {
        Connection connection = createDBConnection();
        try {
            Statement statement = connection.createStatement();
            // INSERT DO BAZY
            String sql = "INSERT INTO " + TABLE_NAME + " (user_id, item_name, quantity) VALUES ('" +
                    user.getUserId() +
                    "','" +
                    user.getItemName() +
                    "','" +
                    user.getQuantity() +
                    "');";

            statement.executeUpdate(sql);
            statement.close();
            connection.close();
            System.out.println("User saved!");

        } catch (SQLException e) {
            System.out.println("Błąd podczas tworzenia statement " + e.getMessage());
        }
    }

    public UserItems getById(long id) {
        Connection connection = createDBConnection();
        UserItems user = new UserItems();
        try {
            Statement statement = connection.createStatement();
            // SELECT
            String sql = "SELECT * FROM user_items WHERE id = " + id + ";";
            ResultSet resultSet = statement.executeQuery(sql);

            while (resultSet.next()) {
                user.setId(resultSet.getLong("id"));
                user.setUserId(resultSet.getInt("user_id"));
                user.setItemName(resultSet.getString("item_name"));
                user.setQuantity(resultSet.getInt("quantity"));
                break;
            }
            statement.close();
            connection.close();

        } catch (SQLException e) {
            System.out.println("Błąd podczas tworzenia statement " + e.getMessage());
        }
        return user;
    }

    public List<User> getAll() {
        Connection connection = createDBConnection();
        List<User> userList = new LinkedList<>();

        try {
            Statement statement = connection.createStatement();
            // SELECT ALL
            String sql = "SELECT * FROM users;";
            ResultSet resultSet = statement.executeQuery(sql);

            while (resultSet.next()) {
                User tempUser = new User();
                tempUser.setId(resultSet.getLong("id"));
                tempUser.setEmail(resultSet.getString("email"));
                tempUser.setName(resultSet.getString("name"));
                userList.add(tempUser);
            }
            statement.close();
            connection.close();

        } catch (SQLException e) {
            System.out.println("Błąd podczas tworzenia statement " + e.getMessage());
        }
        return userList;
    }

    public void deleteById(long id) {
        Connection connection = createDBConnection();
        try {
            Statement statement = connection.createStatement();
            // DELETE
            String sql = "DELETE FROM user_items WHERE id = " + id + ";";
            statement.executeUpdate(sql);

            statement.close();
            connection.close();
            System.out.println("User deleted!");

        } catch (SQLException e) {
            System.out.println("Błąd podczas tworzenia statement " + e.getMessage());
        }
    }

    public void update(UserItems user) {
        Connection connection = createDBConnection();
        try {
            Statement statement = connection.createStatement();
            // UPDATE
            String sql = "UPDATE " + TABLE_NAME +
                    " SET user_id = '" + user.getUserId() + "', " +
                    "item_name = '" + user.getItemName() + "', " +
                    "quantity = '" + user.getQuantity() + "' " +
                    "WHERE id = " + user.getId() + ";";
            statement.executeUpdate(sql);

            statement.executeUpdate(sql);

            statement.close();
            connection.close();
            System.out.println("User updated!");

        } catch (SQLException e) {
            System.out.println("Błąd podczas tworzenia statement " + e.getMessage());
        }
    }
}
