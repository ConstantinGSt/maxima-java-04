package org.example;

import org.jetbrains.annotations.NotNull;
import lombok.Data;
import lombok.RequiredArgsConstructor;

@Data
@RequiredArgsConstructor
public class Train extends Transport {
	
	public Train(String name, int capacity, int speed, float costOfKm) {
		super(name, capacity, speed, costOfKm);
	}
	
	@NotNull	
	private String id;
	@NotNull
	private int carriageCount;
	@NotNull
	private boolean isExpress;
	
	@Override
	public float getPrice(City arg0) {
		// TODO Auto-generated method stub
		return 0;
	}

	
	
	 

}
