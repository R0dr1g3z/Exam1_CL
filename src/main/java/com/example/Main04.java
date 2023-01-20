package com.example;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class Main04 {
    public static void main(String[] args) throws SQLException {
        printBooksTitle();
    }

    private static void printBooksTitle() throws SQLException {
        List<Book> books = new ArrayList<>();
        try (Connection connection = DbUtil.connect("exam1")) {
            String query = "SELECT * FROM books";
            PreparedStatement preparedStatement = connection.prepareStatement(query);
            ResultSet resultSet = preparedStatement.executeQuery();
            while (resultSet.next()) {
                int id = resultSet.getInt(1);
                String title = resultSet.getString(2);
                String author = resultSet.getString(3);
                String isbn = resultSet.getString(4);
                books.add(new Book(id, title, author, isbn));
            }
        }
        for (Book b : books) {
            System.out.println(b.getTitle());
        }
    }
}
