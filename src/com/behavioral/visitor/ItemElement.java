package com.behavioral.visitor;

public interface ItemElement {

	public int accept(ShoppingCartVisitor visitor);
}
