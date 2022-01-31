class Super_class{
    int num = 20;
    public void display(){
        System.out.println("This is the display of the super class");
    }
}


public class Super extends Super_class{
    int num = 10;
    @Override
    public void display(){
        System.out.println("This is the display of the sub class");
    }
    public void my_method(){
        Super sub = new Super();
        sub.display();
        super.display();
        System.out.println("value of the variable num in class sub class: " + sub.num);
        System.out.println("value of the variable num in class supper class: " + super.num);
    }
    public static void main(String[] args) {
        Super obj = new Super();
        obj.my_method();
    }
}
