import java.util.Scanner;

class Lab2P2{
	public static void main(String...args){
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the frist value: ");
		System.out.println("enter the second value: ");
		int a = sc.nextInt();
		int b = sc.nextInt();
		
		String op = sc.next();
		
		String str = switch (op){
				case "++" -> "Hello";
				case "--","+","-","~" -> "not operator";
				
				default -> "Sorry";
		};
		
		System.out.println("result: "+str);
	}
}

