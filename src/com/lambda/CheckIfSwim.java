package com.lambda;

public class CheckIfSwim implements CheckTrait {
	public boolean test(Animal a) {
		return a.canSwim();
	}
}