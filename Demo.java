class Demo{    // LS
	static public void main(String args[]){
		Roos r = new Roos();
		r.looper(15);
		System.out.println(r.diameter);

	}
}
class Roos{
	int diameter = 3;
	void looper(int diameter){
		do{
			System.out.println("go"+diameter);
			diameter -= --this.diameter;
		}while(geefop());
	}
	boolean geefop(){
		return diameter-- > 0;
	}
}
