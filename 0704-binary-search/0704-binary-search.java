class Solution {
    public int search(int[] arr, int target) {
        int right = arr.length-1;
        int left = 0;

        while(right>=left){
            int mid=left+(right-left)/2;

            if(arr[mid]==target) return mid;
            else if(arr[mid]<target){
                left=mid+1;
            }
            else{
                right=mid-1;
            }
        }
        return -1;
    }
}