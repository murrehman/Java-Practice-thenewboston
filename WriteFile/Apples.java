package WriteFile;

public class Apples {
	public static void main(String[] args) {
		
		createfile g=new createfile();
		g.openFile();
		g.addRecords();
		g.closeFile();
	}
}
