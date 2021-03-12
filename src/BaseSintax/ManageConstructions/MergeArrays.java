package BaseSintax.ManageConstructions;

import java.util.Arrays;

public class MergeArrays {
    public static int[] mergeArrays(int[] a1, int[] a2) {
        int i=0,j=0,k=0;
        int[] a3 = new int[a1.length+ a2.length];
        Arrays.sort(a1);
        Arrays.sort(a2);
        while (i < a1.length && j< a2.length) {

            a3[k++]=a1[i] < a2[j] ? a1[i++] : a2[j++];

        }
        if(i < a1.length){

            System.arraycopy(a1, i, a3, k,a1.length-i);

        } else if(j < a2.length){

            System.arraycopy(a2, j, a3, k,a2.length-j);

        }
        for (int o = 0; o <a3.length ; o++) {
            System.out.print(a3[o] + " ");
        }
        return a3;

    }

    public static void main(String[] args) {
        int[] a1 = new int[] {21, 23, 24, 40, 75,87, 76, 78, 77, 900, 2100, 2200, 2300, 2400, 2500};
        int[] a2 = new int[] {10, 11, 41, 50, 65, 86, 98, 101, 190, 1100,1, 1200, 3000, 5000};
        mergeArrays(a1,a2);

        }
    }


