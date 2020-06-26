class Demo{   //FT
	static public void main(String args[]){
		new FrameCollision(34);
	}
}


class FrameCollision extends NetworkCollision{
	FrameCollision(int a){
		super(a);
		System.out.println("dit gaat fout");
	}
}
class NetworkCollision{
	NetworkCollision(int b){
		System.out.println(b);
	}
}




