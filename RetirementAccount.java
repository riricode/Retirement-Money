import hsa.Console;

public class RetirementAccount
{
    static Console c;

    public static void main (String[] args)
    {
	c = new Console ();

	//Variable declaration
	int accountMoney, withdrawals, moneyLeft = 0, withdrawalsTotal = 0, years = 0;

	//Input section

	c.print ("Retirement Account: ");
	accountMoney = c.readInt ();
	c.println ();
	c.println ("Withdrawals"); 

	do 
	{
	    years++;
	    c.print ("Year " + (years) + ": ");
	    withdrawals = c.readInt ();
	    withdrawalsTotal = withdrawalsTotal + withdrawals;

	}
	while (withdrawals != -1 || withdrawalsTotal < accountMoney);

	if (withdrawals == -1 || withdrawalsTotal > accountMoney)
	{ 
	    moneyLeft = accountMoney - withdrawalsTotal;
	    c.print ("You have $" + moneyLeft + " left");
	}


    }
}


