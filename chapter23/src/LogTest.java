import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;

public class LogTest {
    public static void main(String[] args) {
        try {
            Logger.logger("system start");
            File file = new File("C:\\yobot-stable\\day18\\chapter23\\src\\aaa");
            System.out.println(file.getPath());
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
