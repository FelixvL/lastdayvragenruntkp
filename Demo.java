class Demo{    // LP
	static public void main(String args[]){
		int getal = 14;
		for(int i = 2; i < getal; i++){
			if(i == 6){
				continue;
			}
			System.out.println(i);
			if(i == 10){
				break;
			}
			System.out.println("einde");
		}
		System.out.println("finally");
	}
}


