                                           Sum  of Sumarray Ranges

(5_ADVANCED%20MONOTONIC%20STACK/4_Sum%20of%20Subarray%20Minimums.java)

Java Implementation
                                             
class Solution {
    public long subArrayRanges(int[] nums) {
        int n=nums.length;
        long sumMin=getSum(nums,true);
        long sumMax=getSum(nums,false);
        return sumMax-sumMin;
    }
        private long getSum(int[] arr,boolean isMin){
            int n=arr.length;
            int[] left=new int[n];
            int[] right=new int[n];
            Stack<Integer> st=new Stack<>();
            for(int i=0;i<n;i++){
            while(!st.isEmpty() && (isMin? arr[st.peek()]>=arr[i]: arr[st.peek()]<=arr[i])){
                st.pop();
            }
            left[i]=st.isEmpty()?i+1:i-st.peek();
            st.push(i);
            }
            st.clear();
            for(int i=n-1;i>=0;i--){
            while(!st.isEmpty() && (isMin? arr[st.peek()]>arr[i]: arr[st.peek()]<arr[i])){
                st.pop();
            }
            right[i]=st.isEmpty()?n-i:st.peek()-i;
            st.push(i);
            }
            long sum=0;
            for(int i=0;i<n;i++){
                sum+=(long)arr[i]*left[i]*right[i];
            }
            return sum;
    }
}
