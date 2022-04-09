import com.sun.xml.internal.bind.v2.model.core.NonElement;
import org.omg.CORBA.UNKNOWN;

import java.util.Scanner;

public class EnumTest {
    public static void main(String[] args) {
        try {
            Scanner scanner = new Scanner(System.in);
            int month = scanner.nextInt();
            Season result = judge(month);
            if (result == Season.AUTUMN){
                System.out.println("秋天");
            }
        }catch (Exception e){
            System.out.println("?");
        }

    }
    public static enum Season {
        SPRING,SUMMER,AUTUMN,WINTER
    }
    public static Season judge(int month){
        try {
            if(month < 4){
                return Season.SPRING;
            }
            if(month > 4 && month < 7){
                return Season.AUTUMN;
            }
            return Season.SUMMER;
        }catch (Exception e){
            return null;
        }
    }
}
