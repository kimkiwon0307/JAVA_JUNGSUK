package ch07;

class Tv {
	boolean power;
	int channel;
	
	void power() { power = !power; }
	void channelUp() { ++channel;}
	void channelDwon() { --channel;}
}

class CaptionTv extends Tv{
	
	boolean caption;
	void displayCaption(String text) {
		if(caption) {
			System.out.println("자막기능을 켰습니다.");
			System.out.println(text);
		}else {
			System.out.println("자막기능이 꺼져있습니다.");
		}
	}
}

class CaptionTvTest{
	public static void main(String[] args) {
		
		CaptionTv ctv = new CaptionTv();
		ctv.channel=10;
		ctv.channelUp();
		System.out.println(ctv.channel);
		ctv.displayCaption("HI, World");
		ctv.caption = true;
		ctv.displayCaption("Hello, World");
		
		
	}
}