public class Part1 {
    public static void main(String[] args){
        int[] x = {1, 2, 3, 4, 5};
        int[] y = {6, 7, 8, 9, 10};
        int[] z = new int[5];

        //Calculate the maximum valus for each element
        for(int i = 0; i < x.length; i++){
            z[i] = Math.max(x[i], y[i]);
        }

        System.out.print("Array x = { ");
        printArray(x);
        System.out.print(" }\n");

        System.out.print("Array y = { ");
        printArray(y);
        System.out.print(" }\n");

        System.out.print("Array z = x + y = { ");
        printArray(z);
        System.out.print(" }\n");
    }

    // Helper method to print an array
    public static void printArray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]);
            if (i < arr.length - 1) {
                System.out.print(", ");
            }
        }

    }
}
