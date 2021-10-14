package Exercise02;

public class Exercise02 {

}

class Bank {
    private Bank() {
    }

    private static Bank bank = null;

    public synchronized static Bank getBank() {
        if (bank == null) {
            bank = new Bank();
        }
        return bank;
    }
}