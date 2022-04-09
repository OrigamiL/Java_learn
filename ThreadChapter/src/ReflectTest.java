import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class ReflectTest {
    public static void main(String[] args) throws IOException, ClassNotFoundException, InstantiationException, IllegalAccessException {
        String path = Thread.currentThread().getContextClassLoader().getResource("com/wf/java/bean/b.properties").getPath();
        System.out.println(path);
        FileInputStream fis = new FileInputStream(path);
        Properties pro = new Properties();
        pro.load(fis);
        fis.close();
        Class c = Class.forName("Account");
        Object obj = c.newInstance();
        System.out.println(pro.getProperty("name"));
    }
}
