class Demo{   //EX
	static public void main(String args[]){
		try{
			checkit().gaan();
			System.out.println("ik doe mee");
		}catch(Exception e){
			System.out.println("gered");
		}
		System.out.println("begin");
	}
	static Dier checkit(){
		return new Mier();
	}
}
abstract class Dier{ 
	void gaan(){
		System.out.println("gaan in Dier");
	}
}

class Mier extends Dier{
	void gaan() throws Error{
		System.out.println("gaan in mier");
		throw new RuntimeException();
	}
}




