import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int input = in.nextInt();
        getNotConsecutive(input);
    }

    public static void getNotConsecutive(int i) {
        int[] tab = new int[i+1];
        if(i <= 2){
            System.out.println("NIE");
        } else {
            int index = 0;
            for (int a = 0; a < tab.length; a = a + 2){
                tab[index] = a;
                index++;
            }

            int b;
            if((i & 1) != 0){
                b = tab.length - 1;
            } else {
                b = tab.length - 2;
            }
            for (int c = b; c >= 1; c = c - 2){
                tab[index] = c;
                index++;
            }
        }
        System.out.println(Arrays.toString(tab));
    }
}


//4
//0 2 4 1 3