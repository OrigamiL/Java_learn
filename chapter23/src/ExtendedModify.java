import java.io.File;

public class ExtendedModify {
    public static void main(String[] args) {
        File file = new File("C:/modifyTest");
        File[] fileList = file.listFiles();
        if (fileList != null) {
            for (File f :
                    fileList) {
                int index = f.getName().lastIndexOf('.');
                File newFile = new File(f.getParent() + "/" + f.getName().substring(0, index) + ".png" );
                //同名文件可能会出问题
                f.renameTo(newFile);
                System.out.println(newFile);
            }
        }
    }
}
