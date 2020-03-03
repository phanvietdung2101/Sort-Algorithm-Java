public class BubbleSort {
    public static void bubbleSort(int[] arr){
        boolean needNextPass = true;
        for(int i = 1; i < arr.length && needNextPass; i++){
            needNextPass = false;
            for(int j = 0; j < arr.length - i; j++){
                if(arr[j] > arr[j + 1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j + 1] = temp;

                    needNextPass = true;
                }
            }
        }
    }

    public static void main(String[] args) {
        int[] arr = {1,5,2,3,9,6,4,8,2};
        bubbleSort(arr);
        for(int each:arr)
            System.out.println(each + " ");
    }
}
