Bank ATM Java Code

This Java code is a simple ATM program that allows customers to deposit, withdraw, check their balance and view their previous transaction. It is created using Java programming language.
Class Definitions

    Main class: The main class that initializes the BankAccount class and calls the showUI() method to display the user interface.

    BankAccount class: This class contains the methods and variables for the bank account.

Method Definitions
BankAccount constructor

BankAccount(String cname, String cid)

    This constructor takes two parameters, cname (customer name) and cid (customer ID). It initializes the variables customerName and customerID.

deposit method

void deposit(double amount)

    This method takes a double parameter amount and adds it to the balance. If the amount is not equal to zero, it updates the previousTransaction variable.

withdraw method

void withdraw(double amount)

    This method takes a double parameter amount and subtracts it from the balance. If the amount is not equal to zero, it updates the previousTransaction variable.

getPreviousTransaction method

void getPreviousTransaction()

    This method checks the value of the previousTransaction variable and prints out the relevant message for the previous transaction. If the value is greater than zero, it prints the deposit amount. If the value is less than zero, it prints the withdrawal amount. If the value is zero, it prints a message indicating that no transaction occurred.

showUI method


void showUI()

    This method displays the user interface and allows the user to choose from a list of options. It uses a do-while loop to repeatedly ask for the user's choice until the user chooses to exit.

How to Use

    Compile the Java code using any Java IDE or terminal.
    Run the program.
    Enter the customer name and ID when prompted.
    Choose from the list of options to perform the desired action.
    When you're done, choose 'E' to exit the program.

Note: This code is just for educational purposes and not for use in a real-world banking application. It lacks proper security measures and error handling that would be necessary in a real-world application.
