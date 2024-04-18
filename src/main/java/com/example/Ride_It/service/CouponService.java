package com.example.Ride_It.service;

import com.example.Ride_It.model.Coupon;
import com.example.Ride_It.repository.CouponRepository;
import com.example.Ride_It.transformer.CouponTransformer;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor

public class CouponService {
    public final CouponRepository couponRepository;
    public String addCoupon(String couponCode, int discount) {
        Coupon coupon= CouponTransformer.prepareCoupon(couponCode,discount);
        couponRepository.save(coupon);
        return "Coupon Added Successfully !!";
    }
}
