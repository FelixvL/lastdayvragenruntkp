class Demo{   //ZT
	static public void main(String rbc[]){
		int nummer = 19;
		zitten(nummer);

	}
	static void zitten(int abc){
		char vr = (char)abc;
		new Stoel().zitten(vr);
	}

}
class Stoel{
	void zitten(char go){
		System.out.println("zitten in chair");
	}
}
