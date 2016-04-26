
public class Franc extends Money{
	
	private String currency;
	
	public Franc(int amount) {
		// TODO Auto-generated constructor stub
		this.amount = amount;
		currency = "CHF";
	}
	
	Franc(int amount, String currency) {
		// TODO Auto-generated constructor stub
		this.amount = amount;
		this.currency = currency;
	}
	
	Money times(int multiplier) {
		return Money.franc(amount * multiplier);
	}
}