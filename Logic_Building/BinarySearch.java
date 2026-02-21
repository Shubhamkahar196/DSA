public class BinarySearch {
    
    public static void main(String[] args){
        int[] arr={1,3,5,7,9};
        int target = 7;
        int low = 0, high = arr.length-1;

        while(low<=high){
            int mid = (low+high)/2;
            if(arr[mid] == target){
                System.out.println(mid);
                break;
            }
            if(arr[mid]<target){
                low = mid+1;
            }else{
                high = mid-1;
            }
        }
    }
}
