package org.ken;

public class Main {
    public static void main(String[] args) {
        Parent father = new Parent("John Smith", Sex.MALE, 37.5);
        Parent mother = new Parent("Elena Gomez", Sex.FEMALE, 34.0);

        Human human;
        human = new Child("Jonathan", Sex.MALE, 20.0);
        human.greetings();

        Child child = new Child("Bernard", Sex.MALE, 21);
        child.setMother(mother);
        child.setFather(father);

        mother.addChild(human);
        father.addChild(human);

        father.displayInformation();
        mother.displayInformation();
        child.displayInformation();
    }
}