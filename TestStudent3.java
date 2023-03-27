class Student
{
int id;
String name;
Student()//default constructor
{
id=0;
name=null;
}
Student(int i,String s)//parameterised constructor
{
id=i;
name=s;
}
}
//creating another class teststudent1 which contains   main method
class TestStudent3
{
public static void main(String args[])
{
Student s1=new Student();//default constructor
Student s2=new Student(143,"Aswini");
System.out.println(s1.id);
System.out.println(s2.id);
System.out.println(s2.name);
}
}
