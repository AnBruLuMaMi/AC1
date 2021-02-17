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
	int maiorNum = nums[0];
	for(int k = 0; k<nums.length;k++) {
		int m = nums[k];
		if(m>maiorNum) {
			maiorNum = m;
		}
	}
        return maiorNum;
    }

    public int soma() {
	    int soma = 0;
	    for(int j = 0; j < nums.length; j++){
		    soma = soma + nums[j];
	    }
			
        return soma;
    }

    public int repeticoes(int i) {
        return 0;
    }
}
