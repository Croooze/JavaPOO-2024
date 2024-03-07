package org.example.Exo4;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class DAO {
    private Connection connection;

    public DAO() {
        try {
            this.connection = Database.getConnection();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public void create(Person person) {
    }

    public Person read(int id) {
        return null;
    }

    public void update(Person person) {
    }

    public void delete(int id) {
    }

    public List<Person> getAll() {
        return new ArrayList<>();
    }
}

