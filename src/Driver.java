package investmentCalculator;

public class Driver 
{
	public static void main(String[] args) 
	{
		Investment a = new Investment();
		
		a.addContribution(new Contribution(1200, 1));
		a.addContribution(new Contribution(1300, 5));
		a.addContribution(new Contribution(1400, 10));
		
		
		int totalInvestmentTime = 12;
		System.out.println(a.getCurrentValue(totalInvestmentTime));
		
		System.out.println(a.getTotalContributions());
	}
}
