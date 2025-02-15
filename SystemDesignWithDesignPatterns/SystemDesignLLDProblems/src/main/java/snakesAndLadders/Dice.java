package snakesAndLadders;

import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ThreadLocalRandom;

@Setter
@Getter
public class Dice {
    int diceCount;
    Dice(int n){
        this.diceCount = n;
    }

    int rollDice(){
        List<Integer> list = new ArrayList<>();
        int jump = 0;
        for(int i=0; i<diceCount; i++){
            int output = ThreadLocalRandom.current().nextInt(1,7);
            list.add(output);
            jump += output;
        }
        System.out.println("Dice output: " + list);
        System.out.println("Jump : " + jump);
        return jump;
    }
}
