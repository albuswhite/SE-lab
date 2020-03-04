package lab1;

public class CurrentAccount extends BankAccount {
    private double overdraftLimit;

    public CurrentAccount(int accNo, String accName) {
        super(accNo, accName);
        overdraftLimit = 500;
    }

    public CurrentAccount(String accName, int accNo) {
        super(accName, accNo);
        overdraftLimit = 500;
    }

    public CurrentAccount(int accNo, String accName, double overdraftLimit) {
        super(accNo, accName);
        this.setOverdraftLimit(overdraftLimit);
    }

    public double getOverdraftLimit() {
        return overdraftLimit;
    }

    public void setOverdraftLimit(double overdraftLimit) {
        this.overdraftLimit = overdraftLimit;
    }

    protected boolean check(double amount) {
        boolean allowed = false;
        if (this.getBalance() - amount >= -overdraftLimit) {
            allowed = true;
        } else {
            System.out.println("Withdraw " + amount
                    + " unsuccessfull. The overdraft limit is "+ overdraftLimit );
        }
        return allowed;
    }


}
