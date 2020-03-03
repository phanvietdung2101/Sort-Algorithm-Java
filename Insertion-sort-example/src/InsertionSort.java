import java.sql.ClientInfoStatus;
import java.util.HashMap;
import java.util.HashSet;

public class InsertionSort {
    static int[] list = {1,5,3,2,8,6,3,6,0,8};
    public static void insertionSort(int[] list){
        for(int i = 1; i < list.length; i++){
            int key = list[i];
            int j = i - 1;

            while(j >= 0 && list[j] > key){
                list[j+1] = list[j];
                j--;
            }
            list[j+1] = key;
        }
    }

    public static void main(String[] args) {
        insertionSort(list);
        for(int each:list)
            System.out.print(each + ",");
    }

    HashSet
}
