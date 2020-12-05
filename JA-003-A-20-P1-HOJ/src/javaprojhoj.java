import java.util.Scanner;

public class javaprojhoj {

	public static void main(String[] args) {
		System.out.println("enter your name");
				
				Scanner in = new Scanner(System.in);
				int size = in.nextInt();
				
				
				int [] grades = new int [size];
				
				System.out.println("Enter" + size + "numbers. Press enter after each");
				
				for (int i = 0; i < size; i++) {
					grades[i]=in.nextInt();
				}
				
				in.close();
				
				for (int i = 0; i < size; i++) {
					System.out.println(grades[i]);
				}
				
					
				
		}
		
		
					
			
		
			
	

}

