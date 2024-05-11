package com.tnsif.Shopping.entity;

public class Order {
              private Long id;
              private String orderName;
              private double totalPrice;
              private String status;
              private Long customerId;
              
			public Order() {
				super();
			}

			public Order(String orderName, double totalPrice, String status, Long customerId) {
				super();
				this.orderName = orderName;
				this.totalPrice = totalPrice;
				this.status = status;
				this.customerId = customerId;
			}

			public Long getId() {
				return id;
			}

			public void setId(Long id) {
				this.id = id;
			}

			public String getOrderName() {
				return orderName;
			}

			public void setOrderName(String orderName) {
				this.orderName = orderName;
			}

			public double getTotalPrice() {
				return totalPrice;
			}

			public void setTotalPrice(double totalPrice) {
				this.totalPrice = totalPrice;
			}

			public String getStatus() {
				return status;
			}

			public void setStatus(String status) {
				this.status = status;
			}

			public Long getCustomerId() {
				return customerId;
			}

			public void setCustomerId(Long customerId) {
				this.customerId = customerId;
			}

}
