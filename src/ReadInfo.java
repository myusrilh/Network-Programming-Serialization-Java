import java.io.*;
import java.util.Date;

public class ReadInfo {

  public static void main(String args[]) throws Exception {
    FileInputStream fis = new FileInputStream("name.out");
    ObjectInputStream ois = new ObjectInputStream(fis);

    UserInfo user1 = (UserInfo) ois.readObject();
    UserInfo user2 = (UserInfo) ois.readObject();

    user1.printInfo();
    user2.printInfo();
    ois.close();
    fis.close();
  }
}
