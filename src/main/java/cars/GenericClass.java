package cars;

public class GenericClass<T, K> {

    T filed1;
    K filed2;

    public GenericClass(T filed1, K filed2) {
        this.filed1 = filed1;
        this.filed2 = filed2;
    }

    public void something(int a){}
    public void something(String a){}

}
