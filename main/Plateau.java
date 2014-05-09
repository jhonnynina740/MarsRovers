package main;

import java.util.LinkedList;
import java.util.StringTokenizer;

public class Plateau {			
	public int x;	
	public int y;	
	private LinkedList<Rover> rovers;
	
	public Plateau(String dimension){
		extractDimension(dimension);
		rovers = new LinkedList<Rover>();
	}
	
	private void extractDimension(String dimension){
		StringTokenizer st = new StringTokenizer(dimension);
		while(st.hasMoreTokens()){
			x = Integer.parseInt(st.nextToken());
			y = Integer.parseInt(st.nextToken());			
		}
	}
	
	public LinkedList<Rover> getRovers() {
		return rovers;
	}

	public void setRovers(LinkedList<Rover> rovers) {
		this.rovers = rovers;
	}
	
	public void explorer(){
		for (Rover r : rovers) {
			Position p = r.getPosition();
			System.out.println(p.LastPosition());
		}
	}
	
	
}
