package at.fhj.itm;

import java.util.ArrayList;
import java.util.List;

public class StringStack implements Stack
{
	List<String> stack = new ArrayList<String>();

	public boolean isEmpty()
	{
		return stack.isEmpty();
	}

	public void push(String item)
	{
		stack.add(item);
	}

	public String pop()
	{
		String elem = stack.get(stack.size()-1);
		stack.remove(stack.size()-1);
		return elem;
	}

}
