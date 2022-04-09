public class Hotel implements Receptionist {
    private int floor;
    private int num;
    private Room[][] rooms;

    public Hotel() {
    }

    public Hotel(int floor, int num) {
        this.floor = floor;
        this.num = num;

    }

    @Override
    public void reserve(int floor, int num) {
        if (rooms[floor][num].isEmpty()){
            rooms[floor][num].setEmpty(false);
            System.out.println("预定成功，您的房间号为:"+rooms[floor][num].getId());
            return;
        }
        if(!rooms[floor][num].isEmpty()){
            System.out.println("房间已经被预定了");
            return;
        }
    }

    @Override
    public void checkout(int floor, int num) {
        rooms[floor][num].setEmpty(true);
        System.out.println("退房成功，房间号为："+rooms[floor][num].getId());
    }

    @Override
    public void display() {
        for (int i = 1; i < floor; i++) {
            for (int j = 1; j < num; j++) {
                System.out.println("房间号："+rooms[i][j].getId()+
                        " 房间类型："+rooms[i][j].getType()+
                        " 是否为空："+rooms[i][j].isEmpty());
            }
        }
    }
    public void initialize(){
        rooms = new Room[floor][num];
        for (int i = 1; i < floor; i++) {
            for (int j = 1; j < num; j++) {
                rooms[i][j] = new Room(i,j,"normal",true);
            }
        }
    }

    public int getFloor() {
        return floor;
    }

    public void setFloor(int floor) {
        this.floor = floor;
    }

    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }

    public static void main(String[] args) {
        Receptionist receptionist = new Hotel();
        Hotel seven_days = (Hotel) receptionist;
        seven_days.setFloor(10);
        seven_days.setNum(10);
        seven_days.initialize();
        receptionist.reserve(5,5);
        receptionist.reserve(5,5);
        receptionist.reserve(4,4);
        receptionist.checkout(4,4);
        seven_days.display();
    }
}
