import com.apple.laf.resources.aqua;

class Sorting {

    public Sorting(){
    }

    public int[] sortUsingBubbleSort(int[] source) {

        int list[] = source.clone();
        for (int i=0; i<list.length-1; i++)       
        {
           for(int j = 0; j < list.length-i-1;j++)
           {
    
            if(list[j] > list[j+1]) 
            {
                int save = list[j];
                list[j] = list[j+1];
                list[j+1] = save;
            }
           }
        }
        return list;
    }
}