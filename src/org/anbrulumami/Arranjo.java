package org.anbrulumami;

public class Arranjo {
	
	Integer[] nums = {940, 880, 830, 790, 750, 660, 650, 590, 510, 940};
	
    public int menor() {
    	int menorNum = nums[0];
    	for(int i = 0; i<nums.length;i++) {
    		int n = nums[i];
    		if(n<menorNum) {
    			menorNum = n;
    		}
    	}
		return menorNum;
    }

    public int maior() {
        return 0;
    }

    public int soma() {
        return 0;
    }

    public int repeticoes(int i) {
        return 0;
    }
}
