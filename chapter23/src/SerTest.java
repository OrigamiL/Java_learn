import java.io.*;

public class SerTest {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        A a = new A(1);
        ObjectOutputStream objectOutputStream = new ObjectOutputStream(new FileOutputStream("C:\\yobot-stable\\day18\\chapter23\\src\\temp2"));
        objectOutputStream.writeObject(a);
        ObjectInputStream objectInputStream = new ObjectInputStream(new FileInputStream("C:\\yobot-stable\\day18\\chapter23\\src\\temp2"));
        A ab = (A)objectInputStream.readObject();
        System.out.println(ab);
        objectOutputStream.flush();
        objectOutputStream.close();
        objectInputStream.close();
    }
}
class A implements Serializable{
    private static final long serialVersionUID = 7413662331517334605L;
    int age;

    public A(int age) {
        this.age = age;
    }

    public int getAge() {
        return age;
    }

    @Override
    public String toString() {
        return "A{" +
                "age=" + age +
                '}';
    }

    public void setAge(int age) {
        this.age = age;
    }
}
