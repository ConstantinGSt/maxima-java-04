package org.example;

public class Train extends Transport {
	
	public Train(String name, int capacity, int speed, float costOfKm) {
		super(name, capacity, speed, costOfKm);
	}
	
	private String id = "";
	private int carriageCount;
	private boolean isExpress;
	
	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public int getCarriageCount() {
		return carriageCount;
	}

	public void setCarriageCount(int carriageCount) {
		this.carriageCount = carriageCount;
	}

	public boolean isExpress() {
		return isExpress;
	}

	public void setExpress(boolean isExpress) {
		this.isExpress = isExpress;
	}

	@Override
	public float getPrice(City arg0) {
		// TODO Auto-generated method stub
		return 0;
	}

	
	
	 

}
