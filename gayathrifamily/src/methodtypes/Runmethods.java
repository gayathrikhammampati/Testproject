package methodtypes;

public class Runmethods {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Gayathrimethods gm= new Gayathrimethods();
gm.add();
gm.adding(50, 90);
int a;
a= gm.hashCode();
System.out.println(a);
String s;
s=gm.toString();
System.out.println(s);
Class<?> C=gm.getClass();
System.out.println(C);
boolean b=gm.equals(gm);
System.out.println(b);
	}
}
