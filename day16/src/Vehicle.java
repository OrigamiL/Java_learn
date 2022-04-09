public class Vehicle {
    private int speed;
    private int size;

    public Vehicle() {
    }

    public Vehicle(int speed, int size) {
        this.speed = speed;
        this.size = size;
    }

    public void move(){
        System.out.println("交通工具正在移动！");
    }

    public void speedDown(int speed){
        if(this.speed > speed){
            this.speed -= speed;
            System.out.println("汽车减速"+speed+"，当前速度为"+this.speed);
        }
        if(this.speed == speed){
            this.speed = 0;
            System.out.println("汽车减速"+speed+"，汽车不动啦");
        }
        if(this.speed < speed){
            System.out.println("刹车过快，车翻了");
        }
    }

    public void speedUp(int speed){
        this.speed += speed;
        System.out.println("汽车加速"+speed+"，当前速度为"+this.speed);
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public static void main(String[] args) {
        Vehicle vehicle = new Vehicle(60,50);
        System.out.println("汽车的速度是"+vehicle.getSpeed()+"汽车的体积是"+vehicle.getSize());
        vehicle.move();
        vehicle.speedUp(50);
        vehicle.speedDown(40);
        vehicle.speedDown(100);
        int a = 30;
        int b = 20;
        System.out.println(a/b+" "+a%b);

    }
}
