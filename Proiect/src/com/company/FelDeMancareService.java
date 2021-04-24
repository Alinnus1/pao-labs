package com.company;

import java.io.*;
import java.util.ArrayList;

public class FelDeMancareService {

    public ArrayList<FelDeMancare> readCSV(String path) {
        String line = "";
        ArrayList<FelDeMancare> ListaFeluri = new ArrayList<FelDeMancare>();

        try {
            BufferedReader br = new BufferedReader(new FileReader(path));
            line = br.readLine();
            while ((line = br.readLine()) != null) {
                String[] values = line.split(",");
                FelDeMancare temp = new FelDeMancare(values[0], Integer.parseInt(values[1]));
                ListaFeluri.add(temp);

            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return ListaFeluri;
    }
    public void writeCSV(String path, ArrayList<FelDeMancare> ListaFeluri){
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
            if (header) {
                csvWriter.append("Nume,Pret");
                csvWriter.append("\n");
            }
            for (FelDeMancare i :
                    ListaFeluri) {
                csvWriter.append(i.getNume());
                csvWriter.append(",");
                csvWriter.append(String.valueOf(i.getPret()));
                csvWriter.append("\n");
            }
            csvWriter.flush();
            csvWriter.close();

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
