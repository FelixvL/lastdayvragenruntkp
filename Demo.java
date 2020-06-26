class Demo{   //ER
	static public void main(String rbc[]){
		new Stoel(2);
		new Stoel(1).Stoel();
	}


}
class Stoel{
	int[] array = {3,7,8};
	Stoel(int i){
		System.out.println(array[i]);
		System.out.println("c in Stoel");
	}
	Stoel Stoel(){
		return new Stoel(1);
	}
}
