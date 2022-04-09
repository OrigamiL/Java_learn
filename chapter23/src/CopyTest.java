import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class CopyTest {
    public static void main(String[] args) {
        FileReader reader = null;
        FileWriter writer = null;
        try {
            reader = new FileReader("C:\\yobot-stable\\day18\\chapter23\\src\\in.txt");
            writer = new FileWriter("C:\\yobot-stable\\day18\\chapter23\\src\\out.txt");
            char[] chars = new char[10];
            int readCount;
            while ((readCount = reader.read(chars)) != -1){
                writer.write(chars,0,readCount);
            }
            writer.flush();
        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            if (writer != null) {
                try {
                    writer.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            if (reader != null) {
                try {
                    reader.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
