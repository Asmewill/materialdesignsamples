package com.zhouwei.md.materialdesignsamples.asmewill;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;

import com.blankj.utilcode.util.ScreenUtils;
import com.blankj.utilcode.util.SizeUtils;
import com.sothree.slidinguppanel.SlidingUpPanelLayout;
import com.zhouwei.md.materialdesignsamples.R;

public class SlidingUpPanelActivity extends AppCompatActivity {

    SlidingUpPanelLayout sliding_layout;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sliding_up_panel);
        sliding_layout= (SlidingUpPanelLayout) findViewById(R.id.sliding_layout);
        int mScreenHeight= ScreenUtils.getScreenHeight();
        int topHeight= SizeUtils.dp2px(256+24);//24dp为状态栏高度，256dp=56+50*4
        sliding_layout.setPanelHeight(mScreenHeight-topHeight);//设置底部状态栏的高度
       //SlidingUpPanelLayout交给scrollview
        sliding_layout.setScrollableView(findViewById(R.id.scroollView));


    }
}
