package justFuntimeStd;

// **--- BRincando e aprendendo meu lindo 

public class twoSum {
    public static void main (String[] args ) {
        int[] array = {7,8,3,5,2,11,4,6,9,2,1,0,13};
        int[] resp = twoSum(array,12);
        System.out.println(resp[0] + "::" + resp[1]);
    }

    public static int[] twoSum (int[] array, int target) {
        int[]  arrAns = new int[2];
        for(int i=0; i < array.length;i++) {
            for(int j = i+1; j < array.length; j++){
                if(array[i]+array[j] == target) {
                     arrAns[0] = i;
                     arrAns[1] = j;
                     return arrAns;
                }
            }
        }
        return arrAns;
    }
}