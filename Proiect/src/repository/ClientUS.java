package repository;

import config.DatabaseConfiguration;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class ClientUS {

    public void createTable() {
        String createTableSql = "CREATE TABLE IF NOT EXISTS clients" +
                "(clientId int PRIMARY KEY AUTO_INCREMENT, password varchar(30),"+
                "email varchar(30),nume varchar(30),prenume varchar(30),"+
                "adresaId int , CONSTRAINT fk_adresa FOREIGN KEY (adresaId) REFERENCES adreses(adresaId) ON DELETE CASCADE ON UPDATE CASCADE)";

        Connection connection = DatabaseConfiguration.getDatabaseConnection();

        try{
            Statement stmt = connection.createStatement();
            stmt.execute(createTableSql);
        }catch(SQLException e){
            e.printStackTrace();
        }
    }

    public void addClient() {
        String insertSofer= "INSERT INTO clients( password,email,nume,prenume,adresaId) VALUES (123,'test@gmail.com','Maria','Frant',1)";

        Connection connection = DatabaseConfiguration.getDatabaseConnection();

        try{
            Statement stmt = connection.createStatement();
            stmt.execute(insertSofer);
        }catch(SQLException e){
            e.printStackTrace();
        }
    }

    public void displayClient(){
        String selectSql = "SELECT * FROM clients";

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
                System.out.println("AdresaId: " + resultSet.getString(6));

            }
        }catch (SQLException e){
            e.printStackTrace();
        }
    }

    public void deleteTable() {
        String deleteSql = "TRUNCATE TABLE clients";
        Connection connection = DatabaseConfiguration.getDatabaseConnection();
        try{
            Statement stmt = connection.createStatement();
            stmt.execute(deleteSql);
        }catch(SQLException e){
            e.printStackTrace();
        }
    }
}
