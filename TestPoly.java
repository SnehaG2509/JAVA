class TestPoly
{
public static void main(String args[])
{
PoliticalParty P1=new PoliticalParty();
PoliticalParty P2=new PoliticalParty();

P1.getData();
P1.putData();
P2.getData();
P2.putData();
System.out.println("Total Leaders MLA's of one party:"+(P1.total_MLA+P1.total_mp));
System.out.println("Total Leaders MLA's of second party:"+(P2.total_MLA+P2.total_mp));


}
}