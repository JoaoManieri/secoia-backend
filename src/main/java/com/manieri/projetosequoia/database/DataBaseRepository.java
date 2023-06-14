package com.manieri.projetosequoia.database;

import java.sql.*;


public class DataBaseRepository {
    private final String jdbcURL = "jdbc:postgresql://newtech.cxls4eqdk0yy.sa-east-1.rds.amazonaws.com:5432/newtech";

    public Connection handlerRequest() {

        try (Connection conn = DriverManager.getConnection(jdbcURL, "postgres", "MANIeri281298")) {
            if (!conn.isValid(0)) {
                System.out.println("Nao foi possivel conectar com a base de dados: " + jdbcURL);
                System.exit(0);
                return null;
            }
            return conn;

        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
}
