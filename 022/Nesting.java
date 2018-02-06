

import java.util.Stack;

// you can write to stdout for debugging purposes, e.g.
// System.out.println("this is a debug message");

class Nesting {
    public int solution(String S) { // 100%
		if (null == S || S.trim().equals("")) { return 1; }

		int count = 1;
		Stack<String> stack = new Stack<String>();

		for (int i = 0; i < S.length(); i ++) {
			char c = S.charAt(i);

			if ( c == '(') {
				stack.push(c+"");

			} else if ( c == ')') {
				if (stack.isEmpty()) { return 0;}
				String top = stack.pop();

				if (!(c ==')' && top.equals("(")) ) { return 0;}
			}
		}

		return (stack.isEmpty())?1:0;
    }
}
