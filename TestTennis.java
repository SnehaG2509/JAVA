class TestTennis
{
public static void main(String args[])
{
Tennis t1=new Tennis();
Tennis t2=new Tennis();
Tennis t3=new Tennis();
t1.getData();
t1.putData();
t2.getData();
t2.putData();
t3.getData();
t3.putData();
if(t1.total_championship>t2.total_championship && t1.total_championship>t3.total_championship)
{
System.out.println("Real champion is:");
t1.putData();
}
else if(t2.total_championship>t3.total_championship && t2.total_championship>t1.total_championship)
{
System.out.println("Real champion is:");
t2.putData();
}
else
{
System.out.println("Real champion is:");
t3.putData();
}

}



}