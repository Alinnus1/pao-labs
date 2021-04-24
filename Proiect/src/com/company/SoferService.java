package com.company;

import java.io.*;
import java.security.KeyStore;
import java.util.ArrayList;

public class SoferService {
    public ArrayList<Sofer> readCSV (String path){
        String line = "";
        ArrayList<Sofer> ListaSoferi = new ArrayList<Sofer>();
        try {
            BufferedReader br = new BufferedReader(new FileReader(path));
            line = br.readLine();
            while((line = br.readLine()) != null) {
                String[] values = line.split(",");
                Sofer temp = new Sofer(values[0],values[1],values[2],values[3],values[4],Double.parseDouble(values[5]));
                ListaSoferi.add(temp);
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return ListaSoferi;
    }
    public void writeCSV(String path, ArrayList<Sofer> ListaSoferi){
        File file = new File(path);
        boolean header=false;
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
            FileWriter csvWriter = new FileWriter(file, true);
            if(header){
                csvWriter.append("Password,Email,Nume,Prenume,Masina,Salariu");
                csvWriter.append("\n");
            }
            for (Sofer i :
                    ListaSoferi) {
                csvWriter.append(i.getPassword());
                csvWriter.append(",");
                csvWriter.append(i.getEmail());
                csvWriter.append(",");
                csvWriter.append(i.getNume());
                csvWriter.append(",");
                csvWriter.append(i.getPrenume());
                csvWriter.append(",");
                csvWriter.append(i.getMasina());
                csvWriter.append(",");
                csvWriter.append(String.valueOf(i.getSalariu()));
                csvWriter.append("\n");
            }
            csvWriter.flush();
            csvWriter.close();

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
