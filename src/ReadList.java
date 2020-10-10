import java.io.*; 
import java.util.*; 
 
public class ReadList 
{ 
       public static void main(String args[]) throws Exception 
       { 
          FileInputStream fis = new FileInputStream ("list.out");
          ObjectInputStream ois =new ObjectInputStream (fis);
          Vector vector = (Vector) ois.readObject();
          System.out.println("The list file data is : "+ vector);
          ois.close();
          fis.close();
       } 
}

