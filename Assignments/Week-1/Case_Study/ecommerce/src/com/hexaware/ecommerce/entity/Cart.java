package com.hexaware.ecommerce.entity;

import java.time.LocalDateTime;

public class Cart {
	 private int cartId;        // Primary Key
	    private int customerId;
	    private int productId;
	    private int quantity;
	    private LocalDateTime createdAt;
	    private LocalDateTime modifiedAt;
	    private boolean ordered;
		
	    public Cart(int cartId, int customerId, int productId, int quantity, LocalDateTime createdAt,
				LocalDateTime modifiedAt, boolean ordered) {
			super();
			this.cartId = cartId;
			this.customerId = customerId;
			this.productId = productId;
			this.quantity = quantity;
			this.createdAt = createdAt;
			this.modifiedAt = modifiedAt;
			this.ordered = ordered;
		}

		public int getCartId() {
			return cartId;
		}

		public void setCartId(int cartId) {
			this.cartId = cartId;
		}

		public int getCustomerId() {
			return customerId;
		}

		public void setCustomerId(int customerId) {
			this.customerId = customerId;
		}

		public int getProductId() {
			return productId;
		}

		public void setProductId(int productId) {
			this.productId = productId;
		}

		public int getQuantity() {
			return quantity;
		}

		public void setQuantity(int quantity) {
			this.quantity = quantity;
		}

		public LocalDateTime getCreatedAt() {
			return createdAt;
		}

		public void setCreatedAt(LocalDateTime createdAt) {
			this.createdAt = createdAt;
		}

		public LocalDateTime getModifiedAt() {
			return modifiedAt;
		}

		public void setModifiedAt(LocalDateTime modifiedAt) {
			this.modifiedAt = modifiedAt;
		}

		public boolean isOrdered() {
			return ordered;
		}

		public void setOrdered(boolean ordered) {
			this.ordered = ordered;
		}

		@Override
		public String toString() {
			return "Cart [cartId=" + cartId + ", customerId=" + customerId + ", productId=" + productId + ", quantity="
					+ quantity + ", createdAt=" + createdAt + ", modifiedAt=" + modifiedAt + ", ordered=" + ordered
					+ "]";
		}
	    
	    
	   
}