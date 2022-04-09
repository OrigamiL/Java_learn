import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class IOPropertiesTest {
    public static void main(String[] args) throws IOException, ClassNotFoundException, InstantiationException, IllegalAccessException {
        InputStream in = Thread.currentThread().getContextClassLoader().getResourceAsStream("com/wf/java/bean/b.properties");
        Properties properties = new Properties();
        properties.load(in);
        assert in != null;
        in.close();
        Class c = Class.forName(properties.getProperty("ClassName"));
        c.newInstance();
    }
}
