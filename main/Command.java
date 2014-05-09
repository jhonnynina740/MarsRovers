package main;

public class Main {
	public static void main(String args[]) {
		try {
			Command command = new Command();
			command.setPlanetSize("5 5");
									
					
			command.addElement("1 2 N");
			command.addElement("LMLMLMLMM");
			
			command.addElement("3 3 E");
			command.addElement("MMRMMRMRRM");
			
			Observatory observatory = new Observatory(command);
			observatory.explorerRovers();
		}catch(Exception e){
			
		}
	}
}
