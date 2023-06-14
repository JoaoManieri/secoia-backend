package com.manieri.projetosequoia.database;

import java.sql.*;


public class DataBaseRepository {
    private final String jdbcURL = "jdbc:postgresql://newtech.cxls4eqdk0yy.sa-east-1.rds.amazonaws.com:5432/newtech";
    private final String user = "postgres";
    private final String password = "MANIeri281298";

    public String getJdbcURL() {
        return jdbcURL;
    }
    public String getPassword() {
        return password;
    }
    public String getUser() {
        return user;
    }
}
