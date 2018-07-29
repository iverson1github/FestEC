package com.taozai.latte.ec.launcher;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.View;

import com.taozai.latte.delegates.LatteDelegate;
import com.taozai.latte.ec.R;

import butterknife.BindView;

/**
 * Created by taozi on 18/6/27.
 */

public class LauncherDelegate extends LatteDelegate{

    @BindView(R.id.tv_launcher_timer)

    @Override
    public Object setLayout() {
        return R.layout.delegate_launcher;
    }

    @Override
    public void onBindView(@Nullable Bundle savedInstanceState, View rootView) {

    }
}
