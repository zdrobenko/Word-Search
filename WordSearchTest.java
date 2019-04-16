package main;
import static org.junit.Assert.*;
import org.junit.Test;
import main.WordSearch;

public class WordSearchTest {

	//test for left to right reading
	@Test
	public void LeftToRigthTest() {
		WordSearch leftToRight = new WordSearch();
		String word = leftToRight.leftToRight("SCOTTY");
		assertEquals("SCOTTY", word);
	}
	
	//test for right to left reading
	@Test
	public void RightToLeftTest() {
		WordSearch rightToLeft = new WordSearch();
		String word = rightToLeft.rightToLeft("KIRK");
		assertEquals("KIRK", word);
	}
	
	//test for reading up the grid
	@Test
	public void UpTest() {
		WordSearch up = new WordSearch();
		String word = up.Up("KHAN");
		assertEquals("KHAN", word);
	}
	
	//test for reading down the grid
	@Test
	public void DownTest() {
		WordSearch down = new WordSearch();
		String word = down.Down("BONES");
		assertEquals("BONES", word);
	}
	
	//test for diagonally down right
	@Test 
	public void DiagDownRightTest() {
		WordSearch downRight = new WordSearch();
		String word = downRight.diagDownRight("SPOCK");
		assertEquals("SPOCK", word);
	}
	
	//test for diagonally up left
	@Test
	public void DiagUpLeftTest() {
		WordSearch upLeft = new WordSearch();
		String word = upLeft.diagUpLeft("SULU");
		assertEquals("SULU", word);
	}
	
	//test for diagonally down left
	@Test
	public void DiagDownLeftTest() {
		WordSearch downLeft = new WordSearch();
		String word = downLeft.diagDownLeft("UHURA");
		assertEquals("UHURA", word);
	}
}
