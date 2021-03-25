/*package ie.gmit.dip;

//This class builds the database.

import java.util.*;
import java.io.*;
	
//shouldn't call it Parser, doing other stuff
public class Database {

	public static void main(String[] args) throws Exception {
				
		private Map<String, String> map = new TreeMap();
	
		private Set<String> set = new TreeSet();
		//download and save Google_1000.txt to desktop
		private static final String googleWordFile="./google-1000.txt";
		
		private static final String mobyThesaurus2File = "./MobyThesaurus";
		
	public Database(TreeMap<String, String> map, TreeSet<String> set) {
			
			//super();
			this.setMap(map);
			this.set = set;
			// TODO Auto-generated constructor stub
		}
	

		//Set your keys with the Google Words
		public void initGoogleWordFile() throws Exception {
			
			BufferedReader br = new BufferedReader(new InputStreamReader((new FileInputStream(googleWordFile))));
		
			//String line = null;
			String line;
			
			while((line = br.readLine()) != null) {
				getMap().put(line, line); //fill it with line O(log(n)) b/c using a TreeSet
				set.add(line);// O(log(n)) b/c TreeSet
			}
		}
			
		//Set up thesaurus to check for word synonyms with googleWord
		public void initMobyThesaurusFile() throws Exception{
			
			//maybe this should be broken up into different methods
			BufferedReader br = new BufferedReader(new InputStreamReader((new FileInputStream(mobyThesaurus2File))));
			//String line = null;
			String line;
			
			while ((line = br.readLine()) != null) {
				String[] words = line.split(", ");
			}
		}

		public void buildDatabase(String[] words) {
			String googleWord = null;
			//String googleWord ;
			for(String word: words) {
				if (set.contains(word)) {
					
					googleWord = word;						
					break;
				}
		}
		
			if (googleWord != null) {

				addAll(words, googleWord);
			

			}
	}

	private void addAll(String[] words, String googleWord) {
		for (String word: words) {
			getMap().put (word.toLowerCase(), googleWord); //maps key to Google value
		}
	}

	public Map<String, String> getMap() {
		return map;
	}

	public void setMap(Map<String, String> map) {
		this.map = map;
	}
	
		
		}
	}
*/