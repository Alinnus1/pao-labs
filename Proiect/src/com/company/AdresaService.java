package com.company;

import java.io.*;
import java.util.ArrayList;

public class AdresaService {
    public ArrayList<Adresa> readCSV(String path){
        String line = "";
        ArrayList<Adresa> ListaAdrese = new ArrayList<Adresa>();
        try {
            BufferedReader br = new BufferedReader(new FileReader(path));
            line = br.readLine();
            while((line = br.readLine()) != null) {
                String[] values = line.split(",");
                Adresa temp = new Adresa(values[0],Integer.parseInt(values[1]),values[2],Integer.parseInt(values[3]),Integer.parseInt(values[4]));
                ListaAdrese.add(temp);
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

        return ListaAdrese;
    }
    public void writeCSV(String path, ArrayList<Adresa> ListaAdrese){
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
            FileWriter csvWriter = new FileWriter(file,true);
            if (header){
                csvWriter.append("Strada,Numar,Bloc,Scara,Apartament");
                csvWriter.append("\n");
            }


            for (Adresa i :
                    ListaAdrese) {
                csvWriter.append(i.getStrada());
                csvWriter.append(",");
                csvWriter.append(String.valueOf(i.getNumar()));
                csvWriter.append(",");
                csvWriter.append(i.getBloc());
                csvWriter.append(",");
                csvWriter.append(String.valueOf(i.getScara()));
                csvWriter.append(",");
                csvWriter.append(String.valueOf(i.getApartament()));
                csvWriter.append("\n");
            }
            csvWriter.flush();
            csvWriter.close();

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
