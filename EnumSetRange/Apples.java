package EnumSetRange;


public class Apples {
	public static void main(String[] args) {
		tuna member1=new tuna("megan","Fox");
		tuna member2=new tuna("NAT","PORT");
		tuna member3=new tuna("mTylopr","Swoft");
		
		
		System.out.println();
		System.out.println(member2.getFirst());
		System.out.println(member2.getLast());
		System.out.println(member2.getMembers());
		
		
		//YOU CAN PRINT STATIC WITHOUT CREATING OBJECT
		//BY CLASSNAME.STATIC
		System.out.println(tuna.getMembers());
		
	}

}
