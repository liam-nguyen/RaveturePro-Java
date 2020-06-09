package assignment.keywords;

public class Application {
    public static void main(String[] args) {
        // Test 1
        System.out.println(StaticClass.sum((float)5.2,(float)2.5));
        // Test 2
        FinalClass fc = new FinalClass();
        System.out.println(fc.myConstant);
        // Test 3
        ConcreteClass cc = new ConcreteClass();
        cc.run();
    }
}
