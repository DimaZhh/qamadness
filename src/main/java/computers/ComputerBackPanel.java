package computers;

public interface ComputerBackPanel {

    void connect();

    void disconnect();

    default void stayOnHold() {
        System.out.println("dsadsa");
    }

}
