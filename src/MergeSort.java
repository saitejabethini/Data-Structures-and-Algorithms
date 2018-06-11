import java.util.Arrays;
import java.util.Scanner;

public class MergeSort
{
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
        MergeSort ms = new MergeSort();
        ms.mergesort(ar);
    }
    public static int[] mergesort(int[] ar) {
        int n = ar.length;
        int[] left;
        int[] right;

        if (n % 2 == 0) {
            left = new int[n / 2];
            right = new int[n / 2];
        } else {
            left = new int[n / 2];
            right = new int[n / 2 + 1];
        }

        for (int i = 0; i < n; i++) {
            if (i < n / 2) {
                left[i] = ar[i];
            } else {
                right[i - n / 2] = ar[i];
            }
        }
        //recursion to split and merge
        left = mergesort(left);
        right = mergesort(right);

        return merge(left,right);
    }
    //function to split and merge arrays
    public static int[] merge(int[] left, int right[])
    {
        int result[] = new int[left.length + right.length];
        //indices
        int i = 0;
        int j = 0;
        int index = 0;
        //add until one subarray is deplete
        while (i < left.length && j < right.length)
        {
            if (left[i] < right[i])
            {
                result[index++] = left[i++];
            }
            else
            {
                result[index++] = right[j++];
            }
        }
        //add leftover elements from left
        while (i < left.length)
        {
            result[index++] = left[i++];
        }
        //add leftover elements from right
        while (j < right.length)
        {
            result[index++] = right[j++];
        }

       return result;
    }
}