package assignment12.bank;

public class Account 
{
	String userName;
	long accountNo=51821;
	int pin;
	String address;
	
	public Account(String UserName ,int pin, String address) {
		super();
		this.userName = UserName;
		this.pin = pin;
		this.address = address;
	}
	public long getAccountNo() {
		return accountNo;
	}
	public void setAccountNo(long accountNo) {
		this.accountNo = accountNo;
	}
	public int getPin() {
		return pin;
	}
	public void setPin(int pin) {
		this.pin = pin;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	
	
	

}
