import java.util.ArrayList;

public class Stack {
	ArrayList<String> stack = new ArrayList<String>();
	boolean stackEmpty = false;
	String stackLast;
	public void pop() {
		if(stack.size()!=0) {
			stack.remove(stack.size()-1);
			if(stack.size()!=0) {
			    stackLast = stack.get(stack.size()-1);
			}else {
				stackLast = null;
			}
		}else {
			stackEmpty = true;
		}
	}
	public void push(String a) {
		stack.add(a);
		stackLast = a;
	}
}
