package tns;

public class ArrayIndexOutOfBoundExceptionDemo {

	public static void main(String[] args) {
		int arr[]=new int[4];
		try
		{
			 int i=arr[6];
			 System.out.println(i);
		}
		catch(ArrayIndexOutOfBoundsException e)
		{
			System.out.println(e);
		}
		
	}

}

