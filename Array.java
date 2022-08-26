import java.util.*;
class Student {
  String name;
  int mark;
  void SetDetails(String n, int m) {
    name = n;
    mark = m;
  }
  public void printdetails() {
    System.out.println("Name :" + name);
    System.out.println("Marks :" + mark);
  }
}
class Test {
  public static void main(String args[]) {
    Student[] st = new Student[5];
    Scanner s = new Scanner(System.in);
    for (int i = 0; i < 5; i++) {
      System.out.println("Student No: " + (i + 1));
      System.out.println("Enter Name :");
      String name = s.next();
      System.out.println("Enter Mark : ");
      int mark = s.nextInt();
      st[i] = new Student();
      st[i].SetDetails(name, mark);
    }
    for (int i = 0; i < 5; i++) {
      st[i].printdetails();
    }
  }
}
 
