import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class IOTest {
    public static void main(String[] args) {
        FileInputStream fileInputStream = null;
        try {
            fileInputStream = new FileInputStream("C:\\Users\\zhezhi\\Desktop\\a");
            byte[] bytes = new byte[fileInputStream.available()];
            int byteCount = fileInputStream.read(bytes);
            System.out.print(new String(bytes,0,byteCount));
      /*      int byteCount = 0;
            while((byteCount = fileInputStream.read(bytes))!= -1)
               System.out.print(new String(bytes,0,byteCount));
*/
            /*for (byte b :
                    bytes1) {
                System.out.println((char)b);
            }*/
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (fileInputStream != null) {
                try {
                    fileInputStream.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
