class Demo{   //GM
	static public void main(String args[]){
		new Mier.gaan();
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




