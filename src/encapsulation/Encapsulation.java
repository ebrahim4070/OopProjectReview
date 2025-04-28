package encapsulation;

public class Encapsulation {

        private double marks;

        public void deposit(double amount) {
            if(amount > 0) marks += amount;
        }

        public double getBalance() {
            return marks;

    }
}
