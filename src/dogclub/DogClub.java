/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package dogclub;
import java.util.*;
import java.io.*;
/**
 *
 * @author dkosyakov
 */

class Breed{
    static ArrayList<String> breeds=new ArrayList<>(Arrays.asList(
            "Unknown", "Terrier", "Wolf", "Bulldog", "Ovcharka", "Chau-chau"));
}

class Dog{
    String dogName, masterName, phonePrefix, phone;
    Integer breed;
    public String toString(){return this.dogName;}
}
public class DogClub {
    static void readFile()throws IOException{
        int countLines=0;
        BufferedReader brCount=new BufferedReader(new FileReader("doglist.txt"));
        while (brCount.readLine()!=null) countLines++;
        brCount.close();
        fileContents=new String[countLines];
        BufferedReader brRead=new BufferedReader(new FileReader("doglist.txt"));
        for (int i=0;i<countLines;i++) fileContents[i]=brRead.readLine();
        brRead.close();
    }
    
    static final byte NUMBER_OF_FIELDS=5;
    static String[] fileContents, arrForList;
    static ArrayList<Dog> dogs=new ArrayList<>();
    
    static void setDogsFromStrings(String[] arr, ArrayList<Dog> l){
        l.ensureCapacity(arr.length/NUMBER_OF_FIELDS);
        for(int i=0;i<arr.length;i+=NUMBER_OF_FIELDS){
            int tech=i/NUMBER_OF_FIELDS;
            l.add(new Dog());
            l.get(tech).dogName=arr[i];
            l.get(tech).breed=new Integer(arr[i+1]);
            l.get(tech).masterName=arr[i+2];
            l.get(tech).phonePrefix=arr[i+3];
            l.get(tech).phone=arr[i+4];
        }
    }
    
    static void saveFile(int dogCount) throws IOException{
        try{
            FileWriter fWriter=new FileWriter("doglist.txt");
            PrintWriter pWriter=new PrintWriter(fWriter);
            String[] arW=new String[dogCount*NUMBER_OF_FIELDS];
            for(int i=0; i<dogCount*NUMBER_OF_FIELDS;i+=NUMBER_OF_FIELDS){
                int tech=i/NUMBER_OF_FIELDS;
                arW[i]=dogs.get(tech).dogName;
                pWriter.printf("%s"+"%n", arW[i]);
                arW[i+1]=dogs.get(tech).breed.toString();
                pWriter.printf("%s"+"%n", arW[i+1]);
                arW[i+2]=dogs.get(tech).masterName;
                pWriter.printf("%s"+"%n", arW[i+2]);
                arW[i+3]=dogs.get(tech).phonePrefix;
                pWriter.printf("%s"+"%n", arW[i+3]);
                arW[i+4]=dogs.get(tech).phone;
                pWriter.printf("%s"+"%n", arW[i+4]);
            }
            pWriter.close();            
        }
        catch (IOException e) {System.out.println(e.getMessage());}
    }
    
    static void setArrForList(){
        arrForList=new String[dogs.size()];
        for (int i=0;i<dogs.size();i++) {arrForList[i]=dogs.get(i).dogName;}        
    }
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        try{readFile();}
        catch (IOException e){System.out.println(e.getMessage());}
        setDogsFromStrings(fileContents, dogs);
        
        setArrForList();

        DogClubJFrame.main(new String[0]);
    }
    
}
