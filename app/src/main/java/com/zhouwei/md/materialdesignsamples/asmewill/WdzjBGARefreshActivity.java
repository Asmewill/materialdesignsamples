package com.zhouwei.md.materialdesignsamples.asmewill;

import android.os.Bundle;
import android.support.design.widget.AppBarLayout;
import android.support.design.widget.CoordinatorLayout;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.TabLayout;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;

import com.zhouwei.md.materialdesignsamples.R;

import java.util.ArrayList;
import java.util.List;

import static android.support.design.widget.TabLayout.MODE_SCROLLABLE;

/***
 *
 * created by shuij 2017-11-21
 * 仿网贷之家首页toolbar伸缩栏
 * 使用BGA下拉刷新控件
 */

public class WdzjBGARefreshActivity extends AppCompatActivity  implements ViewPager.OnPageChangeListener,View.OnClickListener{


    //初始化各种控件，照着xml中的顺序写
    private CoordinatorLayout mCoordinatorLayout;
    private AppBarLayout mAppBarLayout;
    private Toolbar mToolbar;
    private TabLayout mTabLayout;
    private ViewPager mViewPager;
    private FloatingActionButton mFloatingActionButton;

    // TabLayout中的tab标题
    private String[] mTitles;
    // 填充到ViewPager中的Fragment
    private List<MyBGAFragment> mFragments;
    // ViewPager的数据适配器
    private MyBGAViewPagerAdapter mViewPagerAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_wdzj_bga);
        /***
         * init view
         */

        mCoordinatorLayout = (CoordinatorLayout) findViewById(R.id.id_coordinatorlayout);
        mAppBarLayout = (AppBarLayout) findViewById(R.id.id_appbarlayout);
        mToolbar = (Toolbar) findViewById(R.id.id_toolbar);
        mTabLayout = (TabLayout) findViewById(R.id.id_tablayout);
        mViewPager = (ViewPager) findViewById(R.id.id_viewpager);
        mFloatingActionButton = (FloatingActionButton) findViewById(R.id.id_floatingactionbutton);

        /***
         * fill data
         */
        // Tab的标题采用string-array的方法保存，在res/values/arrays.xml中写
        mTitles = getResources().getStringArray(R.array.tab_titles);
        //初始化填充到ViewPager中的Fragment集合
        mFragments = new ArrayList<>();
        for (int i = 0; i < mTitles.length; i++) {
            Bundle mBundle = new Bundle();
            mBundle.putInt("flag", i);
            MyBGAFragment mFragment = new MyBGAFragment();
            mFragment.setArguments(mBundle);
            mFragments.add(i, mFragment);
        }
        /***
         * 配置数据
         */

        // 初始化ViewPager的适配器，并设置给它
        mViewPagerAdapter = new MyBGAViewPagerAdapter(getSupportFragmentManager(), mTitles, mFragments);
        mViewPager.setAdapter(mViewPagerAdapter);
        // 设置ViewPager最大缓存的页面个数
        mViewPager.setOffscreenPageLimit(5);
        // 给ViewPager添加页面动态监听器（为了让Toolbar中的Title可以变化相应的Tab的标题）
        mViewPager.addOnPageChangeListener(this);

        mTabLayout.setTabMode(MODE_SCROLLABLE);
        // 将TabLayout和ViewPager进行关联，让两者联动起来
        mTabLayout.setupWithViewPager(mViewPager);
        // 设置Tablayout的Tab显示ViewPager的适配器中的getPageTitle函数获取到的标题
        mTabLayout.setTabsFromPagerAdapter(mViewPagerAdapter);

        // 设置FloatingActionButton的点击事件
        mFloatingActionButton.setOnClickListener(this);
    }





    @Override
    public void onPageScrolled(int position, float positionOffset, int positionOffsetPixels) {

    }

    @Override
    public void onPageSelected(int position) {

    }

    @Override
    public void onPageScrollStateChanged(int state) {

    }

    @Override
    public void onClick(View v) {

    }

}
