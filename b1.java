
public class b1 {
    public static void main(String[] args) {

        int array[] = new int[]{12, 34, 44, 21, 1, 34, 565, 34, 12, 98, 10, 2};
        int max = array[0];
        for (int i = 0; i < array.length; i++) {
            if (array[i] > max) {
                max = array[i];
            }
        }
        System.out.println("Max value is"+" "+max);
        int min=array[0];
        for (int i = 0; i < array.length; i++) {
            if (array[i] < min) {
                min = array[i];
            }
        }
        System.out.println("Min value is"+" "+min);
        int s;
        s=max*min;
        System.out.println("Max*Min="+s);
    }

}

