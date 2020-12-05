import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class javaprojhoj {

	public static void main(String[] args) throws FileNotFoundException {
		
				Scanner in = new Scanner(new File("Untitled3.txt"));
				
				if(in.hasNextLine()) {
					System.out.println(in.nextLine());
					
				}
				in.close();
				
				
				}
						
		}
		
		
					
			
		
			
	



