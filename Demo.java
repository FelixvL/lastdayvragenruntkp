class Demo{   //SI
	static public void main(String rbc[]){
		Computer s = new Computer();
		System.out.println(s.url);
	}


}
class Computer{
	float watt = 220.4f;
}

class Server extends Computer{
	String url = "nos.nl";
}
