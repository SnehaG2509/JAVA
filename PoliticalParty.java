import java.util.*;
class PoliticalParty
{
String name;
int total_MLA;
int total_MLC;
int total_mp;
Scanner sc=new Scanner(System.in);

void getData()
{
System.out.println("Enter the name");
name=sc.nextLine();
System.out.println("Enter the total MLA");
total_MLA=sc.nextInt();
System.out.println("Enter the total MLC");
total_MLC=sc.nextInt();
System.out.println("Enter the total mp");
total_mp=sc.nextInt();
}

void putData()
{
System.out.println("Name:"+name);
System.out.println("Total MLA:"+total_MLA);
System.out.println("Total MLC:"+total_MLC);
System.out.println("Total MP:"+total_mp);
}


}