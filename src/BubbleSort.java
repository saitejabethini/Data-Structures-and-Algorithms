import java.util.Arrays;
import java.util.Scanner;

public class BubbleSort {

    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter size of array");
        int arlen = sc.nextInt();
        int ar [] = new int[arlen];
        System.out.println("enter array values");
        for (int i = 0; i < arlen; i++) {
            ar[i] = sc.nextInt();

        }
        System.out.println(Arrays.toString(ar));
        BubbleSort bs = new BubbleSort();
        bs.bubblesort(ar);
    }
    public void bubblesort(int ar[])
    {
        boolean swapped = true;
        while(swapped)
        {
            swapped = false;
            int temp =0;
            for (int i =0; i<ar.length-1; i++)
            {
                if(ar[i] > ar[i+1])
                {
                    temp = ar[i];
                    ar[i] = ar[i+1];
                    ar[i+1] = temp;
                    swapped = true;
                }
            }
        }
        System.out.println(Arrays.toString(ar));
    }
}



