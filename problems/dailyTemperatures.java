class Solution {
    public int[] dailyTemperatures(int[] temp) {
        int n = temp.length;
        int[] nge = new int[n];
        LinkedList <Integer> stack = new LinkedList<>();
        for (int i = n - 1; i >= 0; i--) {

            while (!stack.isEmpty()) {
                int topIndex = stack.peekLast();   
                if (temp[i] >= temp[topIndex]) {
                    stack.removeLast();
                } else {
                    break;
                }
            }

            if (stack.isEmpty()) {
                nge[i] = -1;
            } else {
                nge[i] = stack.peekLast();
            }

            stack.addLast(i);
        }

        int[] ans = new int[n];
        for(int i = 0; i < n; i++){
            if(nge[i] == -1){
                ans[i] = 0;
            }else{
                ans[i] = nge[i] - i;
            }
        }
        return ans;
    }
}