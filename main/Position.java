package main;

import java.util.StringTokenizer;

public class Position {
	private int x;
	private int y;
	private byte orientation;
	
	public Position(){
		
	}
		
	public Position(String position){
		extractPosition(position);		
	}
	
	private void extractPosition(String position){
		StringTokenizer st = new StringTokenizer(position);
		while(st.hasMoreTokens()){
			int posx = Integer.parseInt(st.nextToken());
			int posy = Integer.parseInt(st.nextToken());
			byte orient = st.nextToken().getBytes()[0];
			this.x = posx;
			this.y = posy;
			this.orientation = orient;
		}
	}
	
	public void setOrder(byte order){
		switch (order) {
		case Order.LEFT:
			TurnLeft();
			break;
		case Order.RIGHT:
			TurnRight();
			break;
		case Order.MOVE:
			Move();
			break;
		default:
			break;
		}
	}
	
	public void TurnLeft()
	{
		switch (orientation) {
		case Orientation.NORTH:
			orientation = Orientation.WEST;
			break;
		case Orientation.WEST:
			orientation = Orientation.SOUTH;
			break;
		case Orientation.SOUTH:
			orientation = Orientation.EAST;
			break;
		case Orientation.EAST:
			orientation = Orientation.NORTH;
			break;
		default:
			break;
		}		
	}
	
	public void TurnRight()
	{
		switch (orientation) {
		case Orientation.NORTH:
			orientation = Orientation.EAST;
			break;
		case Orientation.EAST:
			orientation = Orientation.SOUTH;
			break;
		case Orientation.SOUTH:
			orientation = Orientation.WEST;
			break;
		case Orientation.WEST:
			orientation = Orientation.NORTH;
			break;
		default:
			break;
		}
	}
	
	public void Move()
	{
		switch (orientation) {
		case Orientation.NORTH:
			y = y +1;
			break;
		case Orientation.EAST:
			x = x +1;
			break;
		case Orientation.SOUTH:
			y = y - 1;
			break;
		case Orientation.WEST:
			x = x -1;
			break;
		default:
			break;
		}
	}
	
	public String LastPosition() {
		char c = (char) Integer.parseInt(String.valueOf(orientation));
		return x + " " + y + " " + c; 
	}
	
}
