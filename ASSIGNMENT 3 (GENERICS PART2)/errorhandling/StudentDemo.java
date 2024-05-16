package errorhandling;

//Define the custom exception
class InvalidAgeException extends Exception {
 public InvalidAgeException(String message) {
     super(message);
 }
}
class Student {
 private String name;
 private int age;

 public Student(String name, int age) throws InvalidAgeException {
     this.name = name;
     setAge(age);
 }
 private void setAge(int age) throws InvalidAgeException {
     if (age < 0 || age > 100) {
         throw new InvalidAgeException("Invalid age: " + age);
     }
     this.age = age;
 }

 public int getAge() {
     return age;
 }

 public String getName() {
     return name;
 }
 public void displayStudentDetails() {
     System.out.println("Student Name: " + getName() + ", Age: " + getAge());
 }
}

public class StudentDemo {
 public static void main(String[] args) {
     try {
         Student student = new Student("Ashit", 20);
         student.displayStudentDetails();
         Student invalidStudent = new Student("Motu", -5);
         invalidStudent.displayStudentDetails();
     } catch (InvalidAgeException e) {
         System.out.println("Caught an InvalidAgeException: " + e.getMessage());
     }
 }
}

