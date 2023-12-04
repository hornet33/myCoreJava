package scratchPad;

//Creating interface that has 4 methods
interface A {
    void a();//by default, public and abstract

    void b();

    void c();

    void d();
}

//Creating abstract class that provides the implementation of one method of A interface
abstract class B implements A {
    @Override
    public void c() {
        System.out.println("I am c");
    }
}

//Creating subclass of abstract class, now we need to provide the implementation of rest of the methods
class M extends B {
    @Override
    public void a() {
        System.out.println("I am M's a");
    }

    @Override
    public void b() {
        System.out.println("I am M's b");
    }

    @Override
    public void d() {
        System.out.println("I am M's d");
    }

    @Override
    public void c() {
        System.out.println("I am M's c");
    }

    protected void e(){
        System.out.println("I am M's e");
    }
}

class N extends B {
    @Override
    public void a(){
        System.out.println("I am N's a");
    }

    @Override
    public void b(){
        System.out.println("I am N's b");
    }

    @Override
    public void c(){
        System.out.println("I am N's c");
    }

    @Override
    public void d() {
        System.out.println("I am N's d");
    }
}

//Creating a test class that calls the methods of A interface
class L013 {
    public static void main(String[] args) {
        A a = new M();
        a.a();
        a.b();
        a.c();
        a.d();
        ((M) a).e(); //Downcast to type of class M to access method e() which only belongs to class M
        System.out.println();

        a = new N();
        a.a();
        a.b();
        a.c();
        a.d();
        System.out.println();

        B b = new M();
        b.a();
        b.c();
        ((M) b).e(); //Downcast to type of class M to access method e() which only belongs to class M
    }
}
