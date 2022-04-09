public interface Receptionist {

    void initialize();

    void reserve(int floor, int num);

    void checkout(int floor, int num);

    void display();

}
