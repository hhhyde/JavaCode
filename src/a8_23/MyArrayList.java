package a8_23;

public class MyArrayList {

	class Temp{
		String aa;

		public Temp(String aa) {
			super();
			this.aa = aa;
		}
		
		public String toString(){
			return super.toString()+" "+ aa;
		}
	}
	
	public static void main(String[] args) {
		Tgg ttaTgg=new Tgg("hello");
		System.out.println(ttaTgg);
		System.out.println("-----------");
		char[] tt={'a','b','c'};
		int[] it={1,3,5,1,2,6};
		System.out.println(String.valueOf(tt));
		System.out.println(String.valueOf(it));
//		Temp temp=new Temp("world");
//		System.out.println(temp);
	}
}
