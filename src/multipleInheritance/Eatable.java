package multipleInheritance;

interface Walkable {
    void walk();
}

interface Eatable {
    void eat();
}

class Bird implements Walkable, Eatable {
    public void walk() {
        System.out.println("Bird is walking...");
    }

    public void eat() {
        System.out.println("Bird is eating...");
    }
}

class Fish implements Eatable {
    public void eat() {
        System.out.println("Fish is eating...");
    }
}



