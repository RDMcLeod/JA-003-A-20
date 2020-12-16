import java.util.LinkedList;

public class javaprojhoj {

		static int [][] maze = {
			{2,0,0,1},
			{1,1,2,0},
			{0,1,1,1}
	};
		//0 = wall
		//1 = path
		//2 = destination
		
		static LinkedList<Position> path = new LinkedList<Position>(); 
			
		public static void main(String[] args)  {
			Position p = new Position(3, 0);
			path.push(p);
			
			int y = path.peek().y;
			int x = path.peek().x;
			
			maze[y] [x]= 0; 
			
			while (true) {
			//down
			if(maze [y+1][x]==2) {
				System.out.println("You won!");
				return;
			}else if (maze [y+1][x]==1) {
				System.out.println("Moved down");
				path.push(new Position(y+1, x));
				continue;
			}
			//Left
			if(maze [x-1][x]==2) {
				System.out.println("You won!");
				return;
			}else if (maze [y][x-1]==1) {
				System.out.println("Moved down");
				path.push(new Position(y, x-1));
				continue;
		    }
			//Up
			if(maze [y-1][x]==2) {
				System.out.println("You won!");
				return;
			}else if (maze [y-1][x]==1) {
				System.out.println("Moved down");
				path.push(new Position(y-1, x));
				continue;
		    }
			//Right
			if(maze [y][x+1]==2) {
				System.out.println("You won!");
				return;
			}else if (maze [y][x+1]==1) {
				System.out.println("Moved down");
				path.push(new Position(y, x+1));
				continue;
            }
			}
		}
}	
	


