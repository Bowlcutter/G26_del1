package spil;

public class Dice {

    private int faceValue1 = 1, faceValue2 = 1;

    public Dice(){

    }

    public void roll(){
        faceValue1 = (int)(Math.random()*6+1);
        faceValue2 = (int)(Math.random()*6+1);
    }

    public void setDice(int d1, int d2){
        faceValue1 = d1;
        faceValue2 = d2;
    }

    public int getSum(){
        return faceValue1+faceValue2;
    }

    public boolean getEns(){
        return true;
    }

}
