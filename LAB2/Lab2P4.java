import java.util.Scanner;

class Lab2P4{
	public static void main(String...args){
		Scanner sc = new Scanner(System.in);
		
		System.out.println("enter an integer: ");
		int n = sc.nextInt();
		
		boolean count = false;
		
		if(n>=2){
			for(int i=2;i<=n;i++){
				if(n%i==0){
					count = true;			
				}
			}
			if(count){
				System.out.println("2. it is a prime number");
			}else
				System.out.println("3. int is not a prime number");
		}else{
			
			System.out.println("1. It is not a prime number");
		}
	}
}
