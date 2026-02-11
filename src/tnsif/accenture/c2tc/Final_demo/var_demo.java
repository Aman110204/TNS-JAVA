package tnsif.accenture.c2tc.Final_demo;

class upiApp{
	final int lmt=100000;
	void showLimit() {
		System.out.println("Daily limit "+lmt);
	}
	
}
public class var_demo {
	public static void main(String[] args) {
		upiApp a=new upiApp();
		a.showLimit();
		//a.lmt=2000; shows error as value cannot be assigned to variable
		}

}
