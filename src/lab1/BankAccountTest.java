package lab1;

public class BankAccountTest {

	public static void main(String[] args) {

		BankAccount acc1 = new BankAccount(100001, "John Smith");
		acc1.deposit(500);
		acc1.withdraw(700);
		System.out.println(acc1);
		acc1.withdraw(200);
		System.out.println(acc1);

	}

}
