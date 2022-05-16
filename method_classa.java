package velu.java;

public class method_classa {
	public void add (int a) {
		System.out.print("result:"+a); }
		public void add (int a ,String b) {
			System.out.print("result:"+(a+b)); }
		public void add (int a ,String b ,double d) {
			System.out.print("result:"+(a+b+d)); }
			
		
		 public static void main(String args[]){  
			 method_classa mc = new method_classa ();
			 mc .add(144);
			 mc.add(45,"vel");
			 mc.add(66,"priya",50.7);
		
	}       

}
