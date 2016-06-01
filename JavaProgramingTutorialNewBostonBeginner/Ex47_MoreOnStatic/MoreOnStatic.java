package Ex47_MoreOnStatic;


public class MoreOnStatic {
	// static variables are shared among all objects

	public static void main(String[] args) {
		tuna member1 = new tuna("Megan", "Fox");
		tuna member2 = new tuna("Natalie", "Portman");
		tuna member3 = new tuna("Taylor", "Swift");
		
		System.out.println(tuna.getMembers());

		
		
		
		

	}

}
