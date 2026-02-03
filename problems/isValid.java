class Solution {
    public boolean isValid(String s) {
        LinkedList <Character> stack= new LinkedList<>();

        for(int i=0;i<s.length();i++){
            char ch= s.charAt(i);
            if(ch=='(' || ch=='{' || ch=='[' ){
                stack.addLast(ch);
            }
            else{
                if(stack.isEmpty()){
                    return false;
                }
                char peek=stack.peekLast();
                if((ch==')' && peek=='(')||(ch=='}' && peek=='{')||(ch==']' && peek=='[')){
                    stack.removeLast();
                   
                }else{
                    return false;
                }
            }
        }
        //return stack.isEmpty(); 
        if(stack.size()==0){
          return true;
        }else{
          return false;
        } 
        
    }
}