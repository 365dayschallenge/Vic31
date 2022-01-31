class Superclass {
    int age;
    Superclass(int age) {
        this.age = age;
    }
    public void getAge() {
        System.out.println("The age in super classes is " + age);
    }
}
public class SupperParameterized extends Superclass{
    SupperParameterized(int age) {
        super(age);
    }
    public static void main(String[] args) {
        SupperParameterized s = new SupperParameterized(24);
        s.getAge();
    }
}
