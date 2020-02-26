import java.util.Scanner;
class Cost
{
	Cost(double totalarea) // totalarea = Total Area of the House
	{
		Scanner sc = new Scanner(System.in);
		double ccost;
		double squarefeet = totalarea*10.764; // Converting Area into Square Feet
		//"1.Standard Material 2.Above Standard Material 3.High Standard Material 4.High Standard Material and Fully Automated Home"
		int typeofhouse = sc.nextInt(); // Reading Type of House as given in above comment
		switch(typeofhouse)
		{
			case 1 : ccost = 1200 * squarefeet; // Construction Cost for Standard Material
					 break;
			case 2 : ccost = 1500 * squarefeet; // Construction Cost for Above Standard Material
					 break;
			case 3 : ccost = 1800 * squarefeet; // Construction Cost for High Standard Material
					 break;
			case 4 : ccost = 2500 * squarefeet; // Construction Cost for High Standard Material and Fully Automated Home
					 break;
			default: return;
		}
	}
}