import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class VersionOfApp {

	public static void main(String[] args) {
		ArrayList<String> inputData = new ArrayList<>();
		Set<String> uniqueAppName = new HashSet<>();
		

		
		
		BufferedReader reader;
		try {
			reader = new BufferedReader(new FileReader("src/input.txt"));
			String line = reader.readLine();
			while (line != null) {

				line = reader.readLine();
				inputData.add(line);

			}
			reader.close();

			uniqueAppName = processFile(inputData);
		} catch (IOException e) {
			System.out.println("IO error in input.txt");
		}
		BufferedWriter out;
		try {
			out = new BufferedWriter(new FileWriter("src/output.txt"));
			
			for(String s : uniqueAppName) {
				
				out.write(s);
			}
			
			out.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		
		
		
		
		
		
		
		
		
		
		
	}

	public static Set<String> processFile(ArrayList<String> array) {

		array.remove(array.size() - 1);

		Map<String, String> map = new HashMap<>();

		Set<String> uniqueAppName = new HashSet<>();

		for (String string : array) {
			String[] str = string.split(", ");
			map.put(str[1], str[2]);
		}

		for (String string : array) {
			String[] str = string.split(", ");

			String mapVersion = map.get(str[1]);

			int latestVerionFromMap = Integer.parseInt(mapVersion.substring(1, mapVersion.length()));

			String eachInputVersion = str[2];
			int versionFromInput = Integer.parseInt(eachInputVersion.substring(1, eachInputVersion.length()));

			if (versionFromInput < latestVerionFromMap) {
				uniqueAppName.add(str[0]);
			}
		}

		System.out.println(uniqueAppName);
		return uniqueAppName;
	}

}
