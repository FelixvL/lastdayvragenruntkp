class Demo{   //OM
	static public void main(String rbc[]){
		new Stoel(2);
	}


}
class Stoel{
	int[] array = new int[3]{3,7,8};
	Stoel(int i){
		System.out.println(array[i]);
		System.out.println("c in Stoel");
	}
	Stoel deStoel(){
		return new Stoel(1);
	}
}
