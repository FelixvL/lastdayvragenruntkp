class Demo{   //CM
	static public void main(String args[]){
		checkit().gaan();
	}
	static Dier checkit(){
		return new Mier();
	}

}


abstract class Dier{ 
	void gaan(){
		System.out.println("gaan in dier");
	}
	Dier(){
		System.out.println("I am Dier");	
	}
}

class Mier extends Dier{
	void gaan(){
		System.out.println("gaan in mier");
	}
}




