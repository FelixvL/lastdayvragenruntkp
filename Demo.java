class Demo{   //PK
	static public void main(String rbc[]){
		int nummer = 45;
		kijken(nummer);
		Stoel stoel = new Stoel();
		kijken(stoel);
		System.out.println(nummer);
		System.out.println(stoel.zitten);
	}
	static void kijken(int getal){
		getal = 35;
	}
	static void kijken(Stoel chair){
		chair.zitten = 22;
	}
}
class Stoel{
	int zitten = 11;
	void zitten(char go){
		System.out.println("zitten in chair");
	}
}
