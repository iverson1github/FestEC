package com.taozai.festec.example;

import com.taozai.latte.activities.ProxyActivity;
import com.taozai.latte.delegates.LatteDelegate;

public class ExampleActivity extends ProxyActivity {

/*
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Toast.makeText(Latte.getApplicationContext(), "传入Context啦", Toast.LENGTH_LONG).show();
    }
*/

    @Override
    public LatteDelegate setRootDelegate() {
        return new ExampleDelegate();
    }
}
