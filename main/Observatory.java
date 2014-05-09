package main;

import java.util.LinkedList;

public class Observatory {

	private Command command;
	private Plateau plateau;
	
	public Observatory(Command command){
		this.command = command;
	}
	
	public void explorerRovers(){
		
		int i = 0;
		int size = command.getList().size();
		LinkedList<Rover> rovers = new LinkedList<Rover>();
		this.plateau = new Plateau(command.getPlanetSize());
		while(i < size){
			String POSI = command.getList().get(i);
			String MOVE = command.getList().get(i + 1);
			
			Rover rover = new Rover(plateau);
			rover.setPosition(new Position(POSI));
			rover.setInstructions(MOVE);
			
			rovers.add(rover);		
			i= i + 2;	
		}
		this.plateau.setRovers(rovers);
		this.plateau.explorer();
		
	}
}
