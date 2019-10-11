public class Main {

    public static void main(String[] args) {

        int a = 0;
        int b = 1;

        System.out.println(a);
        System.out.println(b);

        while ( a < 378 ) {

            a = a + b;
            System.out.println(a);

            if (b < 610){

            b = b + a;
                System.out.println(b);
            }



        }
    }
}
