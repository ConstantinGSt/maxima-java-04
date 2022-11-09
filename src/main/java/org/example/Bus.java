package org.example;


import lombok.NonNull;
import lombok.RequiredArgsConstructor;
import lombok.ToString;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;
@NoArgsConstructor
@AllArgsConstructor
@ToString
@Getter
@Setter
public class Bus {
	private String name;
    private int capacity;
    private int speed;
    private float costOfKm;
    private boolean repairing;

    public boolean isRepairing() {
        return isFinishRepair() ? true : false;
    }

    public boolean isFinishRepair() {
        return repairing;
    }

}