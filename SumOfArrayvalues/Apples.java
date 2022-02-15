package SumOfArrayvalues;



public class Apples {
	public static void main(String[] args) {
		int x1[][] = {{21,2,3,4},{12,13,14,15}};
		int x2[][] = {{21,2,3,4},{43},{12,13,14,15}};
		
		System.out.println("1st array");
		display(x1);
		
		System.out.println("2nd array");
		display(x2);
		
		}
	public static void display(int x[][]) {
		for(int i=0;i<x.length;i++) {
			for(int j=0;j<x[i].length;j++) {
				System.out.print(x[i][j]+"\t");
			}
			System.out.println();
		}
	     
		
	}
}
