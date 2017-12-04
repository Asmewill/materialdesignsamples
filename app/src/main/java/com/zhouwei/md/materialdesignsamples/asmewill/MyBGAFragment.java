/*
 *
 *  *
 *  *  *
 *  *  *  * ===================================
 *  *  *  * Copyright (c) 2016.
 *  *  *  * 作者：安卓猴
 *  *  *  * 微博：@安卓猴
 *  *  *  * 博客：http://sunjiajia.com
 *  *  *  * Github：https://github.com/opengit
 *  *  *  *
 *  *  *  * 注意**：如果您使用或者修改该代码，请务必保留此版权信息。
 *  *  *  * ===================================
 *  *  *
 *  *  *
 *  *
 *
 */

package com.zhouwei.md.materialdesignsamples.asmewill;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.StaggeredGridLayoutManager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;

import com.zhouwei.md.materialdesignsamples.R;
import com.zhouwei.md.materialdesignsamples.utils.ThreadUtil;

import java.util.ArrayList;
import java.util.List;

import cn.bingoogolapple.refreshlayout.BGANormalRefreshViewHolder;
import cn.bingoogolapple.refreshlayout.BGARefreshLayout;

/**
 * Created by Monkey on 2015/6/29.
 */
public class MyBGAFragment extends Fragment
        implements MyRecyclerViewAdapter.OnItemClickListener,
        MyStaggeredViewAdapter.OnItemClickListener, BGARefreshLayout.BGARefreshLayoutDelegate {

  private static final int VERTICAL_LIST = 0;
  private static final int HORIZONTAL_LIST = 1;
  private static final int VERTICAL_GRID = 2;
  private static final int HORIZONTAL_GRID = 3;
  private static final int STAGGERED_GRID = 4;
  private static final int SPAN_COUNT = 2;
  private View mView;
  private BGARefreshLayout bgaRefreshLayout;
  private RecyclerView mRecyclerView;
  private RecyclerView.LayoutManager mLayoutManager;
  private MyRecyclerViewAdapter mRecyclerViewAdapter;
  private MyStaggeredViewAdapter mStaggeredAdapter;
  private int flag = 0;
  private int pageNum = 1;

  @Nullable
  @Override
  public View onCreateView(LayoutInflater inflater, ViewGroup container,
                           Bundle savedInstanceState) {
    mView = inflater.inflate(R.layout.frag_bga_main,  null, true);
    bgaRefreshLayout = (BGARefreshLayout) mView.findViewById(R.id.id_swiperefreshlayout);
    bgaRefreshLayout.setRefreshViewHolder(new BGANormalRefreshViewHolder(getActivity(), true));
    bgaRefreshLayout.setDelegate(this);
    mRecyclerView = (RecyclerView) mView.findViewById(R.id.id_recyclerview);
    flag = (int) getArguments().get("flag");
    configRecyclerView();
    return mView;
  }

  @Override
  public void onActivityCreated(@Nullable Bundle savedInstanceState) {
    super.onActivityCreated(savedInstanceState);
  }

  private void configRecyclerView() {

    switch (flag) {
      case VERTICAL_LIST:
        mLayoutManager =
                new LinearLayoutManager(getActivity(), LinearLayoutManager.VERTICAL, false);
        break;
      case HORIZONTAL_LIST:
        mLayoutManager =
                new LinearLayoutManager(getActivity(), LinearLayoutManager.HORIZONTAL, false);
        break;
      case VERTICAL_GRID:
        mLayoutManager =
                new GridLayoutManager(getActivity(), SPAN_COUNT, GridLayoutManager.VERTICAL, false);
        break;
      case HORIZONTAL_GRID:
        mLayoutManager =
                new GridLayoutManager(getActivity(), SPAN_COUNT, GridLayoutManager.HORIZONTAL, false);
        break;
      case STAGGERED_GRID:
        mLayoutManager =
                new StaggeredGridLayoutManager(SPAN_COUNT, StaggeredGridLayoutManager.VERTICAL);
        break;
    }

    if (flag != STAGGERED_GRID) {
      mRecyclerViewAdapter = new MyRecyclerViewAdapter(getActivity(), getData(pageNum));
      mRecyclerViewAdapter.setOnItemClickListener(this);
      mRecyclerView.setAdapter(mRecyclerViewAdapter);
    } else {
      mStaggeredAdapter = new MyStaggeredViewAdapter(getActivity());
      mStaggeredAdapter.setOnItemClickListener(this);
      mRecyclerView.setAdapter(mStaggeredAdapter);
    }
    mRecyclerView.setLayoutManager(mLayoutManager);
  }


  public List<String> getData(int pageNum) {
    List<String> list = new ArrayList<>();
    if (pageNum < 0) {
      return list;
    } else {
      for (int i = 6 * pageNum; i < (6 * pageNum + 6); i++) {
        list.add("Card" + i);
      }
      return list;
    }
  }


  @Override
  public void onItemClick(View view, int position) {
    SnackbarUtil.show(mRecyclerView, "AAA", 0);
  }

  @Override
  public void onItemLongClick(View view, int position) {
    SnackbarUtil.show(mRecyclerView, "BBB", 0);
  }

  @Override
  public void onBGARefreshLayoutBeginRefreshing(BGARefreshLayout refreshLayout) {
    pageNum=1;
    ThreadUtil.runInUIThread(new Runnable() {
      @Override
      public void run() {
        mRecyclerViewAdapter.getmDatas().clear();
        mRecyclerViewAdapter.getmDatas().addAll(getData(pageNum));
        mRecyclerViewAdapter.notifyDataSetChanged();
        bgaRefreshLayout.endRefreshing();
      }
    }, 2000);

  }

  @Override
  public boolean onBGARefreshLayoutBeginLoadingMore(BGARefreshLayout refreshLayout) {
    pageNum++;
    if (pageNum > 5) {
      bgaRefreshLayout.endLoadingMore();
      Toast.makeText(getActivity(), "没有更多数据了", Toast.LENGTH_LONG).show();
      return false;
    }

    ThreadUtil.runInUIThread(new Runnable() {
      @Override
      public void run() {
        mRecyclerViewAdapter.getmDatas().addAll(getData(pageNum));
        mRecyclerViewAdapter.notifyDataSetChanged();
        bgaRefreshLayout.endLoadingMore();
      }
    }, 1000);

    return true;
  }
}
