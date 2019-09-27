package com.bisponet.tic_tac_toe.Model;

import java.util.Random;

public class CPUModel {

    public int CPUplayCoord (){
        //Setting lowest and highest number to randomize
        int max = 3;
        int min = 1;

        Random random = new Random();

        return random.nextInt(max - min)+ min;
    }
}
