package bank;

public class Hana extends Bank {
	@Override
	public int showBalance() {
		setMoney(getMoney() / 2);
		return super.showBalance();
	}
}