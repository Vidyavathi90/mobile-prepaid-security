package com.aits.mobileprepaidservice.entity;

import lombok.Data;

@Data
public class PaymentDetails {
	private String method;
	private String upId;
	private String cardNumber;
	private String bankAccount;

}
