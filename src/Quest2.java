public class Quest2 {

    public static void main(String[] args) {

        int amount = 1988;
        int[] coins = {5000, 1000, 500, 100, 50, 20, 10, 5, 2, 1};
        System.out.println("Coin change for Rs. " + amount + ":\n");

        for (int coin : coins) {
            int count = amount / coin;
            System.out.println("Rs. " + coin + ": " + count);
            amount = amount % coin;
        }
    }
}