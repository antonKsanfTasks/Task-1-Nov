package jm.task.core.jdbc.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Util {
    // реализуйте настройку соеденения с БД

    private final static String dbDriver = "org.postgresql.Driver";
    private final static String  dbURL = "jdbc:postgresql://localhost:5432/postgres";
    private final static String  dbUser = "postgres";
    private final static String  dbPass = "1234";

    public static Connection openConnection() throws SQLException {
        try {
            Class.forName(dbDriver);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return DriverManager.getConnection(dbURL, dbUser, dbPass);
    }
}
