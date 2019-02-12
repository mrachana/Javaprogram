import java.util.Scanner;
class LargestNumber{
public static void main(String[]qwe){
Scanner scan=new Scanner(System.in);
System.out.println("Enter three numbers:");
int a=scan.nextInt();
int b=scan.nextInt();
int c=scan.nextInt();
if(a>b && a>c)
System.out.println(a+" is the largest");
else if(b>c)
System.out.println(b+" is the largest");
else
System.out.println(c+" is the largest");
}
}


