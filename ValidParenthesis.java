class Solution {
public:
    bool isValid(string s) {
        stack<char> st;
        for (auto c : s) {
            if (c == '(' || c == '[' || c == '{') {
                st.push(c);
            } else if (c == ')' || c == ']' || c == '}') {
                if (st.empty()) {
                    return false; // Stack is empty, but we have a closing bracket
                }
                char top = st.top();
                if ((top == '(' && c == ')') || (top == '[' && c == ']') || (top == '{' && c == '}')) {
                    st.pop();
                } else {
                    return false; // Mismatched opening and closing brackets
                }
            }
        }

        return st.empty(); // If the stack is empty at the end, the string is valid.
    }
};
