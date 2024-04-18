package com.example.Ride_It.transformer;

import com.example.Ride_It.model.Coupon;

public class CouponTransformer {
    //create the object of coupon
    public static Coupon prepareCoupon(String couponCode, int discount){
        return Coupon.builder()
                .couponCode(couponCode)
                .percentageDiscount(discount)
                .build();
    }
}
