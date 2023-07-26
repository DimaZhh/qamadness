package computers;

public class Keyboard implements ComputerBackPanel {

    @Override
    public void connect() {
        System.out.println("Keyboard connected");
    }

    @Override
    public void disconnect() {
        System.out.println("Keyboard disconnected");
    }
}
