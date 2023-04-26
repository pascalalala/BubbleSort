import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        System.out.println("Hello Mello");

        int[] array = {1, 3, 6, 4, 9, 7, 8, 2, 5};

        int[] b = sort(array);

        for(int i= 0; i< b.length; i++){
            System.out.println(b[i]);
        }


    }


        public static int[] sort(int[] a){
            int temp = 0;
            for (int i = 0; i < a.length; i++) {
                for (int j = i+1; j < a.length; j++) {
                      if(a[i] > a[j]){
                          temp = a[i];
                          a[i] = a[j];
                          a[j] = temp;
                      }

                }
            }return a;
        }




    }
