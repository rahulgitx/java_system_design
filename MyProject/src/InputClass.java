import java.util.*;

public class InputClass {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        scanner.nextLine(); // n does not consume the \n you entered after the integer so that remains in the input buffer
        // nextInt() stops reading once it encounters \n so it would immediately stop after that and without reading the
        // string you entered after that

        String l = scanner.next();
        scanner.nextLine();
        String s = scanner.nextLine();
        System.out.println(n);
        System.out.println(l);
        System.out.println(s);
    }
}
/*
3
sdfsd
sdfk sdkjfhslk skjhksdj
 */