package com11;
import java.util.ArrayList;
import java.util.Iterator;

public class mainclass1 {

	public static void main(String[] args) {
		ArrayList<Integer> l1=new ArrayList<Integer>();
		l1.add(123);
		l1.add(45);
		l1.add(300);
		l1.add(456);
		l1.add(676);
		Iterator<Integer> itr1=l1.iterator();
		while(itr1.hasNext()) {
			Integer element=itr1.next();
			System.out.println(element);
		}

	}

}
