package cp05.mainChapter;

public class LogicalOperators {
	@SuppressWarnings("unused")
	public static void main(String[] args) {
		System.out.print("Condition AND (&&)\n");
		System.out.printf("%s: %b\n",
				"false && false", (false && false));
		System.out.printf("%s: %b\n",
				"false && true", (false && true));
		System.out.printf("%s: %b\n",
				"true && false", (true && false));
		System.out.printf("%s: %b\n",
				"true && true", (true && true));

		System.out.println();
		System.out.println();

		System.out.print("Condition OR (||)\n");
		System.out.printf("%s: %b\n",
				"false || false", (false || false));
		System.out.printf("%s: %b\n",
				"false || true", (false || true));
		System.out.printf("%s: %b\n",
				"true || false", (true || false));
		System.out.printf("%s: %b\n",
				"true || true", (true || true));

		System.out.println();
		System.out.println();

		System.out.print("Condition logical AND (&)\n");
		System.out.printf("%s: %b\n",
				"false & false", (false & false));
		System.out.printf("%s: %b\n",
				"false & true", (false & true));
		System.out.printf("%s: %b\n",
				"true & false", (true & false));
		System.out.printf("%s: %b\n",
				"true & true", (true & true));
		
		System.out.println();
		System.out.println();
		
		System.out.print("Condition logical inclusive OR (|)\n");
		System.out.printf("%s: %b\n",
				"false | false", (false | false));
		System.out.printf("%s: %b\n",
				"false | true", (false | true));
		System.out.printf("%s: %b\n",
				"true | false", (true | false));
		System.out.printf("%s: %b\n",
				"true | true", (true | true));
		
		System.out.println();
		System.out.println();
		
		System.out.print("Condition logical exclusive OR (^)\n");
		System.out.printf("%s: %b\n",
				"false ^ false", (false ^ false));
		System.out.printf("%s: %b\n",
				"false ^ true", (false ^ true));
		System.out.printf("%s: %b\n",
				"true ^ false", (true ^ false));
		System.out.printf("%s: %b\n",
				"true ^ true", (true ^ true));
		
		System.out.println();
		System.out.println();
		
		System.out.print("Condition Logical NOT (!)\n");
		System.out.printf("%s: %b\n",
				"!false", !false);
		System.out.printf("%s: %b\n",
				"!true", !true);
		
		System.out.println();
		System.out.println();
	}
}
