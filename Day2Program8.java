import java.util.Scanner;
class Day2Program8
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
int num1=sc.nextInt();
int num2=sc.nextInt();
System.out.println("1:addition");
System.out.println("2:substraction");
System.out.println("3:multiplication");
System.out.println("4:division");
System.out.println("5:modulus division");
int num=sc.nextInt();
switch(num)
{
 case 1:{System.out.println(num1+"+"+num2+"="+(num1+num2));}
 case 2:{System.out.println(num1+"-"+num2+"="+(num1-num2));}
 case 3:{System.out.println(num1+""+num2+"="+(num1*num2));}
 case 4:{System.out.println(num1+"/"+num2+"="+(num1/num2));}
 case 5:{System.out.println(num1+"%"+num2+"="+(num1%num2));}
// default:{System.out.println(num1+"%"+num2+"="+(num1%num2));}
}
}
}
