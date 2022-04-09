import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class IOProTest {
    public static void main(String[] args) throws IOException {
        FileInputStream fis = new FileInputStream("C:\\yobot-stable\\day18\\chapter23\\src\\config.properties");
        Properties properties = new Properties();
        properties.load(fis);
        System.out.println(properties.getProperty("password"));
        fis.close();
    }
}
