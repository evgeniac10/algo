public class Subset {
    public static void main(String[] args) {
        int[] arr = {3,4,5,6};
        int length = arr.length;

        for(int mask=0; mask<(1<<length); mask++){
            System.out.print("{ ");
            for(int i=0; i<length; i++){
                if((mask & (1<<i))!= 0){
                    System.out.print(arr[i] + " ");
                }
            }
            System.out.println("}");
        }
    }
}
