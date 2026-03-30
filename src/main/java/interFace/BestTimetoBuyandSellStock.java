package interFace;

public class BestTimetoBuyandSellStock {

    public static int maxProfit(int[] arr) {

        int minPrice = Integer.MAX_VALUE;
        int maxProfit = Integer.MIN_VALUE;


        for (int price : arr) {

            if (price < minPrice) {

                minPrice = price;
            } else {

                int profit = price - minPrice;

                maxProfit = Math.max(maxProfit, profit);


            }


        }


        return maxProfit;
    }
}
