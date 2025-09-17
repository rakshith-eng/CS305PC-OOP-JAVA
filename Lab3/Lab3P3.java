import java.util.Scanner;
class Lab3P3{
	public static void main(String...args){
	Scanner sc = new Scanner(System.in);
	System.out.println("enter the range value: ");
	int n = sc.nextInt();
		for(int i = 2;i<=n;i++){
            int count = 0;
			if(i==0) count++;
			for(int j=2;j<i;j++){
                if(i%j==0){
					count=0;
					break;
				}else count++;
				
			}
			if(count>0){
				System.out.println(i);
			}
		}
		
	}
}
