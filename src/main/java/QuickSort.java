import javax.xml.transform.Source;

public class QuickSort {


        public static void main(String[] args) {
            int[] a = new int[]{1,5,7,3,5,9,0};
            quickSort(a,0,a.length - 1);
            for (int i = 0; i < a.length; i++) {
                System.out.println(a[i]);

            }
        }

        public static void quickSort(int[] source,int left,int right){
            if (source.length <= 1 || left > right) {
                return;
            }
            int i = left;int j = right;
            int key = source[left];
            while (i < j) {
                while (source[j] >= key && i < j) {
                    j --;
                }
                while (source[i] <= key && i < j) {
                    i ++;
                }
                if (i < j) {
                   int temp = source[i];
                   source[i] = source[j];
                   source[j] = temp;
                }
            }
            source[left] = source[i];
            source[i] = key;
            quickSort(source, left, i - 1);
            quickSort(source, i + 1, right);
        }
}
