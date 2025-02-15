import java.io.Serializable;

public class SwitchCase {
    public static void main(String[] args) {
        char c = 'b';
        switch(c){
            case 'a':
                System.out.println(c);
            case 'b':
                System.out.println(c);
            case 'c':
                System.out.println(c);
            default:
                System.out.println("No'ing");
        }
        String language = "English";
        switch (language) {
            case "English":
                System.out.println("Hello");
            case "Spanish":
                System.out.println("Hola");
            case "French":
                System.out.println("Bonjour");
        }
        Serializable serializable;
//        BCdd bd = new BCdd();
    }
}
