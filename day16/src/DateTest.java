import java.math.BigDecimal;
import java.text.DecimalFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Random;
import java.util.Scanner;

public class DateTest {


    public static void main(String[] args) throws ParseException {
        Random random = new Random();
        Scanner scanner = new Scanner(System.in);
        System.out.println(random.nextInt(scanner.nextInt()));
        double a = 100.000001;
        double b = 23.0000000005;
        System.out.println(a+b);
        BigDecimal bigDecimal1 = new BigDecimal(100.000001);
        BigDecimal bigDecimal2 = new BigDecimal(23.0000000005);
        BigDecimal bigDecimal3 = bigDecimal1.add(bigDecimal2);
        System.out.println(bigDecimal3);
        DecimalFormat decimalFormat = new DecimalFormat("###,###,###.##");
        String s = decimalFormat.format(55555555.222);
        System.out.println("S:"+s);
        long begin = System.currentTimeMillis();
        Calendar calendar = Calendar.getInstance();
        System.out.println("??: "+calendar.getTime());
        Date date = new Date(1600000000000L);
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss SSS");
        System.out.println("date: "+simpleDateFormat.format(date));
        String time = "2008-08-08 08:08:08 888";
        SimpleDateFormat simpleDateFormat1 = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss SSS");
        Date date1 = simpleDateFormat1.parse(time);
        System.out.println("date1:"+date1);
        long end = System.currentTimeMillis();
        System.out.println(end-begin);
    }
}
