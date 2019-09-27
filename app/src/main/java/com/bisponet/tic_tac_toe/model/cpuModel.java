package com.bisponet.tic_tac_toe.model;

import java.util.Random;

public class cpuModel {

    public int CPUplayCoord (){
        //Setting lowest and highest number to randomize
        int max = 3;
        int min = 1;

        Random random = new Random();

        return random.nextInt(max - min)+ min;
    }
}
