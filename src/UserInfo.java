import java.io.*; 
import java.util.*; 
 
public class UserInfo implements Serializable
{ 
    String name = null;
    
    public UserInfo (String name)
    {
        this.name=name;
    }
       public void printInfo()
       {
           System.out.println ("The Name is :"+name);
       }
}
