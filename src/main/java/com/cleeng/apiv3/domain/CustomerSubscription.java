package com.cleeng.apiv3.domain;

import java.io.Serializable;

public class CustomerSubscription implements Serializable {

	private static final long serialVersionUID = 1L;

	public String offerId;
	public String status;
	public long expiresAt;
}
