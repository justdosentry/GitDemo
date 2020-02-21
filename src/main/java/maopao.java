public class maopao {

    public static void main(String[] args) {


        int[] a = new int[]{2, 4, 7, 5, 1, 0};

        for (int i = 0; i < a.length - 1; i++) {
            for (int j = i + 1; j < a.length; j++) {
                if (a[i] > a[j]) {
                    int tmp = a[i];
                    a[i] = a[j];
                    a[j] = tmp;
                }
            }
        }

        for (int i : a) {
            System.out.println(i);

        }
    }
}
