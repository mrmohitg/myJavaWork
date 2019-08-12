package myJava.inputOutput.externalization;

import java.io.Externalizable;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectInputStream;
import java.io.ObjectOutput;
import java.io.ObjectOutputStream;

class Car implements Externalizable {
	static int age;
	String name;
	int year;

	public Car() {
		System.out.println("Default Constructor");
	}

	Car(String n, int y) {
		name = n;
		year = y;
		age = 10;
	}

	public void writeExternal(ObjectOutput out) throws IOException {
		out.writeObject(name);
		out.writeInt(year);
		out.writeInt(age);
	}

	public void readExternal(ObjectInput in) throws IOException, ClassNotFoundException {
		name = (String) in.readObject();
		year = in.readInt();
		age = in.readInt();
	}

	public String toString() {
		return ("Name :" + name + "\n" + "Year :" + year + "\n" + "Age" + age);
	}
}

public class ExternalizableDemo {
	public static void main(String... args) {
		Car car = new Car("Audi", 2014);
		Car newCar = null;
		try {
			FileOutputStream fout = new FileOutputStream("Tmp");
			ObjectOutputStream oos = new ObjectOutputStream(fout);
			oos.writeObject(car);
			oos.flush();
		} catch (Exception e) {
			System.out.println(e);
		}
		try {
			FileInputStream fin = new FileInputStream("Tmp");
			ObjectInputStream ois = new ObjectInputStream(fin);
			newCar = (Car) ois.readObject();
		} catch (Exception e) {
			System.out.println(e);
		}
		System.out.println("The original car is ");
		System.out.println(car);
		System.out.println("The new car is ");
		System.out.println(newCar);
	}
}