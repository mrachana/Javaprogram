import java.util.Scanner;
class LeapYear{
public static void main(String[]qwe){
Scanner scan=new Scanner(System.in);
System.out.println("Enter a year");
int year=scan.nextInt();
if(year%4==0)
if(year%100==0)
if(year%400==0)
System.out.println(year+" is a leap year");
else
System.out.println(year+" is a  not leap year");
else
System.out.println(year+" is a leap year");
else
System.out.println(year+" is a not leap year");
}
}
