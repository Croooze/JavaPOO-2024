package org.example.Exo4;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Database {
    private static final String JDBC_URL = "jdbc:mysql://localhost:3306/votre_bdd";
    private static final String USERNAME = "votre_utilisateur";
    private static final String PASSWORD = "votre_mot_de_passe";

    public static Connection getConnection() throws SQLException {
        return DriverManager.getConnection(JDBC_URL, USERNAME, PASSWORD);
    }
}
