package method;

public class modifier {

	public void printname( String name) {
		System.out.println("Enter the  name is  :"+name);
	}

	
	public int multiplytwonumbers(int firstnumber,int secondnumber) {
		int sum=firstnumber*secondnumber;
		return sum;

      }
	
	public int dividetwonumbers(int firstnumber,int secondnumber) {
		int divide=firstnumber/secondnumber;
		return divide;
	}
	
	public int dividetwonumbers(int firstnumber,int secondnumber,int thirdnumber) {
		int weird=firstnumber/secondnumber-thirdnumber;
		return weird;
	}
}
