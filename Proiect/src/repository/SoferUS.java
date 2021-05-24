package repository;

import config.DatabaseConfiguration;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class SoferUS {

    public void createTable() {
        String createTableSql = "CREATE TABLE IF NOT EXISTS sofers" +
                "(soferId int PRIMARY KEY AUTO_INCREMENT, password varchar(30),"+
                "email varchar(30),nume varchar(30),prenume varchar(30),"+
                "masina varchar(30), salariu double)";

        Connection connection = DatabaseConfiguration.getDatabaseConnection();

        try{
            Statement stmt = connection.createStatement();
            stmt.execute(createTableSql);
        }catch(SQLException e){
            e.printStackTrace();
        }
    }

    public void addSofer() {
        String insertSofer= "INSERT INTO sofers( password,email,nume,prenume,masina,salariu) VALUES (123,'gilbert@gmail.com','Alexandru','Dovlecel','Renault' 'V2',2100)";

        Connection connection = DatabaseConfiguration.getDatabaseConnection();

        try{
            Statement stmt = connection.createStatement();
            stmt.execute(insertSofer);
        }catch(SQLException e){
            e.printStackTrace();
        }
    }

    public void displaySofer(){
        String selectSql = "SELECT * FROM sofers";

        Connection connection = DatabaseConfiguration.getDatabaseConnection();

        try{
            Statement stmt = connection.createStatement();
            ResultSet resultSet = stmt.executeQuery(selectSql);
            while(resultSet.next()){
                System.out.println("Id: " + resultSet.getString(1));
                System.out.println("Password: " + resultSet.getString(2));
                System.out.println("email: " + resultSet.getString(3));
                System.out.println("Nume: " + resultSet.getString(4));
                System.out.println("Prenume: " + resultSet.getString(5));
                System.out.println("Masina: " + resultSet.getString(6));
                System.out.println("Salariu: " + resultSet.getString(7));

            }
        }catch (SQLException e){
            e.printStackTrace();
        }
    }

    public void deleteTable() {
        String deleteSql = "TRUNCATE TABLE sofers";
        Connection connection = DatabaseConfiguration.getDatabaseConnection();
        try{
            Statement stmt = connection.createStatement();
            stmt.execute(deleteSql);
        }catch(SQLException e){
            e.printStackTrace();
        }
    }
}
