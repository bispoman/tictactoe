package com.bisponet.tic_tac_toe.Model;

import android.widget.TextView;

public class MoveModel {

    public void makeMove(TextView viewId, boolean player) {
        if (player) {
            viewId.setText("X");
        } else {
            viewId.setText("O");
        }
    }
}
