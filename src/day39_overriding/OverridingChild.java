package day39_overriding;

public class OverridingChild extends OverridingParent{

    public void method1(){
        System.out.println("Child class method1");
    }

    public static void main(String[] args) {

        OverridingChild obj1 = new OverridingChild();
        obj1.method1();// Child class method1
        obj1.method2();// parent class method2

        OverridingParent obj2 = new OverridingChild();
        obj2.method1();// Child class method1
        obj2.method2();// parent class method2

        OverridingParent obj3 = new OverridingParent();
        obj3.method1();// parent class method1
        obj3.method2();// parent class method2

    }

  
}
