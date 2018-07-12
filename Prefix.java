import java.util.ArrayList;

public class Prefix {
	ArrayList<String> letter = new ArrayList<String>();
	public void prefix(ArrayList<String> formula) {
		Stack stack = new Stack();
		for(int i=0;i<formula.size();i++) {
			if(formula.get(i).equals("+")) {
				stack.push(formula.get(i));
			}else {
				if(formula.get(i).equals("-")) {
					stack.push(formula.get(i));		
				}else {
					if(formula.get(i).equals("*")) {
						stack.push(formula.get(i));					
					}else {
						if(formula.get(i).equals("/")) {
							stack.push(formula.get(i));							
						}else {
							if(!(formula.get(i).equals("(") || formula.get(i).equals(")"))) {
							letter.add(formula.get(i));
							}
						}
						}
					}
				}
			}
		formula.clear();
		    do{
			if(stack.stackLast!=null) {
			formula.add(stack.stackLast);
			}
			stack.pop();
			}while(!stack.stackEmpty);
		for(int i=0;i<letter.size();i++) {
			formula.add(letter.get(i));
		}	
		}
		}
	
	

