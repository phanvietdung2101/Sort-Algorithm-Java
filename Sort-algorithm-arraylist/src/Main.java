import java.util.ArrayList;

public class Main {
    public static void insertSort(ArrayList<Integer> list){
        for(int i = 1; i < list.size(); i++){
            int key = list.get(i);
            int j = i - 1;
            while(j >= 0 && list.get(j) > key){
                list.set(j+1,list.get(j));
                j--;
            }
            list.set(j+1,key);
        }
    }

    public static void bubbleSort(ArrayList<Integer> list){
        boolean swapped = true;
        for(int i = 1; i < list.size() && swapped ; i++){
            swapped = false;
            for(int j = 0; j < (list.size() - i) ; j++){
                if(list.get(j) > list.get(j + 1)){
                    int temp = list.get(j);
                    list.set(j,list.get(j+1));
                    list.set(j+1,temp);
                    swapped = true;
                }
            }
        }
    }

    public static void selectionSort(ArrayList<Integer> list){
        for(int i = 0; i < list.size() - 1; i++){
            int currentMin = list.get(i);
            int indexOfMin = i;
            for(int j = i+1; j < list.size(); j++){
                if(list.get(j) < currentMin){
                    currentMin = list.get(j);
                    indexOfMin = j;
                }
            }
            if(indexOfMin != i){
                list.set(indexOfMin,list.get(i));
                list.set(i,currentMin);
            }
        }
    }

    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(5);
        list.add(4);
        list.add(3);
        list.add(2);
        list.add(1);
        selectionSort(list);
        list.forEach(each -> System.out.print(each + ","));
    }
}
