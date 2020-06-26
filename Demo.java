class Demo{   //OW
	static public void main(String rbc[]){
		Computer s = new Server();
		System.out.println(s.watt);
	}


}
class Computer{
	float watt = 220.4f;
}

class Server extends Computer{
	float watt = 220.7f;
	String url = "nos.nl";
}
