import java.util.Scanner;
class Day3Program04
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
int num1=sc.nextInt();
int num2=sc.nextInt();
int num3=sc.nextInt();
int num4=sc.nextInt();
System.out.println(num1+"/"+num2+"*"+num3+"*"+num4+"="+(num1/num2*num3*num4));
}
}
