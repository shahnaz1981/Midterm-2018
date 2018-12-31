package datastructure;

import databases.ConnectToSqlDB;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class UseArrayList {

	public static void main(String[] args) {
		/*
		 * Demonstrate how to use ArrayList that includes add,peek,remove,retrieve elements.
		 * Use For Each loop and while loop with Iterator to retrieve data.
		 * Store all the sorted data into one of the databases.
		 *
		 */
		new ArrayList<String>();
		ArrayList<String> student = new ArrayList<>();
		student.add("Raj");
		student.add("Jhon");
		student.add("Roni");
		student.add("Jaj");

		System.out.println(student.remove("Jhon"));
		System.out.println(student);

		Iterator it = student.listIterator();
		while (it.hasNext()) {
			System.out.println(it.next());
		}

		for (String st : student) {
			System.out.println(st);
		}
		ConnectToSqlDB connect = new ConnectToSqlDB();
List list = student;
		try{connect.insertDataFromArrayListToSqlTable(list , "Table","name");

			//connect.insertDataFromArrayListToSqlTable(student, "Table", "name");
			connect.readDataBase("Table", "name");
		} catch (Exception e) {
			System.out.println(e);
		}
	}
}


