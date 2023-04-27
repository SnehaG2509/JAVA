import java.util.*;
class Forest
{
int area_in_sqr_cm;
int count_of_animals;
Scnner sc=new Scanner(System.in);
void getData()
{
System.out.println("Enter the area in square cm");
area_in_sqr_cm=sc.nextInt();
System.out.println("Enter the count of animals");
count_of_animals=sc.nextInt();
}
void putData()
{
System.out.println("Area:"+area_in_sqr_cm);
System.out.println("count of animals:"+count_of_animals);
}

}
