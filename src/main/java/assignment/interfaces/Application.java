package assignment.interfaces;

import assignment.interfaces.one.Automobile;
import assignment.interfaces.one.Movable;
import assignment.interfaces.two.Animatable;
import assignment.interfaces.two.MoverAndAnimate;

public class Application {
    public static void main(String[] args) {
        Movable m1 = new Automobile();
        m1.move();

        Animatable a1 = new MoverAndAnimate();
        a1.move();
        a1.animate();
    }
}
