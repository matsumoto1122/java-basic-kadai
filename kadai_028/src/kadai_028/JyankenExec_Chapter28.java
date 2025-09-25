package kadai_028;

public class JyankenExec_Chapter28 {
    public static void main(String[] args) {
        Jyanken_Chapter28 janken = new Jyanken_Chapter28();
        String my = janken.getMyChoice();
        String opponent = janken.getRandom();
        janken.playGame(my, opponent);
    }
}