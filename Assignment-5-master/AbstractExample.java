class AbstractExample{
	public static void main(String[] args){
		twowheeler two=new twowheeler();
		two.start();
		two.stop();
		threewheeler three=new threewheeler();
		three.start();
		three.stop();
		
	}
	
	
}
abstract class vehicle{
	abstract void start();
	void stop(){
		System.out.println("vehicle stop");
	}
}
class twowheeler extends vehicle{
	void start(){
     System.out.println("twowheeler start");
	}
	void stop(){
		System.out.println("twowheeler stop");
	}
}
class threewheeler extends vehicle{
	void start(){
     System.out.println("threewheeler start");
	}
	void stop(){
System.out.println("threewheeler stop");
	}
}