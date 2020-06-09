package assignment.objects;

public class Application {
    public static void main(String[] args) {
        MyObject o1 = new MyObject(5);
        Object o2 = new Object();
        MyObject o3 = new MyObject(6);
        MyObject o4 = new MyObject(5);
        System.out.println(o1.equals(o2));
        System.out.println(o1.equals(o3));
        System.out.println(o1.equals(o4));
    }
}
