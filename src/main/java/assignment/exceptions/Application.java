package assignment.exceptions;

public class Application {
    public static void main(String[] args) {
        try {
            Runner.run();
        } catch(CustomException e) {
            System.out.println(e);
        }
    }
}
