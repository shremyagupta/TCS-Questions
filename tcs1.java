import java.util.Arrays;

public class tcs1 {
    public static void main(String[] args) {
        int[] arr ={4,5,0,1,9,0,5,0};
        moveZero(arr);
        System.out.println(Arrays.toString(arr));
    }
    public static void  moveZero(int[] arr){
        int n = arr.length;
        int j = 0;
        for(int i = 0; i<n; i++){
            if(arr[i]!=0){
                arr[j]= arr[i];
                j++;
            }
        }
        while(j<n){
            arr[j]=0;
            j++;
        }
    }
    
}
