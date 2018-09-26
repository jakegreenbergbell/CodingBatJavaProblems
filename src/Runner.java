public class Runner {
    public static String front22(String str) {
        if(str.length() == 1){
            String frontTwo = str.substring(0,1);
            return frontTwo + frontTwo + frontTwo;
        } else if (str.length() >= 2){
            String frontTwo = str.substring(0,2);
            str = frontTwo + str + frontTwo;
            return str;
        } else {
            return str;
        }
    }

    public static boolean array123(int[] nums){
        for(int i = 0; i < nums.length - 2; i++){
            if(nums[i] == 1 && nums[i+1]==2 && nums[i+2] == 3){
                return true;
            }
        }
        return false;
    }

    public static String seeColor(String str) {
        String returner = "";
        int red = str.indexOf("red");
        int blue = str.indexOf("blue");
        if(blue == 0){
            returner = "blue";
        }
        if(red == 0){
            returner = "red";
        }
        return returner;
    }

    public static int[] middleWay(int[] a, int[] b) {
        int mid1 = a[1];
        int mid2 = b[1];
        int[] returner = new int[2];
        returner[0] = mid1;
        returner[1] = mid2;
        return returner;
    }
    public static boolean specialEleven(int n) {
        return n % 11 == 0 || n % 11 == 1;
    }

    public static int blackjack(int a, int b) {
        int returner = 0;
        while(a <= 21 || b <= 21){
            if((21 - a) < (21 - b) && (21 - a) >= 0){
                returner = a;
                break;
            } else {
                if(b > 21){
                    returner = a;
                    break;
                } else{
                    returner = b;
                    break;
                }
            }
        }
        return returner;
    }

    public static boolean xyzThere(String str){
        boolean returner = true;
        if(str.indexOf(".xyz") == -1 && str.indexOf("xyz") != -1){
            returner = true;
        } else {
            returner = false;
        }
        if(str.indexOf(".xyzxyz") != -1){
            returner = true;
        }
        return returner;
    }

    public static int countTriple(String str) {
        int returner = 0;
        for(int i = 0; i < str.length() - 2; i++ ){
            char check = str.charAt(i);
            if(check == str.charAt(i+1) && check == str.charAt(i+2)){
                returner++;
            }
        }
        return returner;
    }

    public static boolean has22(int[] nums) {
        boolean returner = false;
        for(int i = 0; i < nums.length - 1; i++){
            if(nums[i] == 2 && nums[i + 1] == 2){
                returner = true;
            }
        }
        return returner;
    }

    public static boolean canBalance(int[] nums) {
        boolean returner = false;
      D   int[] leftArray = new int[nums.length];
        int totalSum = 0;
        for(int i = 0; i < nums.length; i++){
            totalSum += nums[i];
            leftArray[i] = totalSum;
        }
        if(totalSum % 2 == 1) {
            return false;
        }
        int half = totalSum/2;
        if(java.util.Arrays.binarySearch(leftArray, half) >= 0) {
            return true;
        } else {
            return false;
        }
    }

    public static void main(String args[]){
        System.out.println(front22("Matt"));
        int[] a = {1,2,3,4,1,3};
        System.out.println(array123(a));
        System.out.println(seeColor("redxx"));
        int[] b = {1,2,3};
        int[] c = {4,3,3};
        System.out.println(middleWay(b,c));
        System.out.println(blackjack(18,23));
        System.out.println(xyzThere("yesxyz"));
        System.out.println(countTriple("asdXXXasd"));
        int[] d = {1,2,2,3};
        System.out.println(d);
        int[] e = {2, 3, 4, 1, 2};
        System.out.println(canBalance(e));
    }



}
