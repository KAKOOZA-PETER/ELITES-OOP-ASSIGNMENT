package datatypepracticeapp;

public class Datatypepractice {
	//declared as instance variables
	String names="Peter,Ronald,Sophia,Angel";
		 Integer[] numbers= {-10,-9,5,};
		static char alphabet='A';//declared as static variables	
	public static void main(String[] args) {
		//declared as local variables
		float weight=39.9F;
		byte num=10;
		System.out.println(weight);
		System.out.println(num);
		// TODO Auto-generated method stub
		//this is variables for all primitive data types
byte telephone=10;
int temperature=-5;
short shortperiod=40;
long longdistance=50L;
float meter=34.6F;
char grade='A';
double tempereturedifference=0.000001234F;
boolean female=true;
boolean male=false;
//assigning constants in simple arithmetical operations
final int X=2+4;
final short Y=20*4;
final long B=20-11;
final byte V=4/2; 
final float T=200.0F%34.9F;
//implicit conversion
byte age=34;
int numberline=age;
short shortdistance=50;
long longjourney=shortdistance;
float height=34.6F;
double area=height;
char alphabet='A';
int thermometor=alphabet;
//explicit conversion
double currency=200000.1000;
float kilogram=(float) currency;
long longsize=42;
int electriccharge=(int) longsize;
short shortlevel=45;
char symbol=(char) shortlevel;
int velocity=-5;
byte position=(byte) velocity;
System.out.println(telephone);
System.out.println(temperature);
System.out.println(shortperiod);
System.out.println(shortdistance);
System.out.println(meter);
System.out.println(grade);
System.out.println(tempereturedifference);
System.out.println(female);
System.out.println(male);
System.out.println(X);
System.out.println(Y);
System.out.println(B);
System.out.println(V);
System.out.println(T);
System.out.println(numberline);
System.out.println(longdistance);
System.out.println(longjourney);
System.out.println(height);
System.out.println(kilogram);
System.out.println(electriccharge);
System.out.println(symbol);
System.out.println(position);
System.out.println(area);
System.out.println(alphabet);
System.out.println(thermometor);

			

	}

}
