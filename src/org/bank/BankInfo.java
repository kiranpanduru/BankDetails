package org.bank;

public class BankInfo extends AxisBank {
	private void saving() {
    System.out.println("saving bank account no 123654789965156");
	}
	private void fixed() {
    System.out.println("fixed bank account no 5487965412364");
	}
	public static void main(String[] args) {
		BankInfo b = new BankInfo();
		b.saving();
		b.fixed();
		b.deposit();
		
	}
}
