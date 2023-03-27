class A{
public void funA1(){
System.out.println("funA1 method of classA called");
}//funA1
public void funA2(){
System.out.println("funA2 method of classA called");
}//funA2
public void funA3(){
System.out.println("funA3 method of classA called");
}//funA3
}//A
class B{
public void funB1(){
System.out.println("funB1 method of classB called");
}//funB1
}//B
class Amethods{
public static void main(String args[]){
A obA=new A();
obA.funA1();
obA.funA2();
obA.funA3();
B obB=new B();
obB.funB1();
}//main
}//C