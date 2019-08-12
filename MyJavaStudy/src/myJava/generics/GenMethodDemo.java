package myJava.generics;
public class GenMethodDemo
{
static <T,V extends T>
boolean isIn(T x, V[] y)
{
for(int i=0;i<y.length;i++)
if(x.equals(y[i]))
return true;
return false;
}
static <T extends Number> double add(T x, T y)
{
double d = x.doubleValue()+y.doubleValue();
return d;
}
public static void main(String...args)
{
//Use isIn() on Integers
Integer nums[] = {1,2,3,4,5,6,7,8};
if(isIn(2,nums))
System.out.println("2 is present in nums");
if(!isIn(9,nums))
System.out.println("9 is not present in nums");
//Use isIn() on String
String str[] = {"One","Two","Three"};
if(isIn("Two",str))
System.out.println("Two is present in str");
if(!isIn("Seven",str))
System.out.println("Seven is not present in str.");
System.out.println(add(10,20));
System.out.println(add(10.5f,20.5f));
}
}