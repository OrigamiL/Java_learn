import java.io.*;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Logger {
    public static void logger(String msg) throws IOException {
        PrintStream printStream = new PrintStream(new FileOutputStream("C:\\yobot-stable\\day18\\chapter23\\src\\log.txt",true));
        System.setOut(printStream);
        Date date = new Date();
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss SSS");
        String time = simpleDateFormat.format(date);
        System.out.println(time+": "+msg);


    }
}

