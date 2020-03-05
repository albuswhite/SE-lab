package lab1;
import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class SaverAccount extends BankAccount{
    private LocalDate date;

    public SaverAccount(int accNo, String accName) {
        super(accNo, accName);
        date=LocalDate.now();
    }

    public SaverAccount(String accName, int accNo) {
        super(accName, accNo);
        date=LocalDate.now();
    }
    public LocalDate getOverdraftLimit() {
        return date;
    }

    public void setOverdraftLimit(LocalDate date) {
        this.date = date;
    }
    protected boolean check(double amount,LocalDate now) {
        boolean allowed = false;
        LocalDate newDate = date.plus(1, ChronoUnit.WEEKS);
        if (now.isAfter(newDate)) {
            allowed = true;
        } else {
            System.out.println("Withdraw " + amount
                    + " unsuccessfull. The earlist time you can withdraw is "+ newDate );
        }
        return allowed;
    }
}
