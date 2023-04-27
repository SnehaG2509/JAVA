import java.util.*;
class Tennis
{
String player_name;
String country_name;
int total_championship;
Scanner sc=new Scanner(System.in);

void getData()
{
System.out.println("Enter player name");
player_name=sc.nextLine();
System.out.println("Enter the country name");
country_name=sc.nextLine();
System.out.println("Enter total championship");
total_championship=sc.nextInt();
}

void putData()
{
System.out.println("Player name:"+player_name);
System.out.println("Country name:"+country_name);
System.out.println("Country name:"+total_championship);




}



}