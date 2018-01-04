package optional_demo;

import java.util.Optional;

public class OptionalDemo {

	private static void execute() {
		Optional<String> maybeString = Optional.of("foo");
		//to test for empty uncomment next line
		//Optional<String> maybeString = Optional.empty();
		
		String newString = maybeString.map(s-> {
				System.out.println("only run if optional is filled "); 
				return s;
			}
		).orElseGet(() -> runIfEmpty());
		System.out.println(newString);
	}

	private static String runIfEmpty() {
		System.out.println("only run if empty");
		return "empty";
	}

	public static void main(String[] args) {
		execute();
	}
}
