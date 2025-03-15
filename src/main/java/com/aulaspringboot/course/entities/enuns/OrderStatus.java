package com.aulaspringboot.course.entities.enuns;

public enum OrderStatus {
	WAITING_PAIMENT(1),
	PAID(2),
	SHIPPED(3),
	DELIVERED(4),
	CANCELED(5);


	private int code;
	
	private OrderStatus(int code) { //contrutor é privado
		this.code = code;			//precisa de contrutor para aceitar o códigos (1...5)
	}
	
	public int getCod() { //precisamos, pq a variáveis são privadas e para pegar o código em inteiro
		return code;
	}
	
	public static OrderStatus valueOf(int code) { //retorna o o status de acordo com o código passado
		for(OrderStatus value : OrderStatus.values()) 
			if(value.getCod() == code) {
				return value;
		}
		throw new IllegalArgumentException("Invalid OrderStatus Code"); //caso o code seja null 
	}
	
}