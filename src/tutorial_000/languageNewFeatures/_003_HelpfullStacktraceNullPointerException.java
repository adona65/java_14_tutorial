package tutorial_000.languageNewFeatures;

public class _003_HelpfullStacktraceNullPointerException {
	/*
	 * Java 14 implements a new way for displaying more detailed Stacktrace when NullPointerException are raised.
	 * Let consider the following code : 
	 * 
	 	String myString = null;
	 	myString.trim();
	 * 
	 * As is, the Stacktrace would display something like :
	 	Exception in thread "main" java.lang.NullPointerException at MyClass.main(MyClass.java:9)
     *
     * If we want more detailed traces, we can pass "-XX:+ShowCodeDetailsInExceptionMessages" to JVM. After this,
     * the traces would be more detailed, like this :
      	Exception in thread "main" java.lang.NullPointerException: Cannot invoke "String.trim()" because "<local1>" is null 
      	at MyClass.main(MyClass.java:9)
     *
	 */
}
