class Demo{   //PJ
	static public void main(String rbc[]){
		Server s = new Server();
		System.out.println(s.watt);
	}


}
class Computer{
	float watt = 220.4f;
}

class Server extends Computer{
	String url = "nos.nl";
}
