class Demo{    // LK
	static public void main(String args[]){
		int getal = 14;
		for(int i = 2; i < getal; i += i){
			if(i == 6){
				continue;
			}
			System.out.println(i);
			if(i == 10){
				break;
			}
			System.out.println("einde");
		}
		System.println("finally");
	}
}


