class Demo{    // LO
	static public void main(String args[]){
		new Roos().looper(15);
	}
}
class Roos{
	int diameter = 3;
	void looper(int diameter){
		do{
			System.out.println("go"+diameter);
			diameter -= this.diameter;
		}while(geefop());
	}
	boolean geefop(){
		return diameter-- > 0;
	}
}