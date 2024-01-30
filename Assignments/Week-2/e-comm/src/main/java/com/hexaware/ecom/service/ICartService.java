package com.hexaware.ecom.service;

import java.util.List;

import com.hexaware.ecom.entity.Cart;

public interface ICartService {
   public Cart addCart(Cart cart);
   public List<Cart> getCarts();
   public void updateCart(Cart cart);
   public void deleteCart(Cart cart);
}
