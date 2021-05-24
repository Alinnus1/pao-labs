package repository;

import config.DatabaseConfiguration;

import javax.xml.crypto.Data;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class AdresaUS {

    public void createTable() {
        String createTableSql = "CREATE TABLE IF NOT EXISTS adreses" +
                "(adresaId int PRIMARY KEY AUTO_INCREMENT, strada varchar(30)," +
                "numar int, bloc varchar(30), scara int, apartament int)";

        Connection connection = DatabaseConfiguration.getDatabaseConnection();

        try{
            Statement stmt = connection.createStatement();
            stmt.execute(createTableSql);
        }catch(SQLException e){
            e.printStackTrace();
        }
    }

    public void addAdresa() {
        String insertAdresa = "INSERT INTO adreses(strada,numar,bloc,scara,apartament) VALUES ('Niculae',32,'g3',53,22)";

        Connection connection = DatabaseConfiguration.getDatabaseConnection();

        try{
            Statement stmt = connection.createStatement();
            stmt.execute(insertAdresa);
        }catch(SQLException e){
            e.printStackTrace();
        }
    }

    public void displayAdresa(){
        String selectSql = "SELECT * FROM adreses";

        Connection connection = DatabaseConfiguration.getDatabaseConnection();

        try{
            Statement stmt = connection.createStatement();
            ResultSet resultSet = stmt.executeQuery(selectSql);
            while(resultSet.next()){
                System.out.println("Id: " + resultSet.getString(1));
                System.out.println("Strada: " + resultSet.getString(2));
                System.out.println("Numar: " + resultSet.getString(3));
                System.out.println("Bloc: " + resultSet.getString(4));
                System.out.println("Scara: " + resultSet.getString(5));
                System.out.println("Apartament: " + resultSet.getString(6));

            }
        }catch (SQLException e){
            e.printStackTrace();
        }
    }

    public void deleteTable() {
        String deleteSql = "TRUNCATE TABLE adreses";
        Connection connection = DatabaseConfiguration.getDatabaseConnection();
        try{
            Statement stmt = connection.createStatement();
            stmt.execute("SET FOREIGN_KEY_CHECKS=0");
            stmt.execute(deleteSql);
        }catch(SQLException e){
        e.printStackTrace();
        }
    }

}
