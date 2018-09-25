package com.zhouwei.md.materialdesignsamples.asmewill;

import android.os.Bundle;
import android.support.design.widget.AppBarLayout;
import android.support.design.widget.CollapsingToolbarLayout;
import android.support.v4.widget.NestedScrollView;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;

import com.blankj.utilcode.util.SnackbarUtils;
import com.zhouwei.md.materialdesignsamples.R;
import com.zhouwei.md.materialdesignsamples.view.MyRectCircleEditText;

import butterknife.BindView;
import butterknife.ButterKnife;


/**
 * Created by zhouwei on 16/12/7.
 */

public class CollapsingBarLayoutTwoActivity extends AppCompatActivity {

    private float llOffDistance;
    private FrameLayout.LayoutParams params;
    private boolean isUp = false;   //判断是否为上滑状态
    private boolean isDown = false; //判断是否为下拉状态
    private int i=0;


    @BindView(R.id.toolbar_layout)
    CollapsingToolbarLayout toolbarLayout;
    @BindView(R.id.app_bar)
    AppBarLayout appBar;
    @BindView(R.id.text)
    MyRectCircleEditText text;
    @BindView(R.id.fl)
    NestedScrollView fl;
    @BindView(R.id.tv_text)
    TextView mTextView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.collapsingbar_layout_two);
        ButterKnife.bind(this);

        text.setListener(new MyRectCircleEditText.onScrollListener() {
            @Override
            public void onScroll(boolean isIncrease, MyRectCircleEditText v) {
                if (isIncrease){//isIncrease  是否展开
                    isUp = true;//展开
                } else{
                    isDown = true;//收缩
                }
            }
        });

        text.setOnClickListener(new MyRectCircleEditText.onClickListener() {
            @Override
            public void onClick(View view) {
                SnackbarUtils.with(text).setMessage("这是测试按钮").show();
            }
        });
        appBar.addOnOffsetChangedListener(new AppBarLayout.OnOffsetChangedListener() {
            @Override
            public void onOffsetChanged(AppBarLayout appBarLayout, int verticalOffset) {
                //防止初始化进来两次
                i++;
                if (i<=2){
                    return;
                }

                if (params == null) {
                    params = (FrameLayout.LayoutParams) text.getLayoutParams();
                    llOffDistance = params.topMargin;
                    isUp = true;
                    isDown = true;
                }

                float distance = llOffDistance + verticalOffset;
                //滑倒顶端状态 保持20的间距
                if (distance <= 20) {
                    distance = 20;
                    startScroll();
                }
                //滑倒底端状态
                if (verticalOffset == 0){
                    if (isDown && !text.isIncrease()) {
                        text.startScroll();
                    }
                }
                params.topMargin = (int) distance;
                fl.requestLayout();
            }
        });


    }

    public void startScroll() {
        if (isUp) {
            isUp = false;
            if (!text.isScroll())
                text.startScroll();
        }
    }

}
