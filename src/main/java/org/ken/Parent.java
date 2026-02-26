package org.ken;

import java.util.ArrayList;
import java.util.List;

public class Parent extends Person {
    private List<Human> children;

    public Parent() {
        super();
        children = new ArrayList<>();
    }

    public Parent(String name, Sex sex, double age) {
        this.name = name;
        this.sex = sex;
        this.age = age;
        this.children = new ArrayList<>();
    }

    @Override
    public void displayInformation() {
        super.displayInformation();
        System.out.println("I am the " + ( (getSex() == Sex.MALE) ? "Father" : "Mother" ) + " of : " + children);
    }

    public void  addChild(Human child) {
        children.add(child);
    }

    public List<Human> getChildren() {
        return children;
    }

}
