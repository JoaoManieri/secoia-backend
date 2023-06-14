package com.manieri.projetosequoia.database.DAO;

import com.manieri.projetosequoia.database.DataBaseRepository;
import com.manieri.projetosequoia.model.Costumer;
import com.manieri.projetosequoia.model.CostumerAdress;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class AdressDao {

    private final String jdbcURL = "jdbc:postgresql://newtech.cxls4eqdk0yy.sa-east-1.rds.amazonaws.com:5432/newtech";

    public Boolean setAdress(CostumerAdress adress) throws SQLException {

        try (Connection conn = DriverManager.getConnection(jdbcURL, "postgres", "MANIeri281298")) {
            if (!conn.isValid(0)) {
                System.out.println("Nao foi possivel conectar com a base de dados: " + jdbcURL);
                System.exit(0);
                return null;
            }

            String insertQuery = "INSERT INTO CostumerAddress (street, number, complement, neighborhood, city, state, CEP) " + "VALUES (?, ?, ?, ?, ?, ?, ?)";

            // Criar um objeto PreparedStatement usando a consulta de inserção
            PreparedStatement pstmt = conn.prepareStatement(insertQuery);

            // Definir os valores dos parâmetros usando os dados do objeto CostumerAdress
            pstmt.setString(1, adress.getStreet());
            pstmt.setString(2, adress.getNumber());
            pstmt.setString(3, adress.getComplement());
            pstmt.setString(4, adress.getNeighborhood());
            pstmt.setString(5, adress.getCity());
            pstmt.setString(6, adress.getState());
            pstmt.setString(7, adress.getCEP());

            // Executar a consulta de inserção
            pstmt.executeUpdate();

            // Fechar o PreparedStatement e a conexão
            pstmt.close();
            conn.close();

        } catch (SQLException e) {
            throw new RuntimeException(e);
        }

        return true;
    }
}
