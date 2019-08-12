package myJava.collections.list.linkList;


/**
 * @author Mohit
 * 
 *         This program is used to add string to vector and retrieve the objects
 *         via enumeration and itrator.
 */

class Link {

	public int iData;
	public Link next;

	public Link(int iData) {
		super();
		this.iData = iData;
	}

	@Override
	public String toString() {
		return "{" + iData + "}";
	}
}

class LinkedList {
	private Link first;

	public LinkedList() {
		super();
		this.first = null;
	}

	public boolean isEmpty() {
		return (first == null);
	}

	public void insertFirst(int id) {
		Link newLink = new Link(id);
		newLink.next = first;
		first = newLink;
	}

	public Link deleteFirst() {
		Link temp = first;
		first = first.next;
		return temp;
	}

	@Override
	public String toString() {
		String str = "";
		Link current = first;
		while (current != null) {
			str = current.toString();
			current = current.next;
		}
		return str;
	}
}

public class LinkListDemo {

	public static void main(String[] args) {
		LinkedList linkList = new LinkedList();
		linkList.insertFirst(22);
		linkList.insertFirst(44);
		linkList.insertFirst(66);
		System.out.println(linkList);

		while (!linkList.isEmpty()) {
			Link aLink = linkList.deleteFirst();
			System.out.println("Deleted " + aLink);
			System.out.println(" ");
		}
		System.out.println(linkList);
	}
}
