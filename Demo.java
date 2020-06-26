class Demo{   //TB
	int a = kopen();
	static int b = kopen();
	static public void main(String rbc[]){
		Demo demo1 = new Demo();
		b = 35;
		demo1.a = 25;
		Demo demo2 = new Demo();
		System.out.println(demo1.a);
		System.out.println(demo1.b);
		System.out.println(demo2.a);
		System.out.println(demo2.b);
	}
	static void lopen(){
		System.out.println("in lopen");
	}
	static int kopen(){
		System.out.println("in kopen");
		return 7;
	}

}