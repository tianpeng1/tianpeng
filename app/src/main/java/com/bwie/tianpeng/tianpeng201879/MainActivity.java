package com.bwie.tianpeng.tianpeng201879;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.bwie.tianpeng.tianpeng201879.view.ScratchTicket;

public class MainActivity extends AppCompatActivity {

    ScratchTicket scratchTicket;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate ( savedInstanceState );
        setContentView ( R.layout.activity_main );
    }
}
