package com.zhouwei.md.materialdesignsamples.toolbar;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.MenuItem;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import com.zhouwei.md.materialdesignsamples.R;

/**
 * Created by zhouwei on 16/12/5.
 */

public class ToolbarActivity extends AppCompatActivity implements View.OnClickListener{
    private Toolbar mToolbar1,mToolbar2,mToolbar3,mToolbar4,mToolbar5;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.toolbar_layout);
        findViewById(R.id.btn_toolbar1).setOnClickListener(this);
        findViewById(R.id.btn_toolbar2).setOnClickListener(this);
        findViewById(R.id.btn_toolbar3).setOnClickListener(this);
        findViewById(R.id.btn_toolbar4).setOnClickListener(this);
        findViewById(R.id.btn_toolbar5).setOnClickListener(this);
        initToolbar1();
        initToolbar2();
        initToolbar3();
        initToolbar4();
        initToolbar5();
    }

    private void initToolbar1(){
        Toolbar toolbar1 = (Toolbar) findViewById(R.id.tool_bar1);
        mToolbar1 = toolbar1;
        //设置NavigationIcon
        toolbar1.setNavigationIcon(R.drawable.ic_book_list);
        // 设置navigation button 点击事件
        toolbar1.setNavigationOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });
        // 设置 toolbar 背景色
        toolbar1.setBackgroundColor(getResources().getColor(R.color.colorPrimary));
        // 设置 Title
        toolbar1.setTitle(R.string.toolbar_title);
        //  设置Toolbar title文字颜色
        toolbar1.setTitleTextColor(getResources().getColor(R.color.white));
        // 设置Toolbar subTitle
        toolbar1.setSubtitle(R.string.sub_title);

        toolbar1.setSubtitleTextColor(getResources().getColor(R.color.white));
        // 设置logo
        toolbar1.setLogo(R.mipmap.ic_launcher);
        // 设置 NavigationIcon 点击事件
        toolbar1.setNavigationOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });
        //设置 Toolbar menu
        toolbar1.inflateMenu(R.menu.setting_menu);
        // 设置溢出菜单的图标
        toolbar1.setOverflowIcon(getResources().getDrawable(R.drawable.abc_ic_menu_moreoverflow_mtrl_alpha));
        // 设置menu item 点击事件
        toolbar1.setOnMenuItemClickListener(new Toolbar.OnMenuItemClickListener() {
            @Override
            public boolean onMenuItemClick(MenuItem item) {
                switch (item.getItemId()){
                    case R.id.item_collect:
                        Toast.makeText(getApplicationContext(),"收藏",Toast.LENGTH_SHORT).show();
                        //点击设置
                        break;
                }
                return false;
            }
        });

    }

    private void initToolbar2(){
        Toolbar toolbar2= (Toolbar) findViewById(R.id.tool_bar_2);
        mToolbar2 = toolbar2;
        toolbar2.setNavigationOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View v) {
               finish();
           }
       });
       //添加溢出菜单
        toolbar2.inflateMenu(R.menu.setting_menu);
       // 添加菜单点击事件
        toolbar2.setOnMenuItemClickListener(new Toolbar.OnMenuItemClickListener() {
           @Override
           public boolean onMenuItemClick(MenuItem item) {
               switch (item.getItemId()){
                   case R.id.item_collect:
                       //点击设置菜单
                       Toast.makeText(getApplicationContext(),"收藏",Toast.LENGTH_SHORT).show();
                       break;
               }
               return false;
           }
       });

    }

    private void initToolbar3(){
       mToolbar3 = (Toolbar) findViewById(R.id.tool_bar_3);
        mToolbar3.setNavigationOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View v) {
               finish();
           }
       });
        mToolbar3.inflateMenu(R.menu.tool_bar_menu2);
    }

    private void initToolbar4(){
        mToolbar4 = (Toolbar) findViewById(R.id.tool_bar_4);
        mToolbar4.setNavigationOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });
        mToolbar4.inflateMenu(R.menu.menu_search);

        mToolbar4.setOnMenuItemClickListener(new Toolbar.OnMenuItemClickListener() {
            @Override
            public boolean onMenuItemClick(MenuItem item) {
                if(item.getItemId() == R.id.item_search){
                    // do search
                }
                return false;
            }
        });
        // 获取ToolBar 上的编辑框
        EditText searchEdit = (EditText) mToolbar4.findViewById(R.id.edit_search);
        // 获取内容
        String content = searchEdit.getText().toString();
    }
    private void initToolbar5(){
        mToolbar5 = (Toolbar) findViewById(R.id.tool_bar_5);
        mToolbar5.setNavigationOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });
        mToolbar5.inflateMenu(R.menu.menu_search);
        mToolbar5.setOnMenuItemClickListener(new Toolbar.OnMenuItemClickListener() {
            @Override
            public boolean onMenuItemClick(MenuItem item) {
                if(item.getItemId() == R.id.item_search){
                    // do search
                }
                return false;
            }
        });
    }
    @Override
    public void onClick(View v) {
       if (v.getId() == R.id.btn_toolbar1){
           mToolbar1.setVisibility(View.VISIBLE);
           mToolbar2.setVisibility(View.GONE);
           mToolbar3.setVisibility(View.GONE);
           mToolbar4.setVisibility(View.GONE);
           mToolbar5.setVisibility(View.GONE);
       }else if(v.getId() == R.id.btn_toolbar2){
           mToolbar1.setVisibility(View.GONE);
           mToolbar2.setVisibility(View.VISIBLE);
           mToolbar3.setVisibility(View.GONE);
           mToolbar4.setVisibility(View.GONE);
           mToolbar5.setVisibility(View.GONE);
       }else if(v.getId() == R.id.btn_toolbar3){
           mToolbar1.setVisibility(View.GONE);
           mToolbar2.setVisibility(View.GONE);
           mToolbar3.setVisibility(View.VISIBLE);
           mToolbar4.setVisibility(View.GONE);
           mToolbar5.setVisibility(View.GONE);
       }else if(v.getId() == R.id.btn_toolbar4){
           mToolbar1.setVisibility(View.GONE);
           mToolbar2.setVisibility(View.GONE);
           mToolbar3.setVisibility(View.GONE);
           mToolbar4.setVisibility(View.VISIBLE);
           mToolbar5.setVisibility(View.GONE);
       }else if(v.getId()==R.id.btn_toolbar5){
           mToolbar1.setVisibility(View.GONE);
           mToolbar2.setVisibility(View.GONE);
           mToolbar3.setVisibility(View.GONE);
           mToolbar4.setVisibility(View.GONE);
           mToolbar5.setVisibility(View.VISIBLE);
       }
    }
}
