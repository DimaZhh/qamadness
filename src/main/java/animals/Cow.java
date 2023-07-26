package animals;

public class Cow extends Animal{

    String name;
    int age;

    public Cow(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public void yourVoice() {
        System.out.println("say myyy");
    }

    @Override
    public void saySomethingAbstract() {

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
