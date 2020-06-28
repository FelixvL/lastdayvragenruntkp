class Demo{    // ZZ
	static int a = vult();
	static int vult(){
		System.out.println("vult in demo");
		return 3;
	}
	{
		System.out.println("er wordt een demo gemaakt");
	}
	static public void main(String args[]){
		Meer meer = new Meer(2);
		Boot boot = new Boot();
		boot.naam = "Kameleon";
		new Demo().leegpompen(meer);
		new Demo().leegpompen(meer);
		new Demo().leegpompen(meer);
		System.out.println(">>"+boot.naam);
		if(boot.naam == meer.boot.naam){
			System.out.println("yes" + meer.diepte);
		}

	}
	void leegpompen(Meer meertje){
		meertje = new Meer(5);
		meertje.boot = new Boot();
	}
}
class Meer{
	static Boot boot;
	int diepte;
	Meer(int diepte){
		this.diepte = diepte;
	}	
}
class Boot{
	String naam = "abc";
}