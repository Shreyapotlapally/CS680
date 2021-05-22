package edu.umb.cs680.hw13.Multicast;

public class StockEvent {
	public String ticker;
	public float quote;

	public StockEvent(String t, float q) {
		this.ticker = t;
		this.quote = q;
	}

	public String getTicker() {
		return ticker;
	}

	public float getQuote() {
		return quote;
	}
}