import java.util.Scanner;
class NumberOfDigits{
public static void main(String[]qwe){
Scanner scan=new Scanner(System.in);
System.out.println("Enter the number: ");
int a=scan.nextInt();
int count=0;
while(a!=0){
a=a/10;
count++;
}
System.out.println(count);
}
}
