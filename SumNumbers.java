import java.util.Scanner;
class SumNumbers{
public static void main(String[]qwe){
Scanner scan=new Scanner(System.in);
System.out.println("Enter the value of N: ");
int N=scan.nextInt();
int sum=0,i=1;
while(i<=N){
sum=sum+i;
i++;
}
System.out.println("output: "+sum);

}
}
