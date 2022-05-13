package tutorial_000.languageNewFeatures;

public class _005_Records {

	public static void main(String[] args) {
		/*
		 * Records is a preview feature that is aimed to allow developers to easily create POJO classes.
		 * 
		 * For creating a record, we have to write the following :
		 * 
		 	// Commented in order to avoid compilation error if preview features are not activated.
		 	record SingleRecord(){}
			record RecordWithParameters (String name, String topic) {}
		 * With this code, Java compiler will automatically generate a constructor, private final fields, accessors (if parameters are passed), 
		 * equals/hashCode and toString  methods automatically. The auto-generated getter methods of RecordWithParameters class are name() and topic().
		 * 
		 * Records also allows developpers to add customs fields, methods and constructor :
		 * 
		 	// Commented in order to avoid compilation error if preview features are not activated.
		 	record CustomizedRecord (int id, String name, String topic) {
			    static int followers;
			 
			    public static String followerCount() {
			        return "Followers are "+ followers;
			    }
			 
			    public String description(){
			        return "Author "+ name + " writes on "+ topic;
			    }
			 
			    public Author{
			    if (id < 0) {
			        throw new IllegalArgumentException( "id must be greater than 0.");
			     }
			   }
			}
		 *
		 * The additional constructor defined inside the record is called a Compact constructor. It doesn’t consist of any parameters and is just 
		 * an extension of the canonical constructor. A compact constructor wouldn’t be generated as a separate constructor by the compiler. Instead, 
		 * it is used for validation cases and would be invoked at the start of the main constructor.
		 * 
		 * Important things to note about Records :
		 * -  A record can neither extend a class nor it can be extended by another class. It’s a final class.
		 * - Records cannot be abstract
		 * - Records cannot extend any other class and cannot define instance fields inside the body. Instance fields must be defined in the 
		 * 		state description only
		 * - Declared fields are private and final
		 * - The body of a record allows static fields and methods
		 * - Records can implement interfaces
		 * 
		 	// Commented in order to avoid compilation error if preview features are not activated.
		 	record Author(String name, String topic) implements Information {
			  public String getFullName() {
			    return "Author "+ name + " writes on " + topic;
			  }
			}
			 
			interface Information {
			  String getFullName();
			}
		 *
		 * - Records support multiple constructors :
		 * 
		 	// Commented in order to avoid compilation error if preview features are not activated.
		 	record Author(String name, String topic) {
			  public Author() {
			 
			    this("NA", "NA");
			  }
			 
			  public Author(String name) {
			 
			    this(name, "NA");
			  }
			}
		 *
		 * - Records allow modifying accessor methods : Though records do generate public accessor methods for the fields defined in the state 
		 * 		description, they also allow the developer to redefine the accessor methods in the body.
		 *
		 	// Commented in order to avoid compilation error if preview features are not activated.
		 	record Author(String name, String topic) {
			  public String name() {
			        return "This article was written by " + this.name;
			    }
			}
		 *
		 * - Records provide isRecord() and getRecordComponents() methods to check if the class is a record and also look into its fields and types.
		 */
	}
}
