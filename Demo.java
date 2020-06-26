class Demo{    // LH
	static public void main(String args[]){
		new Roos().looper();
	}
}
class Roos{
		
	int[] getallen = {12,14,5,23,41};
	void looper(){
		for(int i = 0 ; i < getallen.length; i++){
			if(getallen[i]){
				throw new RuntimeException();
			}
			System.out.println(getallen[i]);
		}
	}

}