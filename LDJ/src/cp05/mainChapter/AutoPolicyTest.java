package cp05.mainChapter;

public class AutoPolicyTest {
	public static void main(String[] args) {
		AutoPolicy policy1 = new AutoPolicy(111111111, "ToyotaCamry", "NJ");
		AutoPolicy policy2 = new AutoPolicy(222222222, "Ford Fusion", "ME");
		policyIsNoFaultState(policy1);
		policyIsNoFaultState(policy2);
	}
	
	public static void policyIsNoFaultState(AutoPolicy policy) {
		System.out.println("The auto policy:");
		System.out.printf("Account #: %d\n", policy.getAccountNumber());
		System.out.printf("Car: %s\n", policy.getMakeAndModel());
		System.out.printf("State %s %s a no-fault state\n\n",
				policy.getState(), policy.isNoFaultState() ? "is":"is not");
	}
}
