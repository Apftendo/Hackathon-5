package Javas;

public class Sort{
    public static void main(String[] args){
        int[] arr = {4,57,3,8,10};
        
    }

       public static int[] bubblesort(int[] pZuSortieren){
            int temp;
            for(int i=1; i<pZuSortieren.length; i++){
                for(int j=0; j<pZuSortieren.length-i; j++){
                    if(pZuSortieren[j]>pZuSortieren[j+1]){      //?
                        temp=pZuSortieren[j];
                        pZuSortieren[j]=pZuSortieren[j+1];
                        pZuSortieren[j+1]=temp;
                    }
                }
            }
            return pZuSortieren;
        }
    }
}