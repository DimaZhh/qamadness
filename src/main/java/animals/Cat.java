package animals;

public class Cat extends Animal implements java.io.Serializable {

    private String name;
    private int age;

    public Cat(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public void yourVoice() {
        System.out.println("say may");
    }

    @Override
    public void saySomethingAbstract() {

    }

    public String yourVoiceForTests() {
        return "say may";
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

    @Override
    public String toString() {
        return "Cat{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
