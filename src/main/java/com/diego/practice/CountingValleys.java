package com.diego.practice;

public class CountingValleys {

    public static int countingValleys(int steps, String path) {
        int levelCount = 0;
        int countValleys = 0;
        for (int i = 0; i < steps; i++) {
            char step = path.charAt(i);
            if (levelCount == 0 && step == 'U') {
                levelCount++;
                continue;
            }
            if (levelCount > 0 && step == 'D') {
                levelCount--;
                continue;
            }
            if (step == 'U') {
                levelCount++;
            }
            if (step == 'D') {
                levelCount--;
            }
            if (levelCount == 0) {
                countValleys++;
            }
        }

        return countValleys;

    }


}
