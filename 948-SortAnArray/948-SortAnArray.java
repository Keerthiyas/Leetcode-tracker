// Last updated: 7/11/2026, 10:35:37 AM
class Solution {
    public int[] sortArray(int[] nums) {
        int num = nums.length;
        mergesort(nums,0,num-1);
        return nums;
        
    }
    public static void merger(int arr[],int start,int mid,int end){
        int ls = mid-start+1;
        int rs = end - mid;
        int la[] = new int[ls];
        int ra[] = new int[rs];
        
        for(int i =0;i<ls;i++){
            la[i] = arr[i+start];

        }
        for(int j = 0;j<rs;j++){
            ra[j] = arr[mid+1+j];
        }
        int i,j,k;
        i=0;j=0;
        k=start;
        while(i<ls && j<rs){
            if(la[i]<ra[j]){
                arr[k++] = la[i++];
            }
            else{
                arr[k++] = ra[j++];
            }
        }
        while(i<ls){
            arr[k++] = la[i++];
        }
        while(j<rs){
            arr[k++] = ra[j++];
        }
    }
    public static void mergesort(int arr[],int start,int end){
        int mid = (start+ end)/2;
        if(start<end){
        mergesort(arr,start,mid);
        mergesort(arr,mid+1,end);
        merger(arr,start,mid,end);
        }
    }
}