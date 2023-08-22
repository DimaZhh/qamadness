package cars;

import java.util.Arrays;
import java.util.List;
import java.util.Objects;

public class RangeRover {


    public static void main(String[] args) {
        List<Integer> integers = Arrays.asList(1, 2, 3, 4, 5);
        Integer sum = integers.stream()
                .mapToInt(Integer::intValue)
                .filter(s -> s%2==0)
                .sum();



        System.out.println(sum);
    }

    String name = "LandRover Discovery";
    int age;

    public static final String STATIC_CONSTANT_FIELD_TEXT = "some common text needed in whole project";
    public static final int STATIC_CONSTANT_FIELD_NUMBER = 15;

    public void sayNameAndAge() {
        System.out.println("my name is " + name + "and my age is " + age);
    }

    /*
    *
    * 2 this is dsadsad
    * 15 this is dasdsa
    * */
    public static void printSomeCustomMessage() {
        System.out.println("Custom message 1");
        int formula = 2 * STATIC_CONSTANT_FIELD_NUMBER;
    }
    public void printAnotherSomeCustomMessage() {
        System.out.println("Custom message 2");
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || this.getClass() != o.getClass()) return false;
        RangeRover that = (RangeRover) o;
        return age == that.age && Objects.equals(name, that.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age);
    }
}
