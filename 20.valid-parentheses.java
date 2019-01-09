class Solution {
    public boolean isValid(String s) {
        Stack<Character>stack=new Stack<>();
        char [] ch = s.toCharArray();
        HashMap<Character,Character>map=new HashMap<>();
        map.put('(',')');
        map.put('{','}');
        map.put('[',']');

        for (char c: ch){
            if (c=='('||c=='['||c=='{'){
                stack.push(map.get(c));
            }
            else if (c==')'||c==']'||c=='}'){
                if(stack.empty()||stack.pop()!=c)return false;
            }
        }
        return stack.empty();
    }
}
