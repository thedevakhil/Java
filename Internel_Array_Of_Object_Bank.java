import java.util.*;
class BankAccount {
  int AccNo;
  String Cname;
  String Atype;
  int Balance;
  void GetDeatils(int Acno, String name, String atype, int balance) {
    AccNo = Acno;
    Cname = name;
    Atype = atype;
    Balance = balance;

  }
  void DisplayDetails() {

    System.out.println(AccNo + "\t\t" + Cname + "\t" + Atype + "\t\t" + Balance);

  }
  void Deposit(int amt) {
    Balance = Balance + amt;
  }

  void widrow(int amt) {
    Balance = Balance - amt;
  }
}
class Bank {
  public static void main(String args[]) {
    int a;
    String k;
    String c;
    int d, n, op, ac, amt, flag = 1;
    Scanner s = new Scanner(System.in);
    BankAccount b[] = new BankAccount[5]; //creating array if object

    System.out.println("Enter Number of Coustomer");
    n = s.nextInt();
    for (int i = 1; i <= n; i++) {
      System.out.println("Enter  details of customer " + i + " \nAccount Number");
      a = s.nextInt();
      System.out.println("Enter Customer Name");
      k = s.next();
      System.out.println("Enter Account Type(SB/CA)");
      c = s.next();
      System.out.println("Enter Customer Balance Amount");
      d = s.nextInt();
      b[i] = new BankAccount(); //allocating memory for oject
      b[i].GetDeatils(a, k, c, d); /*"a" is the account number,"k" is the  Customer name,"c" is the account number,"d" is the current balance of customer when created*/
    }

    while (true) {
      System.out.println("press 1 to Deposit\npress 2 to Widrow\npress 3 to dispaly");
      op = s.nextInt();
      if (op == 3) 
      { //to Display the deatils
        System.out.println("Coustomer Details");
        System.out.println("Account Number\tName\tAccount_type\tBalance");
        for (int i = 1; i <= n; i++) {
          b[i].DisplayDetails();
        }
      } 
      else 
      {
        System.out.println("Enter Account Number");
        ac = s.nextInt();
        for (int i = 1; i <= n; i++) {
          if (b[i].AccNo == ac) { //if the givern number match with any of the account number
            flag = 0; //this falag is set to 0 if we find a account number
            System.out.println("Enter Amount");
            amt = s.nextInt();
            switch (op) {
            case 1:
              b[i].Deposit(amt);
              break;
            case 2:
              b[i].widrow(amt);
              break;

            }
          }
        }
       
      }
       if (flag == 1) 
          System.out.println("***Invalid Account Number***");
    }
  }
}
