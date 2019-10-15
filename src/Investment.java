package investmentCalculator;

import java.util.ArrayList;

public class Investment 
{
	ArrayList<Contribution> theContributions;
	
	public Investment()
	{
		this.theContributions = new ArrayList<Contribution>();
	}
	
	void addContribution(Contribution c)
	{
		this.theContributions.add(c);
	}
	
	double getCurrentValue(int afterHowManyMonth)
	{
		
		double value = 0;
		
		int size = this.theContributions.size() -1;
		for (int j = 0; j < this.theContributions.size(); j++)
		{
			Contribution currCont= this.theContributions.get(j);
			value = value + currCont.amount;
			if (j < size)
			{
				Contribution nextCont = this.theContributions.get(j+1);
				for (int i = currCont.monthNumber; i < nextCont.monthNumber; i++)
				{
					value = value * 1.067;
					
				}
			}
			else
			{
				for (int i = currCont.monthNumber; i <= afterHowManyMonth; i++)
				{
					value = value * 1.067;
					
				}
			}		
	
		}
		
		return value;
	}
	

	
	double getTotalContributions()
	{
		double total = 0;
		for (int i = 0; i < this.theContributions.size(); i++)
		{
			Contribution cont = this.theContributions.get(i);
			total += cont.amount;
		}
		return total;
		//return the total amount ever investment not taking into
		//account interest.
	}
	
	
}
