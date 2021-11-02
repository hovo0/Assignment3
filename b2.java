import java.sql.SQLOutput;

public class b2 {
    public static void main(String[] args) {
        int[] a = new int[134];
        for (int j = 0, b = -100; j < a.length; b++) {
            if (b % 3 != 0) {
                a[j] = b;
                System.out.print(b + " ");
                j++;
            }
        }
        int s = 0;
        for (int i = 0; i < a.length; i++) {
            if (a[i] < 0) {
                s += 1;
            }
        }
        System.out.println(s);
        int m = 0;
        for (int i = 0; i < a.length; i++) {
            if (a[i] > 0) {
                m += a[i];
            }
        }
        System.out.println(m);
        int S1 = 0;
        for (int i = 0; i < a.length; i++) {
            if (i % 2 != 0) {
                S1 += i;
            }
        }
        System.out.println(S1);
        int s2=1;
        for (int  b = -100; b<100; b++) {
            if (b % 7 == 0) {
                s2 *= b;
            }
        }
               System.out.print(s2+" ");


                    }

                }












