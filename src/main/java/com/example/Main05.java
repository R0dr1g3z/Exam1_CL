package com.example;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

public class Main05 {
    private static final String QUERY_TITLE = "SELECT id,title FROM books";
    private static final String QUERY_BOOK = "SELECT * FROM books WHERE id = ?";

    public static void main(String[] args) throws SQLException {
        selectBook();
    }

    private static void selectBook() throws SQLException {
        Scanner scan = new Scanner(System.in);
        try (PreparedStatement preparedStatement = DbUtil.connect("exam1").prepareStatement(QUERY_TITLE)) {
            ResultSet resultSet = preparedStatement.executeQuery();
            while (resultSet.next()) {
                System.out.print("ID: " + resultSet.getString("id") + " ");
                System.out.print("Title: " + resultSet.getString("title") + "\n");
            }
        }

        System.out.println("Select ID");
        int id = scan.nextInt();

        try (PreparedStatement preparedStatement = DbUtil.connect("exam1").prepareStatement(QUERY_BOOK)) {
            preparedStatement.setInt(1, id);
            ResultSet resultSet = preparedStatement.executeQuery();
            while (resultSet.next()) {
                System.out.println("Title: " + resultSet.getString("title"));
                System.out.println("Author: " + resultSet.getString("author"));
                System.out.println("ISBN: " + resultSet.getString("isbn"));
            }
        }
    }
}
