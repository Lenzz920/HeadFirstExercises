//q077: a parent class and a child that extends it, each constructor printing one line. What prints, and in what order?

public class Constructors {
    public static void main(String[] args) {
        Dog dog = new Dog();

        System.out.println(dog);

        OneParameter parameter = new OneParameter();

        Animal animal = new Animal();
        animal = null;
        animal.text(5, "dog");
    }
}

//q080: two overloads with the same parameter types but different names. Then swap the order of the types.
class Animal {

    public Animal() {
        System.out.println(this);
        System.out.println("animal constructor");
    }

    public void text(int size, String name) {
        System.out.println(4);
    }

    public void text(String color, int weight) {
        System.out.println(4);
    }

    public void doStuff() {
        
    }
}

class Dog extends Animal {

    public Dog(){
        System.out.println("dog constructor");
    }


}

//q079: a class with only a constructor that takes an int. Try new with no arguments.

class OneParameter {

    public OneParameter () {
        System.out.println(5);
    }
}

//q067: a drawing: the object exists, the constructor runs, then = hands out the reference
