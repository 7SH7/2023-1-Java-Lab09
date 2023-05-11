package edu.handong.csee.java.inheritance;

public class Cat extends Animal {
    public static void testClassMethod() {
        System.out.println("The static method in Cat");
    }
    public void testInstanceMethod() {
        System.out.println("The instance method in Cat");
    }
    
    public static void main(String[] args) {
    	// Animal Class is inheritage Cat Class
        Cat myCat = new Cat();
        Animal myAnimal = myCat;
        myAnimal.testClassMethod();
        myAnimal.testInstanceMethod();

    	// Animal Class is inheritage Dog Class
        Dog myDog = new Dog();
        Animal myAnimal3 = myDog;
        myAnimal3.testClassMethod();
        myAnimal3.testInstanceMethod();

    	// Animal Class is inheritage Monkey Class
        Monkey myMonkey = new Monkey();
        Animal myAnimal2 = myMonkey;
        myAnimal2.testClassMethod();
        myAnimal2.testInstanceMethod();
        
        
//        Animal.testClassMethod();
//        myAnimal.testInstanceMethod();
    }
}
