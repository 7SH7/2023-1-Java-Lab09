package edu.handong.csee.java.inheritance;

public class Monkey extends Animal {
	// hide and overriding
    public static void testClassMethod() {
        System.out.println("The static method in Monkey");
    }
    
    // overriding
    public void testInstanceMethod() {
        System.out.println("The instance method in Monkey");
    }

}
