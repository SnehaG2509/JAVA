import java.util.*;
class Examination
{
int year;
int total_std_appeared;
Scanner sc=new Scanner(System.in);
void getData()
{
System.out.println("Enter the year");
year=sc.nextInt();
System.out.println("Enter the total std Appeared");
total_std_appeared=sc.nextInt();
}

void putData()
{
System.out.println("Year:"+year);
System.out.println("total Student Appeared"+total_std_appeared);
}






}