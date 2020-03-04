package lab1;


public class SaverAccount extends BankAccount{
    public SaverAccount(int accNo, String accName) {
        super(accNo, accName);

    }

    public SaverAccount(String accName, int accNo) {
        super(accName, accNo);

    }
}
