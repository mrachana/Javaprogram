import java.util.Scanner;
class PalindromeOrNot{
public static void main(String[]qwe){
Scanner scan=new Scanner(System.in);
System.out.println("Enter the number: ");
int N=scan.nextInt();
int temp=N;
int rev=0;
while(temp!=0){
rev=rev*10+temp%10;
temp=temp/10;
}
if(rev==N)
System.out.println("yes ");
else
System.out.println("no ");
}
}
