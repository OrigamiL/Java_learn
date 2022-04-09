import java.io.*;
import java.util.Scanner;

import static java.lang.Thread.sleep;

public class CopyIndex {
    public static void copy(String from,String to) throws IOException {
        File index = new File(from);
        File dest = new File(to);
        if (!dest.exists()) {
            dest.mkdirs();
        }//  File fileTo = new File(to);
        File[] fs = index.listFiles();// System.out.println(fs[0].getAbsolutePath());
        if (fs != null) {
            for (File f :
                    fs) {
                if(f.isDirectory()){
                    File o =new File(to + "/"+f.getName());
                    copy(f.getPath(),o.getPath());// System.out.println(f.getPath()+"  "+o.getPath());
                }
                else {
                    File fileTo = new File(to + "/" + f.getName());
                    File fileFrom = new File(f.getAbsolutePath());
                    FileInputStream fis = new FileInputStream(fileFrom);
                    FileOutputStream fos = new FileOutputStream(fileTo);
                    byte[] bytes = new byte[1024 * 1024];
                    int readCount;
                    while ((readCount = fis.read(bytes)) != -1) {
                        fos.write(bytes, 0, readCount);
                    }
                    fos.flush();
                    fos.close();
                    fis.close();
                }
            }
        }
    }
    public static void main(String[] args) {
        try {
            System.out.println("请输入复制前的文件夹");
            Scanner scanner = new Scanner(System.in);
            String string = scanner.nextLine();
            System.out.println("请输入要复制后的文件夹");
            String string1 = scanner.nextLine();
            copy(string,string1);
            System.out.println("===================");
          //  sleep(2000);
            //System.out.println("复制中");
          /*  sleep(2000);
            System.out.println("复制完成");*/
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
