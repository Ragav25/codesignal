package SmoothSailing;

public class IsLucky {

    public static Boolean isLuck(int n){

//      Converting the number to string
        String numAsString = Integer.toString(n);

//      checking length of the string and dividing into half
        int halfNumber = numAsString.length() / 2;

        int firstHalfCount = 0;
        int secondHalfCount = 0;

        for(int i =0; i<numAsString.length(); i++){
            if(i < halfNumber) {
//                converting again as number from each character of the string and adding it to the firstHalfCount
                int toInteger = Integer.parseInt(String.valueOf(numAsString.charAt(i)));
                firstHalfCount += toInteger;
            }else {
//                converting again as number from each character of the string and adding it to the SecondHalfCount
                int toInteger = Integer.parseInt(String.valueOf(numAsString.charAt(i)));
                secondHalfCount += toInteger;
            }
        }

        if(firstHalfCount == secondHalfCount){
            return true;
        }
        return false;
    }

    public static void main(String[] args) {
        int number = 239017;
        boolean checking = isLuck(number);
        System.out.println(checking);
    }

}
