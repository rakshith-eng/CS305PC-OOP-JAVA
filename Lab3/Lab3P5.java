import java.util.Scanner;
class Lab3P5{
	public static void main(String...args){
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the integer value: ");
		int x = sc.nextInt();
		System.out.println("enter the String value: ");
		String s = sc.readLine();
		Lab3P5 OL = new Lab3P5();
		Lab3P5 OL1 = new Lab3P5(x);
		Lab3P5 OL2 = new Lab3P5(s);
		Lab3P5 OL3 = new Lab3P5(x,s);
	}
	Lab3P5(){
		System.out.println("constructor without parameters");
	}
	Lab3P5(int x){
		System.out.println("constructor with int parameters: "+x);
	}
	Lab3P5(String s){
		System.out.println("constructor with String parameters: "+s);
	}
	Lab3P5(int x,String s){
		System.out.println("constructor with int and string parameters: "+x+" "+s);
	}
}
