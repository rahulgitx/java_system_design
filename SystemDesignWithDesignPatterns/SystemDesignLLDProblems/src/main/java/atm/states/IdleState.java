package atm.states;

import atm.Atm;
import atm.AtmCard;
import lombok.Getter;
import lombok.Setter;

import java.util.*;

@Getter
@Setter
public class IdleState extends AtmState {
    public IdleState(){
        System.out.println("Atm in idle state");
    }
    @Override
    public void insertCard(AtmCard card, Atm atm){
        atm.setCardAttached(card);
        atm.setAtmState(new HasCardState());
    }
}
