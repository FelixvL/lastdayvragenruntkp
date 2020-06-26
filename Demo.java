class Demo{    // MU
	static public void main(String args[]){
		Meer meer = new Meer();
		Boot boot = new Boot();
		boot.naam = "Kameleon";
		System.out.println(">>"+meer.boot.naam);

	}
	void leegpompen(Meer meertje){
		meertje = new Meer();
		meertje.boot = new Boot();
	}
}
class Meer{
	static Boot boot;
	int diepte;	


}

class Boot{
	String naam = "Kameleon";
}