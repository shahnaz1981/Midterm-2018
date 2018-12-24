package datastructure;

import java.io.BufferedReader;
import java.io.FileReader;
import java.sql.SQLOutput;
import java.util.*;

public class DataReader {

	public static void main(String[] args) {
		/*
		 * User API to read the below textFile and print to console.
		 * Use BufferedReader class. 
		 * Use try....catch block to handle Exception.
		 *
		 * Use any databases[MongoDB, Oracle, MySql] to store data and retrieve data.
		 *
		 * After reading from file using BufferedReader API, store each word into Stack and LinkedList. So each word
		 * should construct a node in LinkedList.Then iterate/traverse through the list to retrieve as FIFO
		 * order from LinkedList and retrieve as FILO order from Stack.
		 *
		 * Demonstrate how to use Stack that includes push,peek,search,pop elements.
		 * Use For Each loop/while loop/Iterator to retrieve data.
		 */
		FileReader fr=null;
		BufferedReader br=null;
		String path="C:\\Users\\mohamed .LAPTOP-QCE4AIJL\\Desktop\\Midterm18\\MidtermNovember2018\\src\\data\\self-driving-car.txt";
		//String path = System.getProperty("user.dir") + "/src/data/self-driving-car.txt";
		try{
			fr=new FileReader(path);}catch( Exception e){
			System.out.println("we do not get file");

		}

		String data;
		try{

			br=new BufferedReader(fr);
			while((data =br.readLine())!=null)
				System.out.println(data);}catch(Exception e){
			System.out.println("We can not read the file");
		}
		finally{
			if(fr!=null){
				fr= null;}
			if(br!=null) {
				br = null;
			}
			System.out.println("now closed");

		}

		//String path = System.getProperty("user.dir") + "/src/data/self-driving-car.txt";

		Stack<String>car =new Stack();
		car.push("Marcedes");
		car.push("Bmw");
		car.push("Tesla");
		System.out.println(car.peek());
		System.out.println(car.pop());
		System.out.println(car.pop());
		System.out.println(car.pop());

		Queue car1=new LinkedList();
		car1.add("Marcedes");
		car1.add("Bmw");
		car1.add("Tesla");
		System.out.println(car1.peek());

		System.out.println(((LinkedList) car1).pop());
		System.out.println(((LinkedList) car1).pop());
		System.out.println(((LinkedList) car1).pop());

		for(String st:car ){
			System.out.println(st);
		}

		Iterator it= car.listIterator();

		while(it.hasNext()){
			System.out.println(it.next());
		}


	}

}
