import java.util.Scanner;
public class UserService {
    private String username;
    private String password;

    public UserService() {
    }

    public UserService(String username, String password) {
        this.username = username;
        this.password = password;
    }

    /**
     *
     * @param username  用户名
     * @param password  密码
     * @throws LengthException  用户名长度应该在[6-14]之间
     */
    public void register(String username, String password) throws LengthException {
        if(username.length()<6||username.length()>14){
            throw new LengthException("用户名长度应该在之间");

        }
        else {
        this.username = username;
        this.password = password;
        System.out.println("注册成功！");
        }
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public static void main(String[] args) {
        UserService userService = new UserService();
        System.out.println("注册程序开始");
        System.out.println("=====================");
        System.out.println("请输入用户名");
        Scanner scanner = new Scanner(System.in);
        String string1 = scanner.nextLine();
        System.out.println("请输入密码");
        String string2 = scanner.nextLine();
        try {
            userService.register(string1,string2);
        } catch (LengthException e) {
            System.out.println(e.getMessage());
            e.printStackTrace();
            System.exit(0);
        }
        System.out.println(userService.getUsername());
    }
}
