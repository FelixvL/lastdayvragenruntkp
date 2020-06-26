class Demo{   //OO
	static public void main(String args[]){
		checkit().gaan();
	}
	static Dier checkit(){
		return new Mier();
	}

}


abstract class Dier{ 
	void gaan(){
		System.out.println("gaan in Dier");
	}
	Dier(){
		System.out.println("I am Dier");	
	}
}

class Mier extends Dier{
	void gaan() throws Error{
		System.out.println("gaan in mier");
	}
}




