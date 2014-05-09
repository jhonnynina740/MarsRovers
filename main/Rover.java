package main;

public class Rover {
	Position position;
	Plateau plateau;
	
	public Rover(Plateau plateau)
	{
		this.plateau = plateau;
	}
	
	public void setPosition(Position position){
		this.position = position;
	}
	
	public Position getPosition()
	{
		return this.position;
	}
	
	public void setInstructions(String intructions){
		extractIntructions(intructions);
	}
	
	private void extractIntructions(String intructions){
		byte[] orders = intructions.trim().getBytes();
		for (int i = 0; i < orders.length; i++) {			
			this.position.setOrder(orders[i]);
		}
	}
}
