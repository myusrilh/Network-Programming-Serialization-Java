import java.io.*; 
import java.util.Date; 
 
public class SaveDate 
{ 
       public static void main(String args[]) throws Exception 
       { 
          FileOutputStream fos = new FileOutputStream ("date.out");
          ObjectOutputStream oos =new ObjectOutputStream (fos);
          Date date = new Date();
          oos.writeObject (date);
          oos.flush();
         //  System.out.println("The date is : "+ date);
          oos.close();
          fos.close();
       } 
}
