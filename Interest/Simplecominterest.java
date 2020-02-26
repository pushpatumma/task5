package cleancode.Interest;



public class SimpleComInterest

{

	double principal_amount,rate;

	int timeperiod;

	SimpleComInterest(double principal_amt,double rate,int timeperiod)

	{

		principal_amount=principal_amt;

		this.rate=rate;

		this.timeperiod=timeperiod;

	}

	double SimpleInterest()

	{

		return (principal_amount*timeperiod*rate)/100;

	}

	double ComInterest()

	{

		double t=1+(rate/100);

		return principal_amount*Math.pow(t,timeperiod);

	}

}