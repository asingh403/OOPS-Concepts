package com.oops.BuilderPattern;

public class TestAmazon {
    public static void main(String[] args) {

        /**
         * Use Case #01
         */
        EcommApp user  = new EcommApp();
        user.login("asingh@mail.in", "as@1233")
                .search("Nike T-shirt")
                    .addToCart("Nike T-shirt")
                        .doPayment("88887 65554 7754 0001", 703)
                            .generateOrderId()
                                .logout();

        /**
         * Usecase#02: User directly access to addToCart
         */
        user.login("asingh@mail.in", "as@1233")
                .addToCart("Apple Macbook Air")
                    .doPayment("88887 65554 7754 0001", 703, 8043)
                        .generateOrderId()
                            .logout();

        /**
         * Usecase#03: Only addToCart and logout
         */
        user.login("asingh@mail.in", "as@1233")
                .addToCart("Puma shoes")
                    .logout();

        /**
         * UC#04
         */
        user.login("asingh@mail.in", "as@1233")
                .search("Gym Dumbell")
                     .logout();

        /**
         * UC#05
         */
        user.login("test@mail.in", "test@988")
                .logout();
    }
}
