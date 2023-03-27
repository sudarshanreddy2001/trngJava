class Student
{
int rollno;
String name;
void insertRecord(int r,String n)
{
rollno=r;
name=n;
}
void displayinformation(){System.out.println(rollno+" "+name);}
}

class TestStudent2
{
public static void main(String args[])
{
Student s1=new Student();
Student s2=new Student();
Student s3=new Student();
s1.insertRecord(111,"kiran");
s2.insertRecord(222,"Arjun");
s3.insertRecord(515,"Aswini");
s1.displayinformation();
s2.displayinformation();
s3.displayinformation();
}
}
