package animals;

public abstract class Animal {

    public void someCommonBehavior() {
        System.out.println("this is common for ALL animals");
    }

    public void yourVoice() {
        System.out.println("animal voice");
    }

    public abstract void saySomethingAbstract();

}
