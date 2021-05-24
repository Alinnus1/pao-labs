package repository;

import com.company.FelDeMancare;
import config.DatabaseConfiguration;

import javax.xml.crypto.Data;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class FelDeMancareUPS {

    public void insertFel(String nume, int pret){
        String insertFelSql = "INSERT INTO feldemancares(nume,pret) VALUES(?,?)";

        Connection connection = DatabaseConfiguration.getDatabaseConnection();

        try{
            PreparedStatement preparedStatement = connection.prepareStatement(insertFelSql);

            preparedStatement.setString(1,nume);
            preparedStatement.setInt(2,pret);

            preparedStatement.executeUpdate();
        }catch (SQLException e){
            e.printStackTrace();
        }
    }

    public FelDeMancare getFelById(int id){
        String selectSql = "SELECT * FROM feldemancares WHERE felDeMancareId=?";

        Connection connection = DatabaseConfiguration.getDatabaseConnection();
        try{
            PreparedStatement preparedStatement = connection.prepareStatement(selectSql);
            preparedStatement.setInt(1,id);

            ResultSet resultSet = preparedStatement.executeQuery();
            return mapToFel(resultSet);
        }catch (SQLException e){
            e.printStackTrace();
        }
        return null;
    }

    public void updateFel(String nume, int pret,int id){
        String updateNumeSql = "UPDATE feldemancares SET nume=? WHERE felDeMancareId=?";
        String updatePretSql = "UPDATE feldemancares SET pret=? WHERE felDeMancareId=?";

        Connection connection = DatabaseConfiguration.getDatabaseConnection();
        try{
            PreparedStatement preparedStatement1 = connection.prepareStatement(updateNumeSql);
            PreparedStatement preparedStatement2 = connection.prepareStatement(updatePretSql);

            preparedStatement1.setString(1,nume);
            preparedStatement1.setInt(2,id);

            preparedStatement2.setInt(1,pret);
            preparedStatement2.setInt(2,id);

            preparedStatement1.executeUpdate();
            preparedStatement2.executeUpdate();
        }catch (SQLException e){
            e.printStackTrace();
        }
    }

    public void deleteFel(int id){
        String deleteSql = "DELETE FROM feldemancares WHERE felDeMancareId=?";
        Connection connection = DatabaseConfiguration.getDatabaseConnection();
        try{

            PreparedStatement preparedStatement = connection.prepareStatement(deleteSql);

            preparedStatement.setInt(1,id);

            preparedStatement.executeUpdate();

        }catch (SQLException e){
            e.printStackTrace();
        }
    }

    private FelDeMancare mapToFel(ResultSet resultSet) throws SQLException {
        if (resultSet.next()) {
            return new FelDeMancare(resultSet.getInt(1),resultSet.getString(2), resultSet.getInt(3));
        }
        return null;
    }
}
