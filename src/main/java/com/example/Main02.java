package com.example;

public class Main02 {
    private static final String QUERY1 = "SELECT * FROM students WHERE firstName = 'Jan' AND lastName = 'Kowalski'";
    private static final String QUERY2 = "SELECT * FROM exercises ORDER BY points DESC LIMIT 1";
    private static final String QUERY3 = "SELECT * FROM exercises WHERE title LIKE 'w pli%'";
    private static final String QUERY4 = "SELECT DISTINCT email,firstName,lastName FROM students JOIN students_exercises ON students.id=student_id";
    // private static final String QUERY5 = "Get all student data and the number of assignments assigned to them.";
    private static final String QUERY6 = "SELECT * FROM students LEFT JOIN students_exercises se ON students.id=student_id WHERE exercise_id IS NULL";
    private static final String QUERY7 = "SELECT * FROM exercises WHERE created BETWEEN '2020-01-01' AND '2020-12-31'";
}
