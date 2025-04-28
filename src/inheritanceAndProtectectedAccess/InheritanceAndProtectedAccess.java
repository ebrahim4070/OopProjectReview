package inheritanceAndProtectectedAccess;

public class InheritanceAndProtectedAccess {

        protected String type = "Tushar ";

        void display() {
            System.out.println("This is my friend.");
        }
    }

class Tushar extends InheritanceAndProtectedAccess {
    void bark() {
        System.out.println(type + " says hi");
    }
}
