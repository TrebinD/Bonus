public class Main {
    public static void main(String[] args) {

        double nomScore = 123.4;
        double amountDeposit = 1100.2;

        if (amountDeposit > 1000) {
            nomScore = nomScore + amountDeposit + (amountDeposit / 100);
        } else {
            nomScore = nomScore + amountDeposit;
        }
        System.out.println(nomScore + "руб.");
    }
}