import java.util.Scanner;

public class javaprojhoj {

	public static void main(String[] args) {
		System.out.println("enter your name");
				
		Scanner in = new Scanner(System.in);
		String s = in.nextLine();
		
		if(s.equals("derrick")) {
		   System.out.println("Hey derrick");
		} else if(s.equals("Louis")) {
			System.out.println("Hey Louis");
		} else {
			System.out.println("your not welcome here");
				
		}
			
		in.close();
			
	}

}

