import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;
import java.util.Scanner;

public class javaprojhoj {

	public static void main(String[] args)  {
		LinkedList<String> names = new LinkedList<String>();
		names.push("russ");
		names.push("Jane");
		names.push("steve");
		
		ListIterator<String> it = names.listIterator();
		it.next();
		it.next();
		it.add("fred");
		
			for(String s: names) {
			System.out.println(s);
	}
						
  }
		
}		
					
			
		
			
	



