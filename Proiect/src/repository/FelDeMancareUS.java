package repository;

import config.DatabaseConfiguration;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class FelDeMancareUS {


    public void createTable() {
        String createTableSql = "CREATE TABLE IF NOT EXISTS feldemancares" +
                "(felDeMancareId int PRIMARY KEY AUTO_INCREMENT, nume varchar(30),"+
                "pret int)";

        Connection connection = DatabaseConfiguration.getDatabaseConnection();

        try{
            Statement stmt = connection.createStatement();
            stmt.execute(createTableSql);
        }catch(SQLException e){
            e.printStackTrace();
        }
    }

    public void addFel() {
        String insertFel = "INSERT INTO feldemancares ( nume, pret) VALUES ('Omleta',20)";

        Connection connection = DatabaseConfiguration.getDatabaseConnection();

        try{
            Statement stmt = connection.createStatement();
            stmt.execute(insertFel);
        }catch(SQLException e){
            e.printStackTrace();
        }
    }

    public void displayFel(){
        String selectSql = "SELECT * FROM feldemancares";

        Connection connection = DatabaseConfiguration.getDatabaseConnection();

        try{
            Statement stmt = connection.createStatement();
            ResultSet resultSet = stmt.executeQuery(selectSql);
            while(resultSet.next()){
                System.out.println("Id: " + resultSet.getString(1));
                System.out.println("Nume: " + resultSet.getString(2));
                System.out.println("Pret: " + resultSet.getString(3));


            }
        }catch (SQLException e){
            e.printStackTrace();
        }
    }

    public void deleteTable() {
        String deleteSql = "TRUNCATE TABLE feldemancares";
        Connection connection = DatabaseConfiguration.getDatabaseConnection();
        try{
            Statement stmt = connection.createStatement();
            stmt.execute(deleteSql);
        }catch(SQLException e){
            e.printStackTrace();
        }
    }

}
