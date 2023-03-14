import java.util.Arrays;

class main {
    public static void main(String[] args) {

        int listToSort [] = {12,18,2,5,10,6,30,67,54,90};
        Sorting sort = new Sorting();

        System.out.println("This is the list we want to " + Arrays.toString(listToSort));

        int listBubble[] = sort.sortUsingBubbleSort(listToSort);
        System.out.println("List sorted using Bubble Sort " + Arrays.toString(listBubble));

        

    }
}
    
