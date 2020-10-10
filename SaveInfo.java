import java.io.*;
import java.util.Date;

public class SaveInfo {

  public static void main(String args[]) throws Exception {
    FileOutputStream fos = new FileOutputStream("name.out");
    ObjectOutputStream oos = new ObjectOutputStream(fos);

    UserInfo user1 = new UserInfo("Kelas TI 3D");
    UserInfo user2 = new UserInfo("Kelas TI 3E");

    oos.writeObject(user1);
    oos.writeObject(user2);
    oos.flush();
    oos.close();
    fos.close();
  }
}
