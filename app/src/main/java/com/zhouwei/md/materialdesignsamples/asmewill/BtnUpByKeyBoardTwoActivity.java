package com.zhouwei.md.materialdesignsamples.asmewill;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.widget.ImageView;

import com.zhouwei.md.materialdesignsamples.R;
import com.zhouwei.md.materialdesignsamples.view.LinearLayoutView;

public class BtnUpByKeyBoardTwoActivity extends AppCompatActivity {

    private LinearLayoutView layoutView;
    ImageView iv_top_head;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
       setContentView(R.layout.activity_btn_up_by_keyboard_two);
        layoutView = (LinearLayoutView) findViewById(R.id.ll_content);
        iv_top_head=findViewById(R.id.iv_top_head);



    }
}
