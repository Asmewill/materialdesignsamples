package com.zhouwei.md.materialdesignsamples.asmewill;

import android.os.Bundle;
import android.os.Handler;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;

import com.blankj.utilcode.util.ScreenUtils;
import com.blankj.utilcode.util.SizeUtils;
import com.chad.library.adapter.base.BaseQuickAdapter;
import com.chad.library.adapter.base.loadmore.SimpleLoadMoreView;
import com.sothree.slidinguppanel.SlidingUpPanelLayout;
import com.zhouwei.md.materialdesignsamples.DataUtils;
import com.zhouwei.md.materialdesignsamples.R;
import com.zhouwei.md.materialdesignsamples.test.SchemeAdapter;

public class SlidingUpPanelActivity extends AppCompatActivity {
    RecyclerView rvContent;
    SlidingUpPanelLayout sliding_layout;
    SchemeAdapter myAdapter;
    int currentPage=1;
    View emptyView;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sliding_up_panel);
        rvContent=findViewById(R.id.rvContent);
        emptyView=View.inflate(this,R.layout.empty_view,null);
        sliding_layout= (SlidingUpPanelLayout) findViewById(R.id.sliding_layout);
        int mScreenHeight= ScreenUtils.getScreenHeight();
        int topHeight= SizeUtils.dp2px(256+24);//24dp为状态栏高度，256dp=56+50*4
         sliding_layout.setPanelHeight(mScreenHeight-topHeight);//设置底部状态栏的高度

//       //SlidingUpPanelLayout交给scrollview
//        sliding_layout.setScrollableView(findViewById(R.id.scroollView));
        rvContent.setLayoutManager(new LinearLayoutManager(this,LinearLayoutManager.VERTICAL,false));
        sliding_layout.setScrollableView(rvContent);
        myAdapter = new SchemeAdapter();
        rvContent.setAdapter(myAdapter);
        myAdapter.setLoadMoreView(new SimpleLoadMoreView());
        myAdapter.setOnLoadMoreListener(new BaseQuickAdapter.RequestLoadMoreListener() {
            @Override
            public void onLoadMoreRequested() {
                new Handler().postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        currentPage=currentPage+1;
                        getSchemeList(currentPage);
                    }
                },500);
            }
        });
        getSchemeList(currentPage);
    }
    public void   getSchemeList(int currentPage){
        if(currentPage==0){
            myAdapter.setNewData(null);
            myAdapter.setEmptyView(emptyView);
        }else{
            if(currentPage==1){
                myAdapter.setNewData(DataUtils.getListScheme());
            } else {
                myAdapter.addData(DataUtils.getListScheme());
            }
            if(currentPage<=5){
                myAdapter.loadMoreComplete();
                myAdapter.setEnableLoadMore(true);
            }else{
                myAdapter.loadMoreEnd(false);
            }
        }

    }


}
