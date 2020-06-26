class Demo{    // LT
	static public void main(String args[]){
		try{
			new Roos().looper();
		}catch(Exception e){
		}
		System.out.println("einde");
	}
}
class Roos{
		
	int[] getallen = {12,14,5,23,41};
	void looper(){
		for(int i = 2 ;   ; i++){
			if(getallen[i] == 14){
				throw new RuntimeException();
			}else{	
				i += getallen[i] % i;
			}
			System.out.println(getallen[i]);
		}
	}

}