class TestForest
{
public static void main(String args[])
{
Forest f1=new Forest();
Forest f2=new Forest();
System.out.println("for 1st Forest");
f1.getData();
f1.putData();
System.out.println("for 2nd Forest");
f2.getData();
f2.putData();
if(f1.area_in_sqr_cm/f1.count_of_animals>f2.area_in_sqr_cm/f2.count_of_animals)
{
System.out.println("First forest is more space");
}
else
{
System.out.println("Second forest is more space");
}
}
}
}