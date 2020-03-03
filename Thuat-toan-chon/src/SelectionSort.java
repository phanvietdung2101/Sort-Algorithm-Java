public class SelectionSort {
    static double[] list = {1,9,4.5,5.7,-4.5};
    public static void selectionSort(double[] list){
        for(int i = 0; i < list.length; i++){
            double currentMin = list[i];
            int currentIndex = i;
            for(int j = i + 1; j < list.length; j++){
                if(list[j] < currentMin){
                    currentMin = list[j];
                    currentIndex = j;
                }
            }
            if(currentIndex != i){
                list[currentIndex] = list[i];
                list[i] = currentMin;
            }
        }
    }

    public static void main(String[] args) {
        selectionSort(list);
        for (int i = 0; i < list.length; i++)
            System.out.print(list[i] + " ");
    }
}
