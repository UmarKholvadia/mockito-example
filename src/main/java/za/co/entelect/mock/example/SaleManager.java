package za.co.entelect.mock.example;

public class SaleManager {

    private DiscountCalculator discountCalculator;

    private int noOfSaleItems;

    private int saleAmount;

    public SaleManager(DiscountCalculator discountCalculator) {
        this.discountCalculator = discountCalculator;
    }

    public int calculateSaleAmountAfterDiscount() {
        int discountAmount = discountCalculator.calculateDiscount(noOfSaleItems, saleAmount);
        return saleAmount + discountAmount;
    }

    public int getNoOfSaleItems() {
        return noOfSaleItems;
    }

    public void setNoOfSaleItems(int noOfSaleItems) {
        this.noOfSaleItems = noOfSaleItems;
    }

    public double getSaleAmount() {
        return saleAmount;
    }

    public void setSaleAmount(int saleAmount) {
        this.saleAmount = saleAmount;
    }

}
