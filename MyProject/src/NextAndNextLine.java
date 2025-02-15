import java.util.Scanner;

public class NextAndNextLine {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] strings = new String[3];

        for (int i = 0; i < 3; i++) {
            strings[i] = sc.nextLine(); // Reads the entire line including spaces
        }

        for (int i = 0; i < 3; i++) {
            System.out.println(strings[i]);
        }
    }

}
