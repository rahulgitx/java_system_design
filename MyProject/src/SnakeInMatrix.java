import java.util.*;

public class SnakeInMatrix {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        List<String> list = new ArrayList<>();
        for(int i=0; i<n; i++){
            list.add(scanner.next());
        }
        SolutionSnakeMatrix solutionSnakeMatrix = new SolutionSnakeMatrix();
        System.out.println(solutionSnakeMatrix.finalPositionOfSnake(n, list));
    }
}

class SolutionSnakeMatrix {
    public int finalPositionOfSnake(int n, List<String> commands) {
        int i=0, j=0;
        for(String command : commands){
            // System.out.println(command);
            if(command == "UP"){
                i--;
            }
            else if(command.equals("DOWN")){
                i++;
            }
            else if(command.equals("RIGHT")){
                j++;
            }
            else{
                j--;
            }
            // System.out.println(i+":"+j);
        }

        return n*i + j;
    }
}