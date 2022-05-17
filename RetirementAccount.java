import hsa.Console;

public class RetirementAccount
{
    static Console c;

    public static void main (String[] args)
    {
	c = new Console ();

	//Variable declaration
	int accountMoney, withdrawals, moneyLeft, withdrawalsTotal, years;
	
	//Variable initialization 
	moneyLeft = 0; 
	withdrawalsTotal = 0; 
	years = 0; 

	//Input section
	c.print ("Retirement Account: ");
	accountMoney = c.readInt ();
	c.println ();
	c.println ("Withdrawals");
	c.print("Year 1: "); 
	withdrawals = c.readInt();

	while (withdrawals != -1 || (withdrawalsTotal <= accountMoney))
	{
	    years++;
	    withdrawalsTotal = withdrawalsTotal + withdrawals;
	    c.print ("Year " + (years + 1) + ": ");
	    withdrawals = c.readInt ();
	}

	if (withdrawals == -1 || withdrawalsTotal > accountMoney)
	{ 
	    moneyLeft = accountMoney - withdrawalsTotal;
	    c.println();
	    c.print ("You have $" + moneyLeft + " left");
	}


    }
}


