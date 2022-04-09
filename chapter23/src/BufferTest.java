import java.io.*;

public class BufferTest {
    public static void main(String[] args) throws Exception{
        BufferedWriter bf = new BufferedWriter(new OutputStreamWriter(new FileOutputStream("C:\\yobot-stable\\day17\\chapter23\\src\\out.txt",true)));
        BufferedReader br = new BufferedReader(new InputStreamReader(new FileInputStream("C:\\yobot-stable\\day17\\chapter23\\src\\out.txt")));
        bf.write("sakdjasok sada\\n");
        System.out.println(br.readLine());

        br.close();
        bf.flush();
        bf.close();
    }
}
