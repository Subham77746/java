//File-Output...
import java.io.*;
class file{
    public static void main(String args[]){
        try{
        FileOutputStream fos = new FileOutputStream("practice.txt");
        String x = "Subham";
        fos.write(x.getBytes());
        fos.close();
        System.out.println("File written Success...");
        } catch(IOException e){
            System.out.println("ErroR Ocuurs...");
        }
    }
}

//File-Input...
import java.io.*;
public class file {
    public static void main(String args[]){
    try{
        FileInputStream fis = new FileInputStream("practice.txt");
        int x;
        while((x = fis.read()) != -1){
        System.out.println((char) x); //s  u  b  h  a  m...
        }
        fis.close();
        }catch(IOException e){
            System.out.println("error"+e.getMessage());
        }
}
}

//File Reader...
import java.io.*;
class test{
    public static void main(String args[]){
        try{
        FileReader fr = new FileReader("practice.txt");
        int ch;
        while((ch = fr.read()) != -1){
            System.out.println((char) ch);
        fr.close();
        }      
        } catch (Exception e) {
            System.out.println("Error");
        }
        
    }
}
    
//File Writer...
import java.io.*;
class fileWriter{
    public static void main(String args[]){
        String x = "hello subham";

        try(FileWriter fw = new FileWriter("practice.txt")){
            fw.write(x);
            System.out.println("written success");
        }
        catch(IOException e){
            System.out.println("Error");
            e.printStackTrace();
        }
    }
}

//File-Writer...
import java.io.*;import java.io.IOException;
class file {
    public static void main(String args[]) {
        String x = "hello subham";

        try (FileWriter fw = new FileWriter("practice.txt")) {
            fw.write(x);
            System.out.println("Written successfully");
        }
        catch (IOException e) {
            System.out.println("Error");
            e.printStackTrace();
        }
    }
}

//Input-Stream Reader...
import java.io.IOException;
import java.io.InputStreamReader;
class file{
    public static void main(String args[]){
        try{
            InputStreamReader fsr = new InputStreamReader(System.in);
            int data = fsr.read();
            System.out.println("Hello");
        }catch(IOException e){
            System.out.println("Error");
        }
    }
}
