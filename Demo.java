class Demo{   //BQ
	static public void main(String rbc[]){
		new Stoel().zitten(45);
	}
}
class Stoel{
	String zitten;
	void zitten(int doen){
		System.out.println("zitten in stoel");
	}
	void zitten(char go){
		System.out.println("zitten in chair");
	}
}
