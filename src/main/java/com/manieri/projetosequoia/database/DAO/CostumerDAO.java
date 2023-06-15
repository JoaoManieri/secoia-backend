package com.manieri.projetosequoia.database.DAO;

import com.manieri.projetosequoia.database.DataBaseRepository;
import com.manieri.projetosequoia.model.Costumer;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class CostumerDAO {

    public boolean setCostumer(Costumer costumer) throws SQLException {
        DataBaseRepository db = new DataBaseRepository();

        try (Connection conn = DriverManager.getConnection(db.getJdbcURL(), db.getUser(), db.getPassword())) {
            String query = "INSERT INTO costumers (fantasy_name, real_name, cnpj, simples_nacional_ativo, " +
                    "registration_year, order_request, company_status, atuation_field, competitive_factor) " +
                    "VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?)";

            PreparedStatement statement = conn.prepareStatement(query);

            statement.setString(1, costumer.getFantasyName());
            statement.setString(2, costumer.getRealName());
            statement.setString(3, costumer.getCnpj());
            statement.setBoolean(4, costumer.getSimplesNacionalAtivo());
            statement.setString(5, costumer.getRegistrationYear());
            statement.setBoolean(6, costumer.getOrderRequest());
            statement.setBoolean(7, costumer.getCompanyStatus());
            statement.setString(8, costumer.getAtuationField());
            statement.setString(9, costumer.getCompetitiveFactor());

            statement.executeUpdate();


            System.out.println("Cliente inserido com sucesso.");
            return true;
        } catch (SQLException e) {
            System.err.println("Erro ao inserir cliente: " + e.getMessage());
            return false;
        }
    }

    public List<String> queryName(String query) throws SQLException {

        DataBaseRepository db = new DataBaseRepository();

        PreparedStatement statement = null;
        ResultSet resultSet = null;
        Connection conn = DriverManager.getConnection(db.getJdbcURL(), db.getUser(), db.getPassword());

        ArrayList<String> listOfNames = null;

        try {

            String sql = "SELECT * FROM costumers WHERE fantasy_name ILIKE ?";
            statement = conn.prepareStatement(sql);
            statement.setString(1, "%" + query + "%"); // Adicione o caractere curinga % para corresponder a qualquer coisa após a consulta digitada
            resultSet = statement.executeQuery();

            listOfNames = new ArrayList<>();

            while (resultSet.next()) {
                listOfNames.add(resultSet.getString("fantasy_name"));
            }

        } catch (SQLException e) {
            // Lidar com exceções do banco de dados
        } finally {
            // Fechar recursos
            if (resultSet != null) {
                resultSet.close();
            }
            if (statement != null) {
                statement.close();
            }
            if (conn != null) {
                conn.close();
            }
        }
        return listOfNames;
    }


}
