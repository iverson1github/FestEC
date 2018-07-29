package com.taozai.latte.util.timer;

import java.util.TimerTask;

/**
 * Created by taozi on 18/6/27.
 */

public class BaseTimerTask extends TimerTask{

    private ITimerListener mITimerListener = null;

    public BaseTimerTask(ITimerListener timerListener) {
        this.mITimerListener = timerListener;
    }

    @Override
    public void run() {
        if (mITimerListener != null) {
            mITimerListener.onTimer();
        }
    }
}
