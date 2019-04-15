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
		String word = rightToLeft.rightToLeft("");
		assertEquals("", word);
	}
}
