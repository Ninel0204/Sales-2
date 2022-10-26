public class SalesManager {
    protected int[] sales;
    int[] priceList = {500, 1000, 50, 6000,800,600};


    public SalesManager(int[] sales) {
        this.sales = sales;
    }


    public int max() {
        int max = -1;
        for (int sale : sales) {
            if (sale > max) {
                max = sale;
            }
        }
        return max;
    }

    public int min() {
        int min = max();
        for (int sale : sales) {
            if (sale < min) {
                min = sale;
            }
        }
        return min;
    }

    public double average() {
            int list=0;
            for (int sale:sales){
            list+=sale;
    }
        double average=list/ priceList.length;
        return average;
    }
}
