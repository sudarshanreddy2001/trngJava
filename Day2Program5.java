import java.util.Scanner;
class Day2Program5
{
 public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
int num=sc.nextInt();
if(num % 2==0)
{
System.out.print("EVEN");
}
if(num % 2!=0)
{
System.out.print("ODD");
}
}
}