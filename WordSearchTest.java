package main;
import static org.junit.Assert.*;
import org.junit.Test;
import main.WordSearch;

public class WordSearchTest {

	@Test
	public void LeftToRigth() {
		WordSearch leftToRight = new WordSearch();
		String word = leftToRight.leftToRight("BONES");
		assertEquals("BONES", word);
	}
}
