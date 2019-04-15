package main;
import java.util.ArrayList;

public class WordSearch {
	
	//create a 2D array for the grid
	static char grid[][] = {{'U','M','K','H','U','L', 'K','I','N','V','J','O','C','W','E'},
		{'L','L','S','H','K','Z','Z','W','Z','C','G','J','U','Y','G'},
		{'H','S','U','P','J','P','R','J','D','H','S','B','X','T','G'},
		{'B','R','J','S','O','E','Q','E','T','I','K','K','G','L','E'},
		{'A','Y','O','A','G','C','I','R','D','Q','H','R','T','C','D'},
		{'S','C','O','T','T','Y','K','Z','R','E','P','P','X','P','F'},
		{'B','L','Q','S','L','N','E','E','E','V','U','L','F','M','Z'},
		{'O','K','R','I','K','A','M','M','R','M','F','B','A','P','P'},
		{'N','U','I','I','Y','H','Q','M','E','M','Q','R','Y','F','S'},
		{'E','Y','Z','Y','G','K','Q','J','P','C','Q','W','Y','A','K'},
		{'S','J','F','Z','M','Q','I','B','D','B','E','M','K','W','D'},
		{'T','G','L','B','H','C','B','E','C','H','T','O','Y','I','K'},
		{'O','J','Y','E','U','L','N','C','C','L','Y','B','Z','U','H'},
		{'W','Z','M','I','S','U','K','U','R','B','I','D','U','X','S'},
		{'K','Y','L','B','Q','Q','P','M','D','F','C','K','E','A','B'}};
	
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
			leftToRight(search);
			rightToLeft(search);
		}
	}
	
	public static void displayGrid(char grid[][]) {
		//prints out the grid to be used for the word search
		for(int i = 0; i < grid.length; i++) {
			for (int j = 0; j < grid[i].length; j++) {
				System.out.println(grid[i][j] + " ");
			}
			System.out.println("");
		}
	}
	
	//first right the function to find words left to right in rows
	//@Params word = the word to search
	public static String leftToRight(String word) {
		//create a counter for the the letters
		int counter = 0;
		String wordSearch = "";
		
		for (int i = 0; i < grid.length; i++) {
			for (int j = 0; j < grid[i].length; j++) {
				if (word.charAt(counter) == grid[i][j]) {
					counter++;
				}
				else {
					counter = 0;
				}
				if (counter == word.length()) {
					System.out.println(word + ":" + "\t");
					for (int col = j - counter + 1; col <= j; col++) {
						System.out.println(" " + "(" + col + "," + i + ")");
						counter = 0;
					}
					System.out.println("");
					wordSearch = word;
				}
			}	
		}
		return wordSearch;
	}
	
	//write the function to read from Right to Left
	//this will be the opposite of Left to Right
	//@Params word = the word to search
	public static String rightToLeft(String word) {
		//create a counter for the letters
		int counter = 0;
		String wordSearch = "";
		for (int i = 0; i < grid.length; i++) {
			//going backwards now
			for (int j = grid[i].length - 1; j >= 0; j--) {
				if (word.charAt(counter) == grid[i][j]) {
					counter++;
				}
				else {
					counter = 0;
				}
				if (counter == word.length()) {
					System.out.println(word + ":");
					for (int col = j + counter - 1; col >= j; col--) {
						System.out.println(" " + "(" + col + "," + i + ")");
						counter = 0;
					}
					System.out.println("");
					wordSearch = word;
				}
			}
		}
		
		return wordSearch;
	}
}