import java.util.*;

public class Main {
  public static void main(String[] args) {

    //Object of Class
    BankAccount obj1 = new BankAccount("XYZ", "BA0001");
    obj1.showUI();
  }
}

class BankAccount
{
  double balance;
  double previousTransaction;
  String customerName;
  String customerID;

  //let's create a constructor for this class
  BankAccount(String cname, String cid)
  {
    customerName = cname;
    customerID = cid;
  }

  //create a method which will calculate their balance and previous previousTransaction
  void deposit(/*data type:*/double /*name*/ amount)
  {
    if(amount != 0)
    {
      balance =+ amount;
      previousTransaction = amount; 
    }
  }
  
  void withdraw(double amount)
  {
    if (amount!= 0)
    {
      balance =- amount;
      previousTransaction = amount;
    }
  }
  
  void getPreviousTransaction()
  {
    if(previousTransaction > 0)
    {
      System.out.println("You deposited: "+ previousTransaction);
    }
    else if(previousTransaction < 0 )
    {
      System.out.println("You withdrew: "+ Math.abs(previousTransaction));
    }
    else
    {
      System.out.println("No transaction occurred.");
    }
  }

  void showUI()
  {
    char option = '\0';
    Scanner scan = new Scanner(System.in);

    System.out.println("Welcome "+ customerName);
    System.out.println("Your ID is"+ customerID);
    System.out.println("\n");
    System.out.println("Your options are: ");
    System.out.println("A. Check Balance");
    System.out.println("B. Depost");
    System.out.println("C. Withdraw");
    System.out.println("D. Previous Transaction");
    System.out.println("E. Exit");

    do
    {
      System.out.println("============================================================================");
      System.out.println("Please choose your option");
      option = scan.next().charAt(0);
      System.out.println("\n");

      switch(option)
      {
        case 'A':
        System.out.println("==============================");
        System.out.println("Your current balance is "+ balance);
        System.out.println("==============================");
        System.out.println("\n");
        break;

        case 'B':
        System.out.println("==============================");
        System.out.println("Enter an amount to deposit: ");
        System.out.println("==============================");
        double amount = scan.nextInt();
        deposit(amount);
        System.out.println("\n");
        break;

        case 'C':
        System.out.println("==============================");
        System.out.println("Enter an amount to withdraw: ");
        System.out.println("==============================");
        double amount2 = scan.nextDouble();
        withdraw(amount2);
        System.out.println("\n");
        break;

        case 'D':
        System.out.println("==============================");
        System.out.println("Your previous transaction was: ");
        getPreviousTransaction();
        System.out.println("==============================");
        System.out.println("\n");
        break;

        case 'E':
        System.out.println("=================================================");
        break;

        default: System.out.println("Please enter a value listed above");
        break;
      }

    } while(option!= 'E');
    System.out.println("Thank you for using our services!");

  }
}