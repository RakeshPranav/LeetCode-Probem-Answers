class Solution {
    boolean[] arr;
    public int largestPrime(int n) {
        arr = new boolean[n+1];

        for(int i=0;i<arr.length;i++){
            arr[i]=true;
        }

        isPrime(arr);

        int sum = 0;
        int ans = 0;

        for (int k=2;k<arr.length;k++) {
            if(arr[k]){
                sum+=k;

                if(sum>n) break;

                if(arr[sum]) ans=sum;
            }
        }

        return ans;

    }
    void isPrime(boolean [] arr){
            for(int i=2;i*i<arr.length;i++){
                if(arr[i]){
                    for(int j=i*i;j<arr.length;j+=i){
                        arr[j]=false;
                    }
                }
            }
        }
}