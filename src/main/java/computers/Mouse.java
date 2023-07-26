package computers;

public class Mouse implements ComputerBackPanel {

    @Override
    public void connect() {
        System.out.println("Mouse connected");
    }

    @Override
    public void disconnect() {
        System.out.println("Mouse disconnected");
    }
}
