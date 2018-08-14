package com.store.grocerysystem.domain;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class ItemSummary {

	private List<Item> items = new ArrayList<>();
	private double amount;

	public ItemSummary(Collection<Item> items) {
		this.items.addAll(items);
		this.amount = sum(this.items);
	}

	public List<Item> getItems() {
		return items;
	}

	public double getAmount() {
		return amount;
	}

	private double sum(Collection<Item> items) {
		double amount = 0.0;
		for (Item item : items) {
			amount += item.getPrice();
		}
		return amount;
	}

	@Override
	public String toString() {
		return "ItemSummary [items=" + items + ", amount=" + amount + "]";
	}

}