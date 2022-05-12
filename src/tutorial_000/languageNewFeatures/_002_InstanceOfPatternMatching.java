package tutorial_000.languageNewFeatures;

public class _002_InstanceOfPatternMatching {
	public static void main(String[] args) {
		/*
		 * As a preview feature, Java 14 added a "pattern matching" feature to instanceof. What does that mean ?
		 * Let assume we have an object, and want to do some actions only if this object is of a specific type.
		 * Previously to Java 14, we would have done something like this :
		 */
		
		String message = "A String.";
		Object object = message;
		if(object instanceof String){
			String value = (String)object;
			System.out.println(value.length());
		}
		
		/*
		 * With Java 14, we may write the following :
		 *
			// Commented in order to avoid compilation error if preview features are not activated.
			if(object instanceof String value){
				System.out.println(value.length());
			}
		 *
		 * In this code, "value" is assigned only if "object" is of String type.
		 * The scope of the "value" variable is the "if" conditionnal block.
		 */
		
	}
}
