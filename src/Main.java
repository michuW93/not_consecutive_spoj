import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int input = in.nextInt();
        System.out.println(getNotConsecutive(input));
    }

    public static int[] getNotConsecutive(int i) {
        int[] tab = new int[i+1];
        if(i == 0){
            tab[0] = 0;
        } else {
            for (int a = 0; a < tab.length; a++){
                for (int b = a + 1; b < i; b = b + 2){
                    tab[a] = b;
                }
            }
        }
        return tab;
    }
}
