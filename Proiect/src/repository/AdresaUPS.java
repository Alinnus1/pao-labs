package repository;

import com.company.Adresa;
import config.DatabaseConfiguration;

import javax.xml.crypto.Data;
import java.net.ConnectException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class AdresaUPS {

    public void insertAdresa( String strada, int numar, String bloc, int scara,int apartament){
        String insertAdresa = "INSERT INTO adreses(strada,numar,bloc,scara,apartament) VALUES (?,?,?,?,?)";

        Connection connection = DatabaseConfiguration.getDatabaseConnection();

        try{
            PreparedStatement preparedStatement = connection.prepareStatement(insertAdresa);

            preparedStatement.setString(1,strada);
            preparedStatement.setInt(2,numar);
            preparedStatement.setString(3,bloc);
            preparedStatement.setInt(4,scara);
            preparedStatement.setInt(5,apartament);

            preparedStatement.executeUpdate();

        }catch (SQLException e){
            e.printStackTrace();
        }
    }

    public static Adresa getAdresaById(int id){
        String selectSql  = " SELECT * FROM adreses WHERE adresaId=?";

        Connection connection = DatabaseConfiguration.getDatabaseConnection();
        try{
            PreparedStatement preparedStatement = connection.prepareStatement(selectSql);
            preparedStatement.setInt(1,id);

            ResultSet resultSet = preparedStatement.executeQuery();
            return mapToAdresa(resultSet);

        }catch (SQLException e){
            e.printStackTrace();
        }
        return null;
    }

    public void updateAdresa(String strada, int numar, String bloc, int scara,int apartament,int id){
        String updateAdresaSql = "UPDATE adreses SET strada=?,numar=?,bloc=?,scara=?,apartament=?, WHERE adresaId=?";

        Connection connection = DatabaseConfiguration.getDatabaseConnection();
        try{
            PreparedStatement preparedStatement = connection.prepareStatement(updateAdresaSql);

            preparedStatement.setString(1,strada);
            preparedStatement.setInt(2,numar);
            preparedStatement.setString(3,bloc);
            preparedStatement.setInt(4,scara);
            preparedStatement.setInt(5,apartament);
            preparedStatement.setInt(6,id);

            preparedStatement.executeUpdate();

        }catch (SQLException e){
            e.printStackTrace();
        }
    }

    public void deleteAdresa( int id){
        String deleteSql = "DELETE FROM adreses WHERE adresaId=?";
        Connection connection = DatabaseConfiguration.getDatabaseConnection();
        try{
            PreparedStatement preparedStatement = connection.prepareStatement(deleteSql);
            preparedStatement.setInt(1,id);

            preparedStatement.executeUpdate();
        }catch (SQLException e){
            e.printStackTrace();
        }
    }

    private static Adresa mapToAdresa(ResultSet resultSet) throws SQLException{
        if(resultSet.next()){
            return new Adresa(resultSet.getInt(1),resultSet.getString(2),resultSet.getInt(3),resultSet.getString(4),resultSet.getInt(5),resultSet.getInt(6));
        }
        return null;
    }
}
