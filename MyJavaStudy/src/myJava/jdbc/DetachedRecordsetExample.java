package myJava.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.Statement;
import java.util.Enumeration;
import java.util.Vector;

class DetachedRecordsetExample {
	Vector<String[]> row, column;
	int colno;
	ResultSet rs;
	ResultSetMetaData rsmd;
	Enumeration<String[]> en;
	Object next;

	public void addRow(String st[]) {
		row.add(st);
	}

	DetachedRecordsetExample() {
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "system", "oracle");
			Statement stmt = con.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_UPDATABLE);
			rs = stmt.executeQuery("select * from Employee");
			rsmd =  rs.getMetaData();
			colno = rsmd.getColumnCount();
			row = new Vector<String[]>();
			column = new Vector<String[]>();
			String str[] = new String[colno];
			for (int i = 0; i < colno; i++) {
				str[i] = ((ResultSetMetaData) rsmd).getColumnName(i + 1);
			}
			column.add(str);
			while (rs.next()) {
				String str1[] = new String[colno];
				for (int i = 0; i < colno; i++) {
					str1[i] = rs.getString(i + 1);
				}
				addRow(str1);
			}
			en = row.elements();
		} catch (Exception e) {
			System.out.println(e);
		}
	}

	public boolean first() {
		if (row.firstElement() != null) {
			this.next = (Object) row.firstElement();
			return true;
		} else
			return false;
	}

	public boolean last() {
		if (row.lastElement() != null) {
			this.next = (Object) row.lastElement();
			return true;
		} else
			return false;
	}

	public boolean next() {
		if (en.hasMoreElements()) {
			Object o1 = en.nextElement();
			this.next = o1;
			return true;
		} else
			return false;
	}

	public boolean previous() {
		int p = row.indexOf(next);
		if (absolute(p - 1)) {
			absolute(p);
			return true;
		} else
			return false;
	}

	public boolean isFirst() {
		Object o1 = this.next;
		Object o2 = row.firstElement();
		if (o1.equals(o2))
			return true;
		else
			return false;
	}

	public boolean isLast() {
		Object o1 = this.next;
		Object o2 = row.lastElement();
		if (o1.equals(o2))
			return true;
		else
			return false;
	}

	public boolean absolute(int rowno) {
		System.out.println("Size " + row.size());
		if (rowno >= 1 && rowno <= row.size()) {
			this.next = row.elementAt(rowno - 1);
			return true;
		} else
			return false;
	}

	public Object getObject(int pos) {
		String a[] = (String[]) next;
		return (a[pos - 1]);
	}

	public static void main(String... args) {
		DetachedRecordsetExample drs = new DetachedRecordsetExample();
		while (drs.next()) {
			System.out.println("is first " + drs.isFirst());
			System.out.println("is last " + drs.isLast());
			System.out.println("1 " + drs.getObject(1));
			System.out.println("2 " + drs.getObject(2));
			System.out.println("3 " + drs.getObject(3));
		}
		drs.absolute(2);
		System.out.println("absolute " + drs.getObject(1));
		drs.first();
		System.out.println("first " + drs.getObject(1));
		drs.last();
		System.out.println("last " + drs.getObject(1));
	}
}