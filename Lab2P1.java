import java.util.Scanner;
class Lab2P1{
	public static void main(String...args){
		Scanner sc = new Scanner(System.in);
		System.out.println("enter an integer: ");
		int a = sc.nextInt();
		System.out.println("enter an unary operator: ");
		String op = sc.next();
		switch(op){
			case "++":
				System.out.println("post: "+ a++ + " "+ ++a);
				System.out.println("pre: "+ (++a));
				break;
			case "--":
				System.out.println("post: "+ (a--));
				System.out.println("pre: "+ (--a));
				break;
			case "+":
				a=+a;
				System.out.println("unary +: "+(a));
				break;
			case "-":
				a=-a;
				System.out.println("unary -: "+(a));
				break;
			case "~":
				a=-a;
				System.out.println("unary ~: "+(~a));
				break;
			default:
				System.out.println("the operator which ypu hava entered is not a unary operator: ");
		}
	}
}			
