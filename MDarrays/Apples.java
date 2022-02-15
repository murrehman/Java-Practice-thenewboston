package MDarrays;



public class Apples {
	public static void main(String[] args) {
		int bucky[] = {21,2,3,4};
		change(bucky);
		
		for(int y : bucky) 
			System.out.println(y);
		
	}
		
     public static void change(int x[]) {
    	for(int i=0;i<x.length;i++) 
    		x[i]+=5;
        
     }
}
