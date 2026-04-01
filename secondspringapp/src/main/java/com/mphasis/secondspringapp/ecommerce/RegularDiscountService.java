package com.mphasis.secondspringapp.ecommerce;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

@Service
	@Primary
	public class RegularDiscountService implements DiscountService {
	    public double applyDiscount(double amount) {
	        return amount * 0.95;
	    }
	}


