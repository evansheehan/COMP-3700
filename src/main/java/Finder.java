public class Finder {

    public static Integer findMax(int[] intArray) {
        if (intArray == null) {
            System.out.println("Please input a valid parameter\n");
            return null;
        }
        if (intArray.length == 0) {
            System.out.println("Please input an array with at least one integer\n");
            return null;
        }

        int currMax = intArray[0];
        for (int i = 1; i < intArray.length; i++) {
            if (currMax < intArray[i]) {
                currMax = intArray[i];
            }
        }
        return currMax;
    }

    public static Integer findMin(int[] intArray) {
        if (intArray == null) {
            System.out.println("Please input a valid parameter\n");
            return null;
        }
        if (intArray.length == 0) {
            System.out.println("Please input an array with at least one integer\n");
            return null;
        }

        int currMin = intArray[0];
        for (int i = 1; i < intArray.length; i++) {
            if (currMin > intArray[i]) {
                currMin = intArray[i];
            }
        }
        return currMin;
    }
}
