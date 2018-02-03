
import java.util.Arrays;
import java.util.Stack;

class Solution {
	public int solution(String S) {// 100%
		if (null == S || S.trim().equals("")) { return 1; }

		int count = 1;
		Stack<String> stack = new Stack<String>();

		for (int i = 0; i < S.length(); i ++) {
			char c = S.charAt(i);

			if (c == '['  || c == '{'  || c == '(') {
				stack.push(c+"");

			} else if (c == ']'  || c == '}'  || c == ')') {
				if (stack.isEmpty()) { return 0;}
				String top = stack.pop();

				if (!(c ==']' && top.equals("[")) &&
						!(c ==')' && top.equals("(")) &&
								!(c =='}' && top.equals("{"))) { return 0;}
			}
		}

		return (stack.isEmpty())?1:0;

	}

	public static void main(String[] args) {

		Solution s = new Solution();
		System.out.println(s.solution("{[()()]}"));
		System.out.println(s.solution("([)()]"));
		System.out.println(s.solution(")("));
		System.out.println(s.solution("{{{{{"));
	}
}
