package method;

public class Loop {

	public static void main(String[] args) {
		for(int i=1;i<=4;i++) {
			System.out.println("first looping");
		}
   
		for(int count=1;count<=3;count++) {
			System.out.println("i am learning java for loop");
		}
		//nested loop
		int weeks=3;
		int days=7;
		for(int i=1;i<=weeks;i++) {
			System.out.println("week :"+i);
			for(int j=1;j<=days;j++) {
				System.out.println("day :"+j);
			}
		}
		// nested loop
		
		for(int i=1;i<=2;i++) {
			System.out.println("firstloop :"+i);
			for(int j=1;j<=4;j++) {
				System.out.println("secondloop :"+j);
			}
		}
	}

}
