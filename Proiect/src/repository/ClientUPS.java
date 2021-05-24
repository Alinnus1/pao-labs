package repository;

import com.company.Client;
import config.DatabaseConfiguration;

import javax.xml.crypto.Data;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class ClientUPS {

    public void insertClient(String password,String email, String nume, String prenume, int adresaId ){
        String insertClient = "INSERT INTO clients(password,email,nume,prenume,adresaId) VALUES (?,?,?,?,?)";

        Connection connection = DatabaseConfiguration.getDatabaseConnection();

        try{
            PreparedStatement preparedStatement = connection.prepareStatement(insertClient);

            preparedStatement.setString(1,password);
            preparedStatement.setString(2,email);
            preparedStatement.setString(3,nume);
            preparedStatement.setString(4,prenume);
            preparedStatement.setInt(5,adresaId);


            preparedStatement.executeUpdate();
        }catch (SQLException e){
            e.printStackTrace();
        }
    }

    public Client getClientById (int id){
        String selectSql = "SELECT * FROM clients WHERE clientId=?";
        Connection connection = DatabaseConfiguration.getDatabaseConnection();

        try{
            PreparedStatement preparedStatement = connection.prepareStatement(selectSql);
            preparedStatement.setInt(1,id);

            ResultSet resultSet = preparedStatement.executeQuery();
            return mapToClient(resultSet);

        }catch (SQLException e){
            e.printStackTrace();
        }
        return null;
    }

    public void updateClient(String password,String email, String nume, String prenume, int adresaId , int id){
        String updateClientSql = "UPDATE clients SET password=?,email=?,nume=?,prenume=?,adresaId=? WHERE clientId=?";

        Connection connection = DatabaseConfiguration.getDatabaseConnection();

        try{
            PreparedStatement preparedStatement = connection.prepareStatement(updateClientSql);
            preparedStatement.setString(1,password);
            preparedStatement.setString(2,email);
            preparedStatement.setString(3,nume);
            preparedStatement.setString(4,prenume);
            preparedStatement.setInt(5,adresaId);
            preparedStatement.setInt(6,id);

            preparedStatement.executeUpdate();
        }catch (SQLException e){
            e.printStackTrace();
        }
    }

    public void deleteClient(int id){
        String deleteSql = "DELETE FROM clients WHERE clientId=?";

        Connection connection = DatabaseConfiguration.getDatabaseConnection();

        try{
            PreparedStatement preparedStatement = connection.prepareStatement(deleteSql);
            preparedStatement.setInt(1,id);

            preparedStatement.executeUpdate();

        }catch (SQLException e){
            e.printStackTrace();
        }

    }

    private Client mapToClient(ResultSet resultSet) throws SQLException{
        if (resultSet.next()){
            return new Client(resultSet.getInt(1),resultSet.getString(2),
                    resultSet.getString(3),
                    resultSet.getString(4),
                    resultSet.getString(5),
                    resultSet.getInt(6));
        }
        return null;
    }


}
