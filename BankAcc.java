import java.util.*;
class BankAcc
{
int balance,acc_no;
String name;
Scanner sc=new Scanner(System.in);
void getData()
{
System.out.println("Enter the name");
name=sc.nextLine();
System.out.println("Enter the balance");
balance=sc.nextInt();
System.out.println("Enter the acc num");
acc_no=sc.nextInt();
}

void display()
{
System.out.println("Balance:"+balance+"\nName:"+name+"\nAcc number:"+acc_no);
}

void deposite()
{
int amount;
System.out.println("Enter the deposited amount");
amount=sc.nextInt();
balance=balance+amount;
display();
}
void withdraw()
{
int wd;
System.out.println("Enter the withdrwal amount");
wd=sc.nextInt();

if(balance>wd)
{
balance=balance-wd;
display();
}
else
{
System.out.println("Insufficiant balance");
}

}
}