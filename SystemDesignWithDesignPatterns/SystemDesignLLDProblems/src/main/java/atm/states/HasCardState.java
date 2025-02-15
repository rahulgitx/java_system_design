package atm.states;

import atm.Atm;
import atm.AtmCard;

public class HasCardState extends AtmState{
    @Override
    public void authenticateCard(String pin, Atm atm){
        if(atm.getCardAttached().getPin().equals(pin)){
            System.out.println("Atm authenticated");
            atm.setAtmState(new ChooseTransactionState());
            return;
        }
        System.out.println("Wrong PIN entered! Please try again");
    }

    @Override
    public void exit(Atm atm){
        System.out.println("Exiting to main menu");
        atm.setAtmState(new IdleState());
        collectCard(atm);
    }
    @Override
    public AtmCard collectCard(Atm atm){
        AtmCard card = atm.getCardAttached();
        atm.setCardAttached(null);
        return card;
    }
}
