class Demo{   //IG
	static public void main(String rbc[]){
		Server s = new Computer();
		System.out.println(s.url);
	}


}
class Computer{
	float watt = 220.4;
}

class Server extends Computer{
	String url = "nos.nl";
}
