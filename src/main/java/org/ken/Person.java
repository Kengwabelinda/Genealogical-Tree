package org.ken;

public class Person extends Human implements Information{

    public Person() {
        super();
    }

    public Person(String name, Sex sex, double age) {
        this.name = name;
        this.sex = sex;
        this.age = age;
    }

    @Override
    public void greetings() {
        System.out.println("Hello I am a person named " + getName());
    }

    @Override
    public void displayInformation() {
        super.toString();
    }
}
