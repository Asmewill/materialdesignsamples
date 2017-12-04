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

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;

import java.util.List;

/**
 * Created by Monkey on 2015/6/29.
 */
public class MyBGAViewPagerAdapter extends FragmentStatePagerAdapter {

  private String[] mTitles;
  private List<MyBGAFragment> mFragments;

  public MyBGAViewPagerAdapter(FragmentManager fm, String[] mTitles, List<MyBGAFragment> mFragments) {
    super(fm);
    this.mTitles = mTitles;
    this.mFragments = mFragments;
  }

  @Override
  public CharSequence getPageTitle(int position) {
    return mTitles[position];
  }

  @Override
  public Fragment getItem(int position) {
    return mFragments.get(position);
  }

  @Override
  public int getCount() {
    return mFragments.size();
  }
}
