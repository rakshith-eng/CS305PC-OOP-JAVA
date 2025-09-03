import java.util.Scanner;

class Lab1P4{

	public static void main(String...args){
	
		Scanner sc = new Scanner(System.in);
		
		try{
			int x = sc.nextInt();
			int y = sc.nextInt();
			var c = x+y;
			System.out.println("sum is: "+c);
			
		}catch(Exception e){
			System.out.println(e.getClass());
		}
	}
}
