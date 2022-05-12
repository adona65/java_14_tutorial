package tutorial_000.languageNewFeatures;

public class _001_TextBlocks {

	public static void main(String[] args) {
		/*
		 * Java 13 added Text Blocks as preview feature for working easily with multi-line Strings.
		 * 
		 * With Java 14, Text Blocks are still a preview feature, but two addition are done :
		 * - Backslash char "\" : indicate the end of the line, so that a new line character is not introduced
		 * - "\s" : indicates a single space
		 * 
		 * In following example, firstString and secondString are the same.
		 *
		 	// Commented in order to avoid compilation error if preview features are not activated.
			String firstString = "Hello, I try Java 14 new features.";
			
			String secondString = """
				    Hello,\sI\stry \
				    Java 14 new features.""";
		
		 	System.out.println(firstString.equals(secondString)); // Return true
		 * 
		 * 
		 */
	}
}
