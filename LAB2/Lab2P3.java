import java.util.Scanner;

class Lab2P3{
	public static void main(String...args){
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the value of a: ");
		System.out.println("enter the value of b: ");
		int a = sc.nextInt();
		int b = sc.nextInt();
		System.out.println("result: "+(a&b));
		System.out.println("result: "+(a|b));
		System.out.println("result: "+(a^b));
	}
}
