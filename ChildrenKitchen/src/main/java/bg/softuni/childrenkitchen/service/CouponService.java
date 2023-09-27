package bg.softuni.childrenkitchen.service;

import bg.softuni.childrenkitchen.model.entity.CouponEntity;
import bg.softuni.childrenkitchen.model.service.BuyCouponsServiceModel;

import java.time.LocalDate;

public interface CouponService {

    void initDB();
    int buyCoupons(BuyCouponsServiceModel serviceModel);

    CouponEntity getAndVerifyCoupon(String userEmail, String childName, LocalDate forDate);

}