package org.ken;

import java.util.HashSet;
import java.util.Set;

public class Child extends Person{
    private Parent father;
    private Parent mother;

    public Child(String name, Sex sex, double age, Parent parent, Parent mother) {
        super(name, sex, age);
        this.father = parent;
        this.mother = mother;
    }

    public Child(String name, Sex sex, double age) {
        super(name, sex, age);
    }

    @Override
    public void displayInformation() {
        super.displayInformation();
        System.out.println("I am a child of : " + getFather().getName() + " and " + getMother().getName());
    }

    public Set<Child> getSiblings() {
        Set<Child> siblings = new HashSet<>();
        if (father != null) {
            for (Human child : father.getChildren()) {
                if (child instanceof Child && child != this) {
                    siblings.add((Child) child);
                }
            }
        }
        if (mother != null) {
            for (Human child : mother.getChildren()) {
                if (child instanceof Child && child != this) {
                    siblings.add((Child) child);
                }
            }
        }
        return siblings;
    }

    public Parent getFather() {
        return father;
    }

    public void setFather(Parent parent) {
        this.father = parent;
        father.addChild(this);
    }

    public Parent getMother() {
        return mother;
    }

    public void setMother(Parent mother) {
        this.mother = mother;
        mother.addChild(this);
    }
}
