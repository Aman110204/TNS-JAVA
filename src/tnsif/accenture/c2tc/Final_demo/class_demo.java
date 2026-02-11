package tnsif.accenture.c2tc.Final_demo;

 public class class_demo {

	public static void main(String[] args) {
		ecommerce_platform e1=new ecommerce_platform();
		e1.calc_discount();

	}

}
 final class ecommerce_platform{
		void calc_discount() {
			System.out.println("Base discount--10%");
			
		}
	}
 /*class amazon extends ecommerce_platform{cannot inherit class 
		void calc_discount() {
			 System.out.println("extra discount-15%");
		 }
	 }*/