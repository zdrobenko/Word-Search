package main;
import java.util.ArrayList;

public class WordSearch {
	
	//create a 2D array for the grid
	static char grid[][] = {{}};
	
	public static void main(String[] args) {
		//I see what you guys did there bringing in Star Trek
		//This prints out all of the words that are going to be searched
		System.out.println("BONES, KHAN, KIRK, SCOTTY, SPOCK, SULU, UHURA");
		
		//creates an Array List for all of the names to be added to be searched
		ArrayList<String> wordSearch;
		
		//add all of the words
		wordSearch = new ArrayList();
		
		wordSearch.add("BONES");
		wordSearch.add("KHAN");
		wordSearch.add("KIRK");
		wordSearch.add("SCOTTY");
		wordSearch.add("SPOCK");
		wordSearch.add("SULU");
		wordSearch.add("UHURA");
		
		//use a for loops to search all directions 
		//within wordSearch
		//TODO: need to write all of the functions 
		//to make this work
		for(String search : wordSearch) {
			
		}

	}
	
	
}