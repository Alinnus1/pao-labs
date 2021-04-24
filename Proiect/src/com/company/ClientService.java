package com.company;

import java.io.*;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

public class ClientService {

    public void addComanda(Client client, Comanda comanda) {
        SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
        Date date = new Date();
        AuditService audit = new AuditService();
        audit.writeCSV("addComanda",formatter.format(date));

        ArrayList<Comanda> comenzi = client.getComenzi();
        comenzi.add(comanda);
        client.setComenzi(comenzi);

    }

    public void rmvComanda(Client client, Comanda comanda) {
        SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
        Date date = new Date();
        AuditService audit = new AuditService();
        audit.writeCSV("rmvComanda",formatter.format(date));

        ArrayList<Comanda> comenzi = client.getComenzi();
        comenzi.remove(comanda);
        client.setComenzi(comenzi);
    }

    public ArrayList<Client> readCSV(String path){
        ArrayList<Client> ListaClienti = new ArrayList<Client>();
        String line = "";
        try {
            BufferedReader br = new BufferedReader(new FileReader(path));
            line = br.readLine();
            while((line = br.readLine()) != null) {
                String[] values = line.split(",");
                Client temp = new Client(values[0],values[1],values[2],values[3]);
                ListaClienti.add(temp);

            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return ListaClienti;
    }
    public void writeCSV(String path, ArrayList<Client> ListaClienti){
        File file = new File(path);
        boolean header = false;
        boolean result;
        try{
            result = file.createNewFile();
            if(result)      // test if successfully created a new file
            {
                System.out.println("file created "+file.getCanonicalPath()); //returns the path string
                header = true;
            }
            else
            {
                System.out.println("File already exist at location: "+file.getCanonicalPath());
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        try{
            FileWriter csvWriter = new FileWriter(file,true);
            if(header){
                csvWriter.append("Password,Email,Nume,Prenume");
                csvWriter.append("\n");
            }
            for (Client i:
                    ListaClienti) {
                csvWriter.append(i.getPassword());
                csvWriter.append(",");
                csvWriter.append(i.getEmail());
                csvWriter.append(",");
                csvWriter.append(i.getNume());
                csvWriter.append(",");
                csvWriter.append(i.getPrenume());
                csvWriter.append("\n");
            }
            csvWriter.flush();
            csvWriter.close();

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
