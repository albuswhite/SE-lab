package lab1;

import java.util.ArrayList;
import java.util.Scanner;


public class Bank {
    private ArrayList<BankAccount> bank= new ArrayList<BankAccount>();
    private int status;
    String name,address;


    public void openAccount(BankAccount b) {
        System.out.println("Please select the type of account:");
        System.out.println("1-Saver account");
        System.out.println("2-Current account");
        Scanner info = new Scanner(System.in);
        switch (info.nextInt()) {
            case 1:
                System.out.println("Your Choose: 1-Saver account");
                bank.add(b);
                break;
            case 2:
                System.out.println("Your Choose: 2-Current account");
                bank.add(b);
                break;
        }
    }
        public void closeAccount(BankAccount b) {
            bank.remove(b);
        }
    public void update() {
        for (BankAccount b : bank) {
            if (b.getBalance() < 0) {
                System.out.println(b.getAccName()
                        + " is in overdraft, a letter is sent");
            }
        }
    }
    public boolean suspend(){
        if (status == 2)       // this status "2" represent be suspended
        return false;
        else
        return true;
    }


    }

