package com.practice;

public class AllLoops {

	public void basicWhile() {
		int i = 0;
		while (true) {
			if (i < 10) {
				break;
			} else {
				i++;
				continue;
			}
		}
		System.out.println("outside while");
	}

	public void setWaterSensor(int val) {

    }
    public void nestedWhile() {
        boolean isRPMThreshold = true;
        int ltr = 70;

        while(isRPMThreshold) {

            while(ltr < 100) {
                ltr = 56;
            }

            do {
                setWaterSensor(89);
            } while(true);
        }
    }
	public static void main(String[] args) {
		AllLoops loops = new AllLoops();
//		loops.basicWhile();
		loops.nestedWhile();
		
	}
}
