package com.bisponet.tic_tac_toe.Controller;

import android.widget.TextView;

import java.util.Random;

public class GameController {

    public void firstMove(TextView view) {
        Random random = new Random();

        if (!random.nextBoolean()) {
            //colocar aqui a vez do jogador ou do pc, fazer o pc jogar se for falso
        }
    }
    public void play(int i, int j){
        // chamar moveModel
        //marcar no array de jogo.
        //checar se alguém venceu
    }
}
