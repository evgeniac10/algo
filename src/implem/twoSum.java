package implem;

public class twoSum {
    public static void main(String[] args) {
        //입력값은 nums = {4,1,9,7,5,3,16} , target = 14 outPut은 True or false;

        int[] nums = {4,1,9,7,5,3,16};
        int target = 1;
        int last = nums.length;
        boolean result = false;

        for(int i=0; i<last; i++){
            for(int j=i+1; j<last; j++){
                if((nums[i] + nums[j])== target){
                    System.out.println("해당하는 숫자는 " + nums[i] + "이고 , " + nums[j] + "입니다.");
                    result = true;
                }
            }
        }
        if(result)
            System.out.println("result = " + result);
        else{
            System.out.println("해당하는 숫자는 없습니다.");
            System.out.println("result = " + result);
        }
    }
}
