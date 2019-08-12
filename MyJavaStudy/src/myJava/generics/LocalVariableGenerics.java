package myJava.generics;
class LocalGen
{
private double val;
<T extends Number> LocalGen(T arg)
{
val = arg.doubleValue();
}
void showValue()
{
System.out.println("Val : "+val);
}
}
public class LocalVariableGenerics
{
public static void main(String ...ag)
{
//LocalGen ob1 = new LocalGen('a');
//ob1.showValue();
LocalGen ob2 = new LocalGen(100);
ob2.showValue();
LocalGen ob3 = new LocalGen(123.5f);
ob3.showValue();
}
}