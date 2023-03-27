class Student
{
int id;
String name;
Student()//default constructor 0
{
id=0;
name=null;
}
Student(int i)// constructor 1
{
id=i;
name=null;
}
Student(String s)//constructor2
{
id=0;
name=s;
}
Student(int i,String s)//constructor3
{
id=0;
name=s;
}
void displayObject()
{
System.out.println("id:"+id+" "+"Name:"+name);
}
}
class TestStudent4
{
public static void main(String args[])
{
Student s1=new Student();//default constructor
Student s2=new Student(10400,"B-tech");
Student s3=new Student("Aswini");
Student s4=new Student(104300,"Chandrika");
s1.displayObject();
s2.displayObject();
s3.displayObject();
s4.displayObject();
}
}
