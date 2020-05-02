package classesandobjects;

public class AccountHolderObjects {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		AccountHolder tom = new AccountHolder();
		AccountHolder henry = new AccountHolder();
		AccountHolder sarah = new AccountHolder();
		
		tom.firstName = "Tom";
		tom.lastName = "Smith";
		tom.age = 21;
		tom.accountBalance = 10000;
		tom.testEligibilityForCreditCard();
		System.out.println ("Is Tom Eligible for CC : " + tom.eligibleForCreditCard);
		
		henry.firstName = "Henry";
		henry.lastName = "Williams";
		henry.age = 31;
		henry.accountBalance = 20000;
		henry.testEligibilityForCreditCard();
		System.out.println ("Is Henry Eligible for CC : " + henry.eligibleForCreditCard);
		
		
		
		sarah.firstName = "Sarah";
		sarah.lastName = "Jones";
		sarah.age = 41;
		sarah.accountBalance = 30000;
		
		sarah.testEligibilityForCreditCard();
		System.out.println ("Is Sarah Eligible for CC : " + sarah.eligibleForCreditCard);
		

	}

}
