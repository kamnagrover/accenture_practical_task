package reverse;

public class ReverseCount {
	public static void main(String args[]) {
	     
	     for(int i=100;i>0;i--)
	     {
	         if(i%5==0 && i%3==0)
	         System.out.println("Testing  (Number " + i + " is divisible by 3&5 both)");
	         else if(i%5==0)
	         System.out.println("Agile  (Number " + i + " is divisible by 5)");
	         else if(i%3==0)
	         System.out.println("Software  (Number " + i + " is divisible by 3)");
	         else
	         System.out.println("Number " + i);
	     }
	    }
}
