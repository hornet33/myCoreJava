package scratchPad;
class Animal {
    int age = 2;

    void sound(){
        System.out.println("Animal makes noise.");
    }
}
class Dog extends Animal {
    int age = 10;
    int weight = 20;

    @Override
    void sound() {
        System.out.println("Dogs bark.");
    }
}

public class L019 {
    public static void main(String[] args) {
        Animal a = new Animal();
        System.out.println(a.age);
        a.sound();

        Dog d = new Dog();
        System.out.println(d.age);
        System.out.println(d.weight);
        d.sound();

        a = new Dog();
        System.out.println(a.age);
        //System.out.println(a.weight);
        a.sound();
    }
}
