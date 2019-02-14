import java.util.Scanner;
class PowerOfNumber{
public static void main(String[]qwe){
Scanner scan=new Scanner(System.in);
System.out.println("Enter the value of N & K: ");
int N=scan.nextInt();
int K=scan.nextInt();
int res=1;
int i=1;
while(i<=K){
res=res*N;
i++;
}
System.out.println("N^K is " +res);
}
}
