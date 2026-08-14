/* This is called basic, I use it in may of my projects to make some things a lot easier. 
    Due to this, I don't feel much obligation to explain it.
*/
public class basic{
    public static String[] copyArr(String[] arr){
        String[] copy = new String[arr.length];
        for (int i = 0; i < arr.length;i++){
            copy[i] = arr[i];
        }
        return copy;
    }

    public static int[] copyArr(int[] arr){
        int[] copy = new int[arr.length];
        for (int i = 0; i < arr.length;i++){
            copy[i] = arr[i];
        }
        return copy;
    }

    public static double[] copyArr(double[] arr){
        double[] copy = new double[arr.length];
        for (int i = 0; i < arr.length;i++){
            copy[i] = arr[i];
        }
        return copy;
    }

    public static char[] copyArr(char[] arr){
        char[] copy = new char[arr.length];
        for (int i = 0; i < arr.length;i++){
            copy[i] = arr[i];
        }
        return copy;
    }

    public static int[] sort(int[] arr){
        int[] sorted = basic.copyArr(arr);
        int n = sorted.length;
        for (int i = 1; i < n; ++i) {
            int k = sorted[i];
            int j = i - 1;
            while (j >= 0 && sorted[j] > k) {
                sorted[j + 1] = sorted[j];
                j = j - 1;
            }
          
            sorted[j + 1] = k;
        }
        return sorted;
    }

    public static double[] sort(double[] arr){
        double[] sorted = basic.copyArr(arr);
        double n = sorted.length;
        for (int i = 1; i < n; ++i) {
            double k = sorted[i];
            int j = i - 1;
            while (j >= 0 && sorted[j] > k) {
                sorted[j + 1] = sorted[j];
                j = j - 1;
            }
          
            sorted[j + 1] = k;
        }
        return sorted;
    }

    public static void printArr(int[] arr){
        for(int i = 0; i < arr.length-1;i++){
            System.out.print(arr[i] + ",");
        }
        System.out.println(arr[arr.length-1]);
    }

    public static void printArr(double[] arr){
        for(int i = 0; i < arr.length-1;i++){
            System.out.print(arr[i]  + ",");
        }
        System.out.println(arr[arr.length-1]);
    }

    public static void printArr(char[] arr){
        for(int i = 0; i < arr.length-1;i++){
            System.out.print(arr[i]  + ",");
        }
        System.out.println(arr[arr.length-1]);
    }

    public static void printArr(String[] arr){
        for(int i = 0; i < arr.length-1;i++){
            System.out.print(arr[i]  + ",");
        }
        System.out.println(arr[arr.length-1]);
    }

    public static void printArr(int[][] arr){
        for(int i = 0; i < arr.length;i++){
            for(int j = 0; j < arr[0].length;j++){
                if(i == arr.length-1 && j == arr[0].length-1){
                    System.out.println(arr[arr.length-1][arr[0].length-1]);
                }
                else{
                    System.out.print(arr[i][j] + ",");
                }
            }
        }
    }

    public static void printArr(double[][] arr){
        for(int i = 0; i < arr.length;i++){
            for(int j = 0; j < arr[0].length;j++){
                if(i == arr.length-1 && j == arr[0].length-1){
                    System.out.println(arr[arr.length-1][arr[0].length-1]);
                }
                else{
                    System.out.print(arr[i][j] + ",");
                }
            }
        }
    }

    public static void printArr(char[][] arr){
        for(int i = 0; i < arr.length;i++){
            for(int j = 0; j < arr[0].length;j++){
                if(i == arr.length-1 && j == arr[0].length-1){
                    System.out.println(arr[arr.length-1][arr[0].length-1]);
                }
                else{
                    System.out.print(arr[i][j] + ",");
                }
            }
        }
    }

    public static void printArr(String[][] arr){
        for(int i = 0; i < arr.length;i++){
            for(int j = 0; j < arr[0].length;j++){
                if(i == arr.length-1 && j == arr[0].length-1){
                    System.out.println(arr[arr.length-1][arr[0].length-1]);
                }
                else{
                    System.out.print(arr[i][j] + ",");
                }
            }
        }
    }
    
    public static void printArr2D(int[][] arr){
        for (int i = 0; i < arr.length;i++){
            for(int j = 0; j < arr[0].length;j++){
                System.out.println(arr[i][j]);
            }
            System.out.print("\n");
        }
    }

    public static int[] copyDown(int[][] arr){
        int[] copy = new int[arr.length*arr[0].length];
        int iterable = 0;
        for (int i = 0; i < arr.length; i++){
            for(int j = 0; j < arr[0].length;j++){
                copy[iterable] = arr[i][j];
                iterable++;
            }
        }
        return copy;
    }

    public static double[] copyDown(double[][] arr){
        double[] copy = new double[arr.length*arr[0].length];
        int iterable = 0;
        for (int i = 0; i < arr.length; i++){
            for(int j = 0; j < arr[0].length;j++){
                copy[iterable] = arr[i][j];
                iterable++;
            }
        }
        return copy;
    }

    public static int find(int[] arr, int key){
        int foundIndex = 0;
        for (int i = 0; i < arr.length;i++){
            if (arr[i] == key){
                foundIndex = i;
                break;
            }
            else{
                foundIndex = -1;
                continue;
            }
        }
        return foundIndex;
    }

    public static int find(double[] arr, double key){
        int foundIndex = 0;
        for (int i = 0; i < arr.length;i++){
            if (arr[i] == key){
                foundIndex = i;
                break;
            }
            else{
                foundIndex = -1;
                continue;
            }
        }
        return foundIndex;
    }

    public static int find(char[] arr, char key){
        int foundIndex = 0;
        for (int i = 0; i < arr.length;i++){
            if (arr[i] == key){
                foundIndex = i;
                break;
            }
            else{
                foundIndex = -1;
                continue;
            }
        }
        return foundIndex;
    }

    public static int find(String[] arr, String key){
        int foundIndex = 0;
        for (int i = 0; i < arr.length;i++){
            if (arr[i] == key){
                foundIndex = i;
                break;
            }
            else{
                foundIndex = -1;
                continue;
            }
        }
        return foundIndex;
    }

    public static boolean compare(int value1, int value2){
        boolean returnVal = false;
        if (value1 == value2){
            returnVal = true;
        }
        else{
            returnVal = false;
        }
        return returnVal;
    }

    public static boolean compare(double value1, double value2){
        boolean returnVal = false;
        if (value1 == value2){
            returnVal = true;
        }
        else{
            returnVal = false;
        }
        return returnVal;
    }

    public static boolean compare(char value1, char value2){
        boolean returnVal = false;
        if (value1 == value2){
            returnVal = true;
        }
        else{
            returnVal = false;
        }
        return returnVal;
    }

    public static int[] copyArgs(String[] args){
        int[] copiedArgs = new int[args.length];
        for(int i = 0; i < args.length;i++){
            copiedArgs[i] = Integer.parseInt(args[i]);
        }
        return copiedArgs;
    }

    public static int min(int[] arr){
        int min = arr[0];
        for(int i = 0; i < arr.length; i++){
            if(arr[i] < min){
                min = arr[i];
            }
            else{
                continue;
            }
        }
        return min;
    }

    public static int max(int[] arr){
        int max = arr[0];
        for(int i =0; i < arr.length;i++){
            if(arr[i] > max){
                max = arr[i];
            }
        }
        return max;
    }

    public static double min(double[] arr){
        double min = arr[0];
        for (int i = 0; i < arr.length;i++){
            if(arr[i] < min){
                min = arr[i];
            }
        }
        return min;
    }

    public static double max(double[] arr){
        double max = arr[0];
        for (int i = 0; i < arr.length;i++){
            if(arr[i] > max){
                max = arr[i];
            }
        }
        return max;
    }

}