import java.util.Scanner;
class VowelOrConsonant{
public static void main(String[]qwe){
Scanner Scan=new Scanner(System.in);
System.out.println("Enter a character: ");
char ch=Scan.next().toLowerCase().charAt(0);

if(ch=='a'|| ch=='e'|| ch=='i'|| ch=='o'|| ch=='u')
System.out.println("vowel");
else
System.out.println("consonant");
}
}
