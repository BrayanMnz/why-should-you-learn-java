import java.util.Arrays;

public class VarExample{

	public static void main(String[] args) {
		var header = "Welcome to Barcamp 2023 - The Java related talks are : ";
    
		var javaTalks = Arrays.asList("Why Should you Learn Java", "CQRS(Command Query Responsibility Segregation) con Quarkus", "Simplifica el desarrollo de tus aplicaciones empresariales con Jakarta EE.", "Unlocking the Power of Multitenancy (Spring Boot and Vaadin Flow)");
    
		var iterator = 1;

		System.out.println(header);
		for (var s : javaTalks) {
			System.out.println(String.format("%d - %s", iterator, s));
				iterator++;
		}
	}
}
