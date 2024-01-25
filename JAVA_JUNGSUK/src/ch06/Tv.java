package ch06;

public class Tv {
	public String color;
	public boolean power;
	public int channel;


	void power() {
	     power = !power;
	}
	
	void channelUp() {
		++channel;
	}
	
	void channelDown() {
		--channel;
	}
}