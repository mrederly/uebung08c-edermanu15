package at.fhj.itm;

public class StringTest {

	public static void main(String[] args) {
StringStack stack = new StringStack();
		
		stack.push("Hallo");
		stack.push("Servus");
		stack.push("Moinsen");
		
		while(!stack.isEmpty())
			System.out.println(stack.pop());

	}

}
