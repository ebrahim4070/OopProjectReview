public class TechCompany {
    public static void main(String[] args) {
        Employee dev = new Developer("Alice", 101);
        Employee designer = new Designer("Bob", 102);
        Employee manager = new Manager("Charlie", 103);

        Employee[] employees = {dev, designer, manager};

        for (Employee e : employees) {
            e.displayInfo();
            e.attendMeeting();
            e.work();

            if (e instanceof Codeable) {
                ((Codeable) e).code();
            }

            if (e instanceof Designable) {
                ((Designable) e).design();
            }

            if (e instanceof Manageable) {
                ((Manageable) e).manage();
            }

            System.out.println();
        }
    }
}

// Abstract base class
abstract class Employee {
    String name;
    int id;

    Employee(String name, int id) {
        this.name = name;
        this.id = id;
    }

    abstract void work();

    void attendMeeting() {
        System.out.println(name + " is attending a meeting.");
    }

    void displayInfo() {
        System.out.println("Employee: " + name + ", ID: " + id);
    }
}

// Interfaces (Abilities)
interface Codeable {
    void code();
}

interface Designable {
    void design();
}

interface Manageable {
    void manage();
}

// Developer
class Developer extends Employee implements Codeable {
    Developer(String name, int id) {
        super(name, id);
    }

    public void work() {
        System.out.println(name + " is working on backend development.");
    }

    public void code() {
        System.out.println(name + " is writing Java code.");
    }
}

// Designer
class Designer extends Employee implements Designable {
    Designer(String name, int id) {
        super(name, id);
    }

    public void work() {
        System.out.println(name + " is preparing UI mockups.");
    }

    public void design() {
        System.out.println(name + " is designing a new user interface.");
    }
}

// Manager
class Manager extends Employee implements Manageable {
    Manager(String name, int id) {
        super(name, id);
    }

    public void work() {
        System.out.println(name + " is planning project timelines.");
    }

    public void manage() {
        System.out.println(name + " is managing a team of 10.");
    }
}
