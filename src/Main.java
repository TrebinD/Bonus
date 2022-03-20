public class Main {
    public static void main(String[] args) {

        int nominalScore = 123;
        int amountDeposit = 1100;
        int bonus = amountDeposit / 100;
        int finalScore;


        if (amountDeposit > 1000) {
            finalScore = nominalScore + amountDeposit + bonus;
        } else {
            finalScore = nominalScore + amountDeposit;
        }
        System.out.println(finalScore + "руб.");
    }

}