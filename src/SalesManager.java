public class SalesManager {
    protected long[] sales;
    long[] priceList = {500, 1000, 50, 6000,800,600};


    public SalesManager(long[] sales) {
        this.sales = sales;
    }


    public long max() {
        int max = -1;
        for (long sale : sales) {
            if (sale > max) {
                max = sale;
            }
        }
        return max;
    }

    public long min() {
        int min = max();
        for (long sale : sales) {
            if (sale < min) {
                min = sale;
            }
        }
        return min;
    }

<<<<<<< HEAD
    public int average() {
            int list=0;
            for (int sale:sales){
            list+=sale;
    }
        int average=list/ priceList.length;
        return average;
    }
=======
    
>>>>>>> longer
}
