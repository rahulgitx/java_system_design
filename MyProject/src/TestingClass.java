import java.util.Scanner;

public class TestingClass {
    public static void funcA(){
        System.out.println("funcA");
    }
    public static void funcB(){
        System.out.println("funcB");
    }
    public static void main(String[] args) {
        //30:70

        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        double aCount = 0;
        double bCount = 0;
        for(int i=0; i<n; i++){

            // if bCount < a * (70/30) then call bCount an increment bCount
            // else call aCount and increment aCount
            // acount = 5 ideal = 5 * (7/3)
            if(bCount < aCount*(70d/30d)){
                funcB(); bCount++;
            }
            else{
                funcA(); aCount++;
            }
        }
    }
}
