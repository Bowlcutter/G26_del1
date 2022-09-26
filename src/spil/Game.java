package spil;
public class Game {
    public static void main(String[] args) {
        Dice testDice = new Dice();

        testDice.roll();
        System.out.println(testDice.faceValue1);
    }
}
