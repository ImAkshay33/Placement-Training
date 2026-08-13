public class move10s {
    public static void move10(int[] arr) {
        for (int i = 0; i < arr.length-1; i++) {
            for(int j=0; j<arr.length-1-i; j++){
                if(arr[j] %10 == 0 && arr[j+1] %10 != 0){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
                
            }
           
        }
    
    }
    public static void main(String[] args) {
        int[] arr = {10,11,20,21,30,31,41,40,-1};
        System.out.println("Original array: ");
        for (int i : arr) {
            System.out.print(i + " ");
        }
        System.out.println();
        move10(arr);
        System.out.println("Array after moving elements by 10: ");
        for (int i : arr) {
            System.out.print(i + " ");
        }
    }
}
