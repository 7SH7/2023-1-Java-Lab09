package edu.handong.csee.java.inheritance;

public class Cat extends Animal {
	// hiding
    public static void testClassMethod() {
        System.out.println("The static method in Cat");
    }

    // overriding
    public void testInstanceMethod() {
        System.out.println("The instance method in Cat");
    }
    
    public static void main(String[] args) {
        Cat myCat = new Cat();
        Animal myAnimal = myCat;	// polymorphism 
        // hiding, this code's result is "The static method in Animal".
        myAnimal.testClassMethod();
        // overriding, this code's result is "The instance method in Cat".
        myAnimal.testInstanceMethod();

        Dog myDog = new Dog();
        Animal myAnimal3 = myDog;	// polymorphism 
        // hiding, this code's result is "The static method in Animal".
        myAnimal3.testClassMethod();
        // overriding, this code's result is "The instance method in Dog".
        myAnimal3.testInstanceMethod();

        Monkey myMonkey = new Monkey();
        Animal myAnimal2 = myMonkey;	// polymorphism 
        // hiding, this code's result is "The static method in Animal".
        myAnimal2.testClassMethod();
        // overriding, this code's result is "The instance method in Monkey".
        myAnimal2.testInstanceMethod();
        
        
//        Animal.testClassMethod();
//        myAnimal.testInstanceMethod();
    }
}
