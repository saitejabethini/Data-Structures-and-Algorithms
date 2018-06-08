import java.util.Arrays;
import java.util.Scanner;

public class SelectionSort {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter size of array");
        int arlen = sc.nextInt();
        int ar [] = new int[arlen];
        System.out.println("enter array values");
        for (int i = 0; i < arlen; i++) {
            ar[i] = sc.nextInt();

        }
        System.out.println(Arrays.toString(ar));
        SelectionSort ab = new SelectionSort();
        ab.selectionsort (ar);
    }

    public void selectionsort(int ar[]){
        int minindex, max =0, temp,n=0;
        n = ar.length;
        //move boundary of the unsorted array into smaller subsets
        for (int i =0;i<n-1;i++)
        {
            int index =0;
             minindex = i;
             //find the min element in the unsorted array
            for (int j=i+1; j <n; j++)
            {
                if(ar[j] < ar[minindex])
                {
                    minindex = j;
                }
            }
            //swap the min element with the first element based on i
            temp = ar[minindex];
            ar[minindex] = ar[i];
            ar[i]=temp;
        }
    System.out.println(Arrays.toString(ar));
    }
}

