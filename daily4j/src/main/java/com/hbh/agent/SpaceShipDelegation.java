package com.hbh.agent;

public class SpaceShipDelegation {
	private String name;
	private SpaceShipControls controls = new SpaceShipControls();
	public SpaceShipDelegation(String name) {
		this.name = name;
	}
	public void back(int velocity){
		controls.back(velocity);
	}

}
