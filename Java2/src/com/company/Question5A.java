package com.company;

class CloneObject implements Cloneable {
    int var1, var2;

    // This method calls Object's clone().
   public CloneObject getClone() {
        try {
            return (CloneObject) super.clone();
        } catch (CloneNotSupportedException e) {
            System.out.println(" Cloning not allowed. ");
            return this;
        }
    }
}

public class Question5A {
    public void CloneObjects() {
        CloneObject objectToBeCloned = new CloneObject();
        objectToBeCloned.var1 = 10;
        objectToBeCloned.var2 = 9;
        CloneObject clonedObject;
        clonedObject = objectToBeCloned.getClone();
        System.out.println("Object to be cloned var1 "+objectToBeCloned.var1+" var2 "+objectToBeCloned.var2);
        System.out.println("Object cloned var1 "+clonedObject.var1+" var2 "+clonedObject.var2);
    }

    public static void main(String[] args) {
        Question5A question5a = new Question5A();
        question5a.CloneObjects();
    }
}
