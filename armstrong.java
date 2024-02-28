import java.util.Scanner;
public class Main {
	
	public static void main(String[] args) {
		 Scanner sc = new Scanner(System.in);
         int n = sc.nextInt();
		 int s=0;
		 int temp=n;
		 int count=0;
		 while(n>0){
			 n=n/10;
			 count=count+1;
		 }
		 n=temp;
		 while(n>0){
			 int r=n%10;
			 s+=Math.pow(r,count);
			 n/=10;
		 }
		 if(temp==s){
			  System.out.println("true");

        } else {

            System.out.println("false");

        }
		//sc.close();

	}
}
