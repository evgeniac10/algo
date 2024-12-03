import java.util.Arrays;

public class DivideAndConquer {
    public static void main(String[] args){


        int[] test = {8,2,4,10,23,50,89,1,0,3};
        System.out.println(Arrays.toString(mergeSort(test,2,7)));
    }

    //무엇이 들어가고 무엇이 나와야하는지부터 생각하기
    static int[] mergeSort(int[] arr , int start , int finish){
        if(start < finish){
            int middle = (start+finish)/2;

            mergeSort(arr , start , middle);
            mergeSort(arr , middle+1 , finish);

        }
        //합쳐서 정렬하기
        for(int i=start; i<=finish; i++){
            for(int j=i+1; j<=finish; j++){
                if(arr[i]>arr[j]){
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        return arr;
    }
}
