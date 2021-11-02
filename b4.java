public class b4 {
    public static void main(String[] args) {
        String a="Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua.";
        String[] b=a.split(" ");
        for (int i = 1; i <b.length; i+=2) {
            b[i]=b[i].toUpperCase();
        }
        String c=String.join(" ",b);
        System.out.print(c);



                char [] k=a.toCharArray();
                char a1='a';
                int d=0;
                for (int i = 0; i <k.length ; i++) {
                    if (k[i]==a1){
                        d++;
                    }
                }
                System.out.println(d);
            }
        }


