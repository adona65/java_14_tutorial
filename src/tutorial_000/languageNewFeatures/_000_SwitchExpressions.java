package tutorial_000.languageNewFeatures;

import java.io.FileNotFoundException;
import java.io.UncheckedIOException;

public class _000_SwitchExpressions {

	public static void main(String[] args) {
		/*
		 * Java 12 then 13 introduced changes to switch as preview features :
		 * - switch is now no longer just a statement (which directs where computation goes, like if), but an expression (which is itself 
		 * 		computed to a result, like the conditional/ternary operator "... ? ... : ...").
		 * - It now get a lambda-like syntax instead of classical break/return couples.
		 * - It got a "yield" word which replace "return" for returning value.
		 * 
		 * With Java 14, this modifications are now available as standard features :
		 */
		
		// Example in which we assign switch result to a variable (switch is now an expression, not just a statement).
		// This is a "lambda-like syntax".
		String option = "Monday";
		String switchResult = switch (option) {
			case "Monday", "Tuesday", "Wednesday", "Thursday", "Friday" -> "Weekday";
			case "Saturday", "Sunday" -> "Weekend";
			default -> "Invalid day.";            
		};
		
		System.out.println("Result of switch with \"lambda-like syntax\" : " + switchResult);
		
		System.out.println("------------------------------------------------");
		
		// Same example, but we replace "lambda-like syntax" by using "yield" word.
		option = "Fake day";
		switchResult = switch (option) {
			case "Monday", "Tuesday", "Wednesday", "Thursday", "Friday" : yield "Weekday";
			case "Saturday", "Sunday" : yield "Weekend";
			default : yield "Invalid day.";            
		};
		
		// /!\ Please note that mixing of different kinds of case statements '->' and  ':' is not allowed within a switch.
		
		System.out.println("Same switch using yield instead : " + switchResult);
		
		System.out.println("------------------------------------------------");
		
		/*
		 * Last but not least : 
		 * - If switch expression use an enum, default case can be skipped.
		 * - We can use "var" word if we didn't know in advance the type of the returned value.
		 */
		
		switchOptions argument = switchOptions.ONE;
		var switchWithEnumResult = switch (argument) {
		    case ONE, TWO -> "first entry of switch";
		    case THREE -> 1;
		    case EXCEPTION -> new UncheckedIOException("Dummy exception.", new FileNotFoundException());
		    case BLOCK -> {
		    	System.out.println("Inside the block");
		    	yield Boolean.valueOf(true);
		    }
		    // The compiler checks exhaustiveness. It see that all "switchOptions" enum options are present in the switch statement. 
		    // So, there is no need of a default statement.
		};
		
		System.out.println("First try. Value returned by switch using enum : " + switchWithEnumResult + ". It's a " + switchWithEnumResult.getClass() + " object.");
		
		System.out.println("------------------------------------------------");
		
		argument = switchOptions.THREE;
		switchWithEnumResult = switch (argument) {
		    case ONE, TWO -> "first entry of switch";
		    case THREE -> 1;
		    case EXCEPTION -> new UncheckedIOException("Dummy exception.", new FileNotFoundException());
		    case BLOCK -> {
		    	System.out.println("Inside the block");
		    	yield Boolean.valueOf(true);
		    }
		};
		
		System.out.println("Second try. Value returned by switch using enum : " + switchWithEnumResult + ". It's a " + switchWithEnumResult.getClass() + " object.");
	
		System.out.println("------------------------------------------------");
		
		argument = switchOptions.EXCEPTION;
		switchWithEnumResult = switch (argument) {
		    case ONE, TWO -> "first entry of switch";
		    case THREE -> 1;
		    case EXCEPTION -> new UncheckedIOException("Dummy exception.", new FileNotFoundException());
		    case BLOCK -> {
		    	System.out.println("Inside the block");
		    	yield Boolean.valueOf(true);
		    }
		};
		
		System.out.println("Last try. Value returned by switch using enum : " + switchWithEnumResult + ". It's a " + switchWithEnumResult.getClass() + " object.");
		
	}
	
	enum switchOptions {
		ONE, TWO, THREE, EXCEPTION, BLOCK;
	}
}
