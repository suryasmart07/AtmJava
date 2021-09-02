
import java.util.*;
public class Transaction {

	public static void main(String[] args) {
		

		Scanner in = new Scanner(System.in);
		System.out.println("Enter a valid card Number\n");
		String Card= in.next();
		if(Card.length()==16)
		{
               System.out.println("Enter the PIN\n");
			String Pin = in.next();
			if(Pin.length()==4)
			{
				System.out.println("Enter the choice below\n");
			
				System.out.println("1.Withdraw\n 2.Account Statement\n 3.change MPIN\n 4.Transfer\n");
				int choice = in.nextInt();
				if(choice ==1)
				{
					System.out.println("Enter the amount to be drawn\n");
					int amount = in.nextInt();
					if(amount %10 ==0)
					{
						System.out.println("withdraw successfully");
					}
					else
					{
						System.out.println("Amount cannot be dispensed");
					}
				}
				else
				{
					System.out.println("Coming soon");
				}
			}
			else
			{
				System.out.println("Invalid PIN");
			}
			
		}
		else
		{
			System.out.println("Not a valid card");
		}
	}

}
