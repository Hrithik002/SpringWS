package com.mphasis.secondspringapp;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import com.mphasis.secondspringapp.config.SpringConfigEcommerce;
import com.mphasis.secondspringapp.ecommerce.ProductRepository;
import com.mphasis.secondspringapp.ecommerce.ShoppingCart;

public class MainAppEcommerce {

    public static void main(String[] args) {

        AnnotationConfigApplicationContext context =
                new AnnotationConfigApplicationContext(SpringConfigEcommerce.class);

        ProductRepository repo = context.getBean(ProductRepository.class);
        System.out.println("Products: " + repo.getAllProducts());

        ShoppingCart cart1 = context.getBean(ShoppingCart.class);
        ShoppingCart cart2 = context.getBean(ShoppingCart.class);

        System.out.println("Cart1 == Cart2 ? " + (cart1 == cart2));
        cart1.checkout(1000);

        context.close();
    }
}