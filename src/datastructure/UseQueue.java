package datastructure;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;

public class UseQueue {

	public static void main(String[] args) {
		/*
		 * Demonstrate how to use Queue that includes add,peek,remove,pool elements.
		 * Use For Each loop and while loop with Iterator to retrieve data.
		 * 
		 */

		Queue<String> student=new LinkedList();
		student.add("Tas");
		student.add("Pol");
		student.add("Jaj");
		System.out.println(student.peek());
		System.out.println(((LinkedList) student).removeFirst());
		System.out.println(student.poll());
		System.out.println(student.poll());

		for(String st:student){
			System.out.println(st);
		}
		Iterator it=((LinkedList<String>) student).listIterator();
		while (it.hasNext()){
			System.out.println(it.next());
		}


	}

}
