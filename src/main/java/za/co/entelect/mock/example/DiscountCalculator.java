package za.co.entelect.mock.example;

public class DiscountCalculator {

    /*
    * The implementation always returns 0, this was intentionally
    * done to prove that the actual implementation is NOT called
    * in the test and that it is our expectation that is returned
    * in the test.
    */
    public int calculateDiscount(int noOfSaleItems, int saleAmount) {
        return 0;
    }

}
