package main;
import static org.junit.Assert.*;
import org.junit.Test;
import main.WordSearch;

public class WordSearchTest {

	//test for left to right reading
	@Test
	public void LeftToRigth() {
		WordSearch leftToRight = new WordSearch();
		String word = leftToRight.leftToRight("SCOTTY");
		assertEquals("SCOTTY", word);
	}
	
	//test for right to left reading
	@Test
	public void RightToLeft () {
		WordSearch rightToLeft = new WordSearch();
		String word = rightToLeft.rightToLeft("KIRK");
		assertEquals("KIRK", word);
	}
	
	//test for reading up the grid
	@Test
	public void Up() {
		WordSearch up = new WordSearch();
		String word = up.Up("KHAN");
		assertEquals("KHAN", word);
	}
	
	//test for reading down the grid
	@Test
	public void Down() {
		WordSearch down = new WordSearch();
		String word = down.Down("BONES");
		assertEquals("BONES", word);
	}
	
	//test for diagonally up right
	/*@Test
	public void DiagUpRight() {
		WordSearch upRight = new WordSearch();
		String word = upRight.diagUpRight("");
		assertEquals("", word);
	}*/
	
	//test for diagonally down right
	@Test 
	public void DiagDownRight() {
		WordSearch downRight = new WordSearch();
		String word = downRight.diagDownRight("");
		assertEquals("", word);
	}
}
