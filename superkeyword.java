class Animal {
    String name;
    Animal(String name) {
        this.name = name;
    }
}

class Dog extends Animal {
    Dog(String name) {
        super(name); // calls Animal(String)
    }
    void printName() {
        System.out.println("Dog's name: " + name);
    }
}

public class superkeyword {    //  It is a Driver class 
    public static void main(String[] args) {
        Dog d = new Dog("Rex");
        d.printName();
    }
}
//super class is used when we have to call the constructor of parent class