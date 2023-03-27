import java.util.Scanner;
class Program15
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
//System.out.println("\n Enter a numbers:");
int num1=sc.nextInt();
int i;
i=0;
while(i<=10)
{
      System.out.println( num1+"*"+i+"="+num1*i);
        i=i+1;
}
}
}
