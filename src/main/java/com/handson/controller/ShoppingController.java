package com.handson.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.handson.entity.ShoppingCart;

@RestController
@RequestMapping("/shopping")
public class ShoppingController {

	@GetMapping("/getCart")
	public ShoppingCart getShoppingDetails() {

		final ShoppingCart sCart = new ShoppingCart();
		sCart.setMessage("Card is Empty");

		return sCart;
	}

}
