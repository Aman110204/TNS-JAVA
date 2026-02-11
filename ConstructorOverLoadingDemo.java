package TNS_java;


class Student {

 String name;
 int age;

 // Default constructor
 Student() {

     System.out.println("Default Constructor Called");
    
 }

 // Constructor with only name
 Student(String name) {
     this.name = name;
     this.age = 0;
     System.out.println("Name: " + this.name + ", Age: " + this.age);
 }

 // Constructor with name and age
 Student(String name, int age) {
     this.name = name;
     this.age = age;

     System.out.println("Name: " + this.name + ", Age: " + this.age);
 }
}

public class ConstructorOverLoadingDemo {

 public static void main(String[] args) {

     Student s1 = new Student();

     Student s2 = new Student("Aman");

     Student s3 = new Student("Aman", 23);
 }
}
