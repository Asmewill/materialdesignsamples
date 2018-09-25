package com.zhouwei.md.materialdesignsamples.toolbar;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.design.widget.AppBarLayout;
import android.support.design.widget.CollapsingToolbarLayout;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.util.Log;
import android.view.View;
import android.widget.ImageView;

import com.zhouwei.md.materialdesignsamples.R;

/**
 * Created by zhouwei on 16/12/7.
 */

public class CollapsingBarLayoutOneActivity extends AppCompatActivity {
    private ImageView iv_content;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.collapsingbar_layout_one);
        initView();
    }

    private void initView(){
        final Toolbar toolbar = (Toolbar) findViewById(R.id.appbar_layout_toolbar);
       // StatusBarUtils.setTranslucentImageHeader(this,0,toolbar);//沉浸状态栏
        toolbar.setTitle("toolbar");
//        toolbar.measure(0,0);
//        toolbar.getMeasuredHeight();//通过measure测量一下，得到值为168px/3，不调用 toolbar.measure，得到的值将会是0
        toolbar.inflateMenu(R.menu.menu_search);
        AppBarLayout appBarLayout = (AppBarLayout) findViewById(R.id.appbar_layout);
        iv_content= (ImageView) findViewById(R.id.iv_content);
        final CollapsingToolbarLayout collapsingToolbarLayout = (CollapsingToolbarLayout) findViewById(R.id.collapse_layout);
        collapsingToolbarLayout.setTitle("Title");
        //设置折叠之后TitleColor
        collapsingToolbarLayout.setCollapsedTitleTextColor(getResources().getColor(R.color.white));
        //设置折叠之前之后TitleColor
        collapsingToolbarLayout.setExpandedTitleColor(getResources().getColor(R.color.white));
     //   collapsingToolbarLayout.setExpandedTitleColor(Color.TRANSPARENT);
        appBarLayout.addOnOffsetChangedListener(new AppBarLayout.OnOffsetChangedListener() {
            @Override
            public void onOffsetChanged(AppBarLayout appBarLayout, int verticalOffset) {
                Log.e("Asmewill","appbarHeight:"+appBarLayout.getHeight()+" getTotalScrollRange:"+appBarLayout.getTotalScrollRange()+" offSet:"+verticalOffset);
                if(Math.abs(verticalOffset) >= appBarLayout.getTotalScrollRange()){//到顶部了
                    toolbar.bringToFront();
                }else{
                    collapsingToolbarLayout.setTitle("Title");
                }
            }
        });
        toolbar.setNavigationOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });
    }

}
