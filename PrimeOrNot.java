import java.util.Scanner;
class PrimeOrNot{
public static void main(String[]qwe){
Scanner scan=new Scanner(System.in);
System.out.println("Enter the number: ");
int N=scan.nextInt();
int flag=0;
for(int i=2;i<N;i++){
if(N%i==0){
flag=1;
break;
}
else
continue;
}
if (flag==1)
System.out.println("Not Prime");
else
System.out.println(" Prime");
}
}
