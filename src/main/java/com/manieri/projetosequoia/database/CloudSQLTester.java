package com.manieri.projetosequoia.database;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class CloudSQLTester {

        List<String> subscriblers = new ArrayList<>();

        public List<String> handlerRequest() {

            String jdbcURL = "jdbc:postgresql://newtech.cxls4eqdk0yy.sa-east-1.rds.amazonaws.com:5432/newtech";


            try (Connection conn = DriverManager.getConnection(jdbcURL, "postgres", "MANIeri281298")) {
                if (!conn.isValid(0)) {
                    System.out.println("Nao foi possivel conectar com a base de dados: " + jdbcURL);
                    System.exit(0);
                }
                PreparedStatement selectStatement = conn.prepareStatement("select * from usuarios");
                ResultSet rs = selectStatement.executeQuery();

                while (rs.next()){
                    String nome = rs.getString("username");
                    System.out.println(nome);

                    subscriblers.add(nome);
                }

            } catch (SQLException e) {
                throw new RuntimeException(e);
            }

            return subscriblers;
        }



}
