class Demo{   //AF
	static public void main(String rbc[]){
		for(int i, j = 1; j < new Stoel().plekken.length; ){
			System.out.println(new Stoel().plekken[j-1]);
			j++;
		}
		System.out.println("ik leef nog");
	}


}
class Stoel{
	int[] plekken = {3,7,8};
	Stoel(int i){
		System.out.println("c in Stoel");
	}
	Stoel(){

	}
	Stoel Stoel(){
		return new Stoel(1);
	}
}
