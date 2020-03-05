package lab1;

public class CurrentAccountTest {

	public static void main(String[] args) {
	
		CurrentAccount acc1 = new CurrentAccount( 100002, "Tom Will", 1000);
		acc1.deposit(500);
		acc1.withdraw(700);
		System.out.println(acc1);
		acc1.withdraw(200);
		System.out.println(acc1);

	}

}
