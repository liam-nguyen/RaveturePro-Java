package assignment.interfaces.two;

public class MoverAndAnimate implements Animatable {

    @Override
    public void animate() {
        System.out.println("MoverAndAnimate animates...");
    }

    @Override
    public void move() {
        System.out.println("MoverAndAnimate move...");
    }
}
