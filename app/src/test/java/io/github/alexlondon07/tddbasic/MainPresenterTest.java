package io.github.alexlondon07.tddbasic;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mockito;
import org.mockito.runners.MockitoJUnitRunner;

import static org.mockito.Mockito.when;

/**
 * Created by alexlondon07 on 10/7/17.
 */

@RunWith(MockitoJUnitRunner.class)
public class MainPresenterTest {

    MainPresenter mainPresenter;

    @Before
    public void setUp() throws Exception{
        mainPresenter = Mockito.spy(new MainPresenter());
    }


    @Test
    public void methodDiscountShouldReturnZero(){

        int count = 0;
        int discount = 0;

        int discountExpected = mainPresenter.getDiscountPresenter(count);
        Assert.assertEquals(discountExpected, discount);

    }

    @Test
    public void methodDiscountShouldReturnThirty(){

        int count = 90;
        int discount = 30;

        int discountExpected = mainPresenter.getDiscountPresenter(count);
        Assert.assertEquals(discountExpected, discount);
    }

    @Test
    public void methodDiscountShouldReturnFifteen(){

        int count = 40;
        int discount = 15;

        int discountExpected = mainPresenter.getDiscountPresenter(count);
        Assert.assertEquals(discountExpected, discount);
    }



    @Test
    public void methodDiscountShouldReturnFifteenRange(){

        int count = 65;
        int discount = 15;
        int discountExpected = mainPresenter.getDiscountPresenter(count);
        Assert.assertEquals(discountExpected, discount);
    }


    @Test
    public void methodDiscountShouldReturnThirtyRange(){

        int count = 100;
        int discount = 30;
        int discountExpected = mainPresenter.getDiscountPresenter(count);
        Assert.assertEquals(discountExpected, discount);
    }





    @Test
    public void methodGetTotalShouldReturnWithDiscountZero(){

        int count = 25;
        int price = 400;
        int totalExcepted = 10000;
        int total = mainPresenter.getTotal(count, price);
        Assert.assertEquals(totalExcepted, total);

    }

    @Test
    public void methodGetTotalShouldReturnWithDiscountFifteen(){

        int count = 50;
        int price = 400;
        int totalExcepted = 17000;
        int total = mainPresenter.getTotal(count, price);
        Assert.assertEquals(totalExcepted, total);

    }

    @Test
    public void methodGetTotalShouldReturnWithDiscountThirty(){

        int count = 95;
        int price = 400;
        int totalExcepted = 26600;
        int total = mainPresenter.getTotal(count, price);
        Assert.assertEquals(totalExcepted, total);

    }
}
