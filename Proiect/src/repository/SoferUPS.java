package repository;

import com.company.Adresa;
import com.company.Sofer;
import config.DatabaseConfiguration;

import javax.naming.ldap.PagedResultsControl;
import javax.xml.crypto.Data;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class SoferUPS {

    public void insertSofer(String password,String email, String nume, String prenume, String masina, double salariu){
        String insertSofer = "INSERT INTO sofers(password,email,nume,prenume,masina,salariu) VALUES (?,?,?,?,?,?)";

        Connection connection = DatabaseConfiguration.getDatabaseConnection();

        try{
            PreparedStatement preparedStatement = connection.prepareStatement(insertSofer);

            preparedStatement.setString(1,password);
            preparedStatement.setString(2,email);
            preparedStatement.setString(3,nume);
            preparedStatement.setString(4,prenume);
            preparedStatement.setString(5,masina);
            preparedStatement.setDouble(6,salariu);

            preparedStatement.executeUpdate();
        }catch (SQLException e){
            e.printStackTrace();
        }
    }

    public Sofer getSoferById (int id){
        String selectSql = "SELECT * FROM sofers WHERE soferId=?";

        Connection connection = DatabaseConfiguration.getDatabaseConnection();

        try{
            PreparedStatement preparedStatement = connection.prepareStatement(selectSql);
            preparedStatement.setInt(1,id);

            ResultSet resultSet = preparedStatement.executeQuery();
            return mapToSofer(resultSet);

        }catch (SQLException e){
            e.printStackTrace();
        }
        return null;
    }

    public  void updateSofer(String password,String email, String nume, String prenume, String masina, double salariu, int id){
        String updateSoferSql = "UPDATE sofers SET password=?,email=?,nume=?,prenume=?,masina=?,salariu=? WHERE soferId=?";

        Connection connection = DatabaseConfiguration.getDatabaseConnection();

        try{
            PreparedStatement preparedStatement = connection.prepareStatement(updateSoferSql);

            preparedStatement.setString(1,password);
            preparedStatement.setString(2,email);
            preparedStatement.setString(3,nume);
            preparedStatement.setString(4,prenume);
            preparedStatement.setString(5,masina);
            preparedStatement.setDouble(6,salariu);
            preparedStatement.setInt(7,id);

            preparedStatement.executeUpdate();

        }catch (SQLException e){
            e.printStackTrace();
        }
    }

    public void deleteSofer (int id){
        String deleteSql = "DELETE FROM sofers WHERE soferId=? ";
        Connection connection = DatabaseConfiguration.getDatabaseConnection();

        try{
            PreparedStatement preparedStatement = connection.prepareStatement(deleteSql);
            preparedStatement.setInt(1,id);

            preparedStatement.executeUpdate();

        }catch (SQLException e){
            e.printStackTrace();
        }
    }

    private Sofer mapToSofer(ResultSet resultSet) throws SQLException{
        if(resultSet.next()){
            return  new Sofer(resultSet.getInt(1),resultSet.getString(2),
            resultSet.getString(3),
            resultSet.getString(4),
            resultSet.getString(5),
            resultSet.getString(6),
            resultSet.getDouble(7));
        }
        return null;
    }

}
