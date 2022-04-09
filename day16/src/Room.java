public class Room {

    private int floor;
    private int num;
    private String type;
    private boolean empty;

    public Room() {
    }

    public Room(int floor,int num, String type, boolean empty) {
        this.floor = floor;
        this.num = num;
        this.type = type;
        this.empty = empty;
    }

    public String getId() {
        return floor+"-"+num;
    }

    public int getFloor(){
        return floor;
    }

    public int getNum(){
        return num;
    }

    public void setId(int floor,int num) {
        this.floor = floor;
        this.num = num;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public boolean isEmpty() {
        return empty;
    }

    public void setEmpty(boolean empty) {
        this.empty = empty;
    }
}
