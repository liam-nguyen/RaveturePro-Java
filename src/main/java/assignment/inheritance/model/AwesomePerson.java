package assignment.inheritance.model;

public class AwesomePerson extends Person {
    AwesomePerson() {}
    public void talk() {
        System.out.println("Name: " + super.name + ", age: " + super.age);
    }
}
