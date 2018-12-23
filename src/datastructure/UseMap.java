package datastructure;

import databases.ConnectToSqlDB;

import java.util.*;

public class UseMap {

	public static void main(String[] args) {
		/*
		 * Demonstrate how to use Map that includes storing and retrieving elements.
		 * Add List<String> into a Map. Like, Map<String, List<string>> list = new HashMap<String, List<String>>();
		 * Use For Each loop and while loop with Iterator to retrieve data.
		 *
		 * Use any databases[MongoDB, Oracle, MySql] to store data and retrieve data.
		 */

		List<String> bdCity = new ArrayList<>();
		bdCity.add("Dhaka");
		bdCity.add("Khulna");
		bdCity.add("Jessore");

		List<String> usaCity = new ArrayList();
		usaCity.add("NY");
		usaCity.add("NJ");
		usaCity.add("CT");




		Map<String, List<String>> map = new HashMap<String,List<String>>();
		map.put("Bangladesh", bdCity);
		map.put("USA", usaCity);

		for(Map.Entry key: map.entrySet()){
			System.out.println(key.getKey()+" "+key.getValue());
		}



		Iterator it =map.entrySet().iterator();
		while(it.hasNext()) {
			System.out.println(it.next());


			ConnectToSqlDB connect = new ConnectToSqlDB();
			List<String> mapdata = new ArrayList();

			try{connect.insertDataFromMapToSqlTable((Map<String, List<String>>) bdCity,"Table1", "bdCity");
			connect.insertDataFromMapToSqlTable((Map<String, List<String>>) usaCity,"Table2","usaCity");
		    mapdata=connect.readDataBase("Table1","bdCity");


			}catch (Exception e){
				System.out.println("the error is "+e);
			}

			System.out.println(mapdata);
		}

	}

}


