import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class FileReaderTest {
    public static void main(String[] args) {
        FileReader fileReader = null;
        try {
            fileReader = new FileReader("C:\\Users\\zhezhi\\Desktop\\a");
            char[] chars = new char[3];
            int readCount;
            while((readCount = fileReader.read(chars))!= -1){
                System.out.print(new String(chars,0,readCount));
            }
        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            try {
                if (fileReader != null) {
                    fileReader.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
