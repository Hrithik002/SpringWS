package com.mphasis.secondspringapp;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;


import com.mphasis.secondspringapp.model.Product;
import com.mphasis.secondspringapp.notification.UserService;
import com.mphasis.secondspringapp.service.Order;

@Component
public class MainAppProduct {

    @Autowired
    private Product product;

    public void showProduct() {
        System.out.println(product.getProductId());
        System.out.println(product.getName());
        System.out.println(product.getPrice());
    }

    public static void main(String[] args) {
        AnnotationConfigApplicationContext context =
                new AnnotationConfigApplicationContext(SpringConfig.class);

        MainAppProduct app = context.getBean(MainAppProduct.class);
        app.showProduct();
        
        Order order = context.getBean(Order.class);
        order.placeOrder();
       
        context.close();
    }
}
