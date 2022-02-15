package variablelengthargs;



public class Apples {
	public static void main(String[] args) {
		
		System.out.println(average(1,2,3,4,5,6,7,8));
		
		}
	public static int average(int...num) {
		int total=0;
		for(int x:num) 
			total+=x;
		return total/num.length;
			
		}
	     
		
	
}
