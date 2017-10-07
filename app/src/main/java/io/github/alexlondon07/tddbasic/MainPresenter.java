package io.github.alexlondon07.tddbasic;

/**
 * Created by alexlondon07 on 10/7/17.
 */

public class MainPresenter {

    public int getDiscountPresenter(int count) {

        if(count >= 90){
            return 30;
        }else if(count >=40){
            return 15;
        }
        return 0;
    }

    public int getTotal(int count, int price) {
        int discount = getDiscountPresenter(count);
        int total  = (price - price * discount/100) * count;
        return total;
    }
}
