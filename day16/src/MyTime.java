import java.nio.charset.StandardCharsets;
import java.util.Scanner;

public class MyTime {
    private int hour;
    private int minute;
    private int second;

    public MyTime() {
    }

    public MyTime(int hour, int minute, int second) {
        this.hour = hour;
        this.minute = minute;
        this.second = second;
    }

    public void display(){
        System.out.println("时间："+hour+"时 "+minute+"分 "+second+"秒");
    }

    public void addSecond(int sec){
        minute += (second + sec) / 60;
        second = (second + sec) % 60;
        hour += minute / 60;
        minute = minute % 60;
    }

    public void addMinute(int min){
        minute = (minute + min) % 60;
        hour += (minute + min) / 60;
    }

    public void  addHour(int hou){
        hour += hou;
    }

    public static void main(String[] args) {

        int i = 1;
        String ss = String.valueOf(i);

        MyTime myTime = new MyTime(0,0,0);
        Scanner scanner = new Scanner(System.in);
        System.out.print("请输入时间: ");
        String strings = scanner.nextLine();
        StringBuffer stringBuffer = new StringBuffer(20);//length :20
        stringBuffer.append(strings);
        String sss = stringBuffer.toString();
        System.out.println("SSS："+sss);
        String string = strings.replaceAll(" ","");
        System.out.println("string："+string);
        int time = Integer.parseInt(string.substring(0,string.length()-1));
        String t = string.substring(string.length()-1);

        if(t.equals("秒")){
            myTime.addSecond(time);
        }
        if(t.equals("分") ){
            myTime.addMinute(time);
        }
        if(t.equals("时")){
            myTime.addHour(time);
        }
        myTime.display();

    }

    public String getSz(String str){
        return str.replaceAll("[a-zA-Z]","");
    }
    public String getZf(String str){
        return str.replaceAll("[0-9]","");
    }
   /* public String getHz(String str){
        return str.replaceAll("![u4e00-u9fa5]","");
    }*/
}
