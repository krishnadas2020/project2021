package app;

public class Bank {
	int balance;
	
	 public int getBalance() {
		
		 System.out.println(balance);
		 return balance;
	}
	
	 public void deposit(int amount) {
		 balance=balance+amount;
		 }
	 
	 public Bank(int b) {
		 balance =b;
		 this.balance=b;
	 }
	 
	 public static void main(String[]Args) {
		 Bank bank=new Bank(100);
		 bank.getBalance();
		 bank.deposit(500);
		 bank.getBalance();
	 }

}
