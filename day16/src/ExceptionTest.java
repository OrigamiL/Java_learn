public class ExceptionTest {
    public static void main(String[] args) {
        int m = m();
        System.out.println("m:"+m);
    }
    public static int m(){
        int i = 1;
        try {
            return i;
        }finally {
            i++;
            System.out.println("i:"+i);
        }
    }
}
