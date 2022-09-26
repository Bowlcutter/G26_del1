package spil;

public class Dice {

    private int faceValue = 1;

    public Dice(){

    }
    public void roll(){
        faceValue = (int)(Math.random()*6+1);
    }

    public void setDice(int d1, int d2){

    }

    public int getSum(Dice d1, Dice d2){
        return 1;
    }

    public boolean getEns(){
        return true;
    }

}
