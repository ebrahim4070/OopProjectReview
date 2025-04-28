package abstractClass;

abstract class AbstractClass {  // class must be abstract
    abstract void boaring();

    void read() {
        System.out.println("reading...");
    }
}

class Dog extends AbstractClass {
    void boaring() {
        System.out.println("oh!shit");
    }
}
