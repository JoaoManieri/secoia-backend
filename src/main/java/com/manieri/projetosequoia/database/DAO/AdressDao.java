package com.manieri.projetosequoia.database.DAO;

import com.manieri.projetosequoia.database.DataBaseRepository;
import com.manieri.projetosequoia.model.Costumer;
import com.manieri.projetosequoia.model.CostumerAdress;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.ArrayList;

public class AdressDao {

    public Boolean setAdress(ArrayList<CostumerAdress> adressesList, int costumerId) throws SQLException {
        DataBaseRepository db = new DataBaseRepository();

        PreparedStatement pstmt = null;
        try(Connection conn = DriverManager.getConnection(db.getJdbcURL(), db.getUser(), db.getPassword())) {

            if (!conn.isValid(0)) {
                System.out.println("Nao foi possivel conectar com a base de dados:");
                System.exit(0);
            }

            for(CostumerAdress adress : adressesList){

                String insertQuery = "INSERT INTO public.costumer_address(street, \"number\", complement, neighborhood, city, state, cep, costomer_id) " +
                        "VALUES (?, ?, ?, ?, ?, ?, ?, ?);";


                pstmt = conn.prepareStatement(insertQuery);
                pstmt.setString(1, adress.getStreet());
                pstmt.setString(2, adress.getNumber());
                pstmt.setString(3, adress.getComplement());
                pstmt.setString(4, adress.getNeighborhood());
                pstmt.setString(5, adress.getCity());
                pstmt.setString(6, adress.getState());
                pstmt.setString(7, adress.getCEP());
                pstmt.setInt(8, costumerId);

                pstmt.executeUpdate();

            }

            return true;

        } finally {
            if (pstmt != null) {
                pstmt.close();
            }
        }
    }
}
