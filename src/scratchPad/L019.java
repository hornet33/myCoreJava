package scratchPad;
class Animal {
    int x = 20;
}
class Bowbow extends Animal {
    int x = 30;
    int y = 50;
}

public class L019 {
    public static void main(String[] args) {
        Animal a = new Animal();
        System.out.println(a.x);

        Bowbow b = new Bowbow();
        System.out.println(b.x);
        System.out.println(b.y);

        a = new Bowbow();
        System.out.println(a.x);
    }
}
