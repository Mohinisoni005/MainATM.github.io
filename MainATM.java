import java.util.Scanner;

public class MainATM
{


public static void main( String args[] ) {
int account_balance = 100000;
int withdraw, deposit, transfer,phone;
String fullname,email;
Scanner sc = new Scanner(System.in);
 System.out.println("Please fill in the following Login details");
 System.out.println();
 System.out.println("Enter your full name");
 System.out.println();
 fullname = sc.nextLine();
 System.out.println();
 System.out.println("Enter your email id");
 System.out.println();
 email = sc.nextLine();
 System.out.println();
 
while(true)
{
System.out.println("Namaskar");
System.out.println( "Welcome to HP ATM " );
System.out.println( "Select 1 for balance details " );
System.out.println( "Select 2 to perform withdrawal operation" );
System.out.println( "Select 3 to perform deposit operation" );
System.out.println( "Select 4 to perform transfer operstion" );
System.out.println( "Select 5 for EXIT " );
System.out.print( "Select the option from the given options" );
int option = sc.nextInt();
switch(option)
{
case 1:
printBalance(account_balance);
System.out.println("");
break;

case 2:
System.out.print( "Enter the amount to be withdrawal: " );
withdraw = sc.nextInt();
perform_withdrawal(account_balance, withdraw);
break;

case 3:
System.out.print("Enter the amount to be deposited: ");
deposit = sc.nextInt();
perform_deposit(account_balance, deposit);
break;

case 4:
System.out.print("Enter the amount to be transferred: ");
transfer = sc.nextInt();
perform_transfer(account_balance, transfer);
break;

case 5:
System.exit(0);
}
}
}

public static void printBalance(int account_balance)
{
System.out.println(" The Current Balance : " + account_balance);
System.out.println();
}

public static int perform_withdrawal(int account_balance, int withdrawal_amount)
{
System.out.println("The withdrawing Amount is : " + withdrawal_amount);
if (account_balance >= withdrawal_amount) {
account_balance = account_balance - withdrawal_amount;
System.out.println( "Please collect your money and remove the card" );
printBalance(account_balance);
}
else {
System.out.println( "Sorry! the balanace is insufficient." );
System.out.println();
}
return account_balance;
}

public static int perform_deposit(int account_balance, int deposit_amount)
{
System.out.println(" The depositing amount is : " + deposit_amount);
account_balance = account_balance + deposit_amount;
System.out.println( "Your Money has been successfully deposited" );
printBalance(account_balance);
return account_balance;
}

public static int perform_transfer(int account_balance, int transfer_amount)
{
System.out.println("The withdrawing Amount is : " + transfer_amount);
if (account_balance >= transfer_amount) {
account_balance = account_balance - transfer_amount;
System.out.println( "Your money is transferred. Please remove your card" );
printBalance(account_balance);
}
else {
System.out.println( "Sorry! the balanace is insufficient." );
System.out.println();
}
return account_balance;
}
}

