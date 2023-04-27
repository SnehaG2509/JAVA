class TestExam
{
public static void main(String args[])
{
Examination e1=new Examination();
Examination e2=new Examination();
Examination e3=new Examination();
e1.getData();
e1.putData();
e2.getData();
e2.putData();
e3.getData();
e3.putData();

if(e1.total_std_appeared>e2.total_std_appeared && e1.total_std_appeared>e3.total_std_appeared)
{
System.out.println("Largest Number of student Appeared is:"+e1.total_std_appeared);
}

else if(e2.total_std_appeared>e1.total_std_appeared && e2.total_std_appeared>e3.total_std_appeared)
{
System.out.println("Largest Number of student Appeared is:"+e2.total_std_appeared);
}

else
{
System.out.println("Largest Number of student Appeared is:"+e3.total_std_appeared);
}


}
}