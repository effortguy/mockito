package com.effortguy.mockito;

public class OrderService {

    UserService userService;
    ProductService productService;

    OrderService(UserService userService, ProductService productService) {
        this.userService = userService;
        this.productService = productService;
    }

    public User getUser() {
        return userService.getUser();
    }

    public Product getProduct() {
        return productService.getProduct();
    }
}
