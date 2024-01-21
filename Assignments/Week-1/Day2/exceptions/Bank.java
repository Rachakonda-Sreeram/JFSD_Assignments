package exceptions;

public class Bank {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int acNo[] = {10,20,30,40};
		String names[] = {"A","B","C","D"};
		double bal[] = {100,200,300,400};
		System.out.println("AcNo. Name Balance");
		for(int i = 0; i<acNo.length;i++) {
			System.out.println(acNo[i]+" "+names[i]+" "+bal[i]);
			if(bal[i] < 300) {
				try {
					double de = 300 - bal[i];
					throw new LowBalanceException("Please deposit "+de+" to your account");
				}
				catch(LowBalanceException e) {
					System.out.println(names[i] +" your balance is Low.");
					System.out.println(e);
				}
				
			}
		}
		
		

	}

}
