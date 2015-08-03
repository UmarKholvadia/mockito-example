package za.co.entelect.mock.example;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.runners.MockitoJUnitRunner;

import static org.junit.Assert.assertEquals;

/*
* Enables Mockito for the tests in this class
* by ensuring that mock objects are initialised
* before each test.
*/
@RunWith(MockitoJUnitRunner.class)
public class SaleManagerTest {

    /*
    * The @Mock annotation marks DiscountCalculator as a mock
    * that should be initialised before every test by
    * MockitoJUnitRunner defined above
    */
    @Mock
    DiscountCalculator discountCalculator;

    /*
    * The @InjectMocks annotation ensures that the mocks are
    * injected into a new instance of this class by calling
    * the constructor.
    */
    @InjectMocks
    SaleManager saleManager;

    @Test
    public void testCalculateSaleAmountAfterDiscount() {

        // GIVEN
        int noOfSaleItems = 5;
        int saleAmount = 200;
        saleManager.setNoOfSaleItems(noOfSaleItems);
        saleManager.setSaleAmount(saleAmount);

        /*
        * This sets an expectation on the mock,
        * what the mock should do when a particular method is
        * called with the given parameters
        */
        Mockito.when(discountCalculator.calculateDiscount(noOfSaleItems, saleAmount)).thenReturn(10);

        // WHEN
        int actualSaleAmount = saleManager.calculateSaleAmountAfterDiscount();

        // THEN
        assertEquals(190, actualSaleAmount);

        /*
        * Verifies that the mock was actually called.
        */
        Mockito.verify(discountCalculator).calculateDiscount(noOfSaleItems,saleAmount);

    }

}