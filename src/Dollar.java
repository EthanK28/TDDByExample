
public class Dollar extends Money{
	
	
	public Dollar(int amount)
	{
		this.amount = amount;
		currency = "CHF";
		
	}
	
	public Dollar()
	{
		
	}
	
	Dollar times(int multiplier) {
		return new Dollar(amount* multiplier);
	}


	


}
