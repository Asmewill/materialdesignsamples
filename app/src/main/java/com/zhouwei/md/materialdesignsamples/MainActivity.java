package com.zhouwei.md.materialdesignsamples;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

import com.zhouwei.md.materialdesignsamples.asmewill.BDTieBaActivity;
import com.zhouwei.md.materialdesignsamples.asmewill.BoWenAnimationActivity;
import com.zhouwei.md.materialdesignsamples.asmewill.BtnUpByKeyBoardActivity;
import com.zhouwei.md.materialdesignsamples.asmewill.CollapsingBarLayoutFourActivity;
import com.zhouwei.md.materialdesignsamples.asmewill.CollapsingBarLayoutThreeActivity;
import com.zhouwei.md.materialdesignsamples.asmewill.CollapsingBarLayoutTwoActivity;
import com.zhouwei.md.materialdesignsamples.asmewill.SlidingUpPanelActivity;
import com.zhouwei.md.materialdesignsamples.asmewill.WdzjActivity;
import com.zhouwei.md.materialdesignsamples.asmewill.WdzjBGARefreshActivity;
import com.zhouwei.md.materialdesignsamples.behavoir.BottomSheetBehaviorActivity;
import com.zhouwei.md.materialdesignsamples.behavoir.CustomBehaviorActivity;
import com.zhouwei.md.materialdesignsamples.behavoir.CustomBehaviorActivity2;
import com.zhouwei.md.materialdesignsamples.behavoir.FABSimpleActivity;
import com.zhouwei.md.materialdesignsamples.behavoir.SwipeDismissBehaviorActivity;
import com.zhouwei.md.materialdesignsamples.bottomsheetdialog.BottomSheetDialogActivity;
import com.zhouwei.md.materialdesignsamples.cardview.CardViewSimpleActivity;
import com.zhouwei.md.materialdesignsamples.edit.TextInputSimpleActivity;
import com.zhouwei.md.materialdesignsamples.navigation.BottomNavigationActivity;
import com.zhouwei.md.materialdesignsamples.navigation.TabActivity;
import com.zhouwei.md.materialdesignsamples.navigation.TabActivity2;
import com.zhouwei.md.materialdesignsamples.toolbar.CollapsingBarLayoutOneActivity;
import com.zhouwei.md.materialdesignsamples.toolbar.JianshuActivity;
import com.zhouwei.md.materialdesignsamples.toolbar.ToolbarActivity;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        findViewById(R.id.btn_bottom_sheet).setOnClickListener(this);
        findViewById(R.id.btn_toolbar).setOnClickListener(this);
        findViewById(R.id.btn_collapsingbar1).setOnClickListener(this);
        findViewById(R.id.btn_collapsingbar2).setOnClickListener(this);
        findViewById(R.id.btn_collapsingbar3).setOnClickListener(this);
        findViewById(R.id.btn_collapsingbar4).setOnClickListener(this);
        findViewById(R.id.btn_appbar_layout1).setOnClickListener(this);
        findViewById(R.id.btn_appbar_layout2).setOnClickListener(this);
        findViewById(R.id.swipe_btn).setOnClickListener(this);
        findViewById(R.id.custom_behavior).setOnClickListener(this);
        findViewById(R.id.custom_behavior2).setOnClickListener(this);
        findViewById(R.id.fab_snack_btn).setOnClickListener(this);
        findViewById(R.id.bottom_sheet_demo).setOnClickListener(this);
        findViewById(R.id.tab_layout_simple1).setOnClickListener(this);
        findViewById(R.id.tab_layout_simple2).setOnClickListener(this);
        findViewById(R.id.bottom_navigaiton_simple).setOnClickListener(this);
        findViewById(R.id.text_input_simple).setOnClickListener(this);
        findViewById(R.id.card_view_simple).setOnClickListener(this);
        findViewById(R.id.btn_appbar_layout3).setOnClickListener(this);
        findViewById(R.id.btn_appbar_layout4).setOnClickListener(this);
        findViewById(R.id.tv_ani).setOnClickListener(this);
        findViewById(R.id.tv_sliing_up_panel).setOnClickListener(this);
        findViewById(R.id.btn_up_by_keyboard).setOnClickListener(this);
        findViewById(R.id.btn_test_kotlin).setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {
        Intent intent;
        switch (v.getId()){
            case  R.id.btn_bottom_sheet:
                intent = new Intent(this, BottomSheetDialogActivity.class);
                startActivity(intent);
                break;
            case  R.id.btn_toolbar:
                intent = new Intent(this, ToolbarActivity.class);
                startActivity(intent);
                break;
            case  R.id.btn_collapsingbar1:
                intent = new Intent(this, CollapsingBarLayoutOneActivity.class);
                startActivity(intent);
                break;
            case  R.id.btn_collapsingbar2:
                intent = new Intent(this, CollapsingBarLayoutTwoActivity.class);
                startActivity(intent);
                break;
            case  R.id.btn_collapsingbar3:
                intent = new Intent(this, CollapsingBarLayoutThreeActivity.class);
                startActivity(intent);
                break;
            case  R.id.btn_collapsingbar4:
                intent = new Intent(this, CollapsingBarLayoutFourActivity.class);
                startActivity(intent);
                break;
            case  R.id.btn_appbar_layout1:
                intent = new Intent(this, JianshuActivity.class);
                startActivity(intent);
                break;
            case  R.id.btn_appbar_layout2:
                intent = new Intent(this, BDTieBaActivity.class);
                startActivity(intent);
                break;
            case  R.id.btn_appbar_layout3:
                intent = new Intent(this, WdzjActivity.class);
                startActivity(intent);
                break;
            case  R.id.btn_appbar_layout4:
                intent = new Intent(this, WdzjBGARefreshActivity.class);
                startActivity(intent);
                break;
            case  R.id.tab_layout_simple1:
                intent = new Intent(this, TabActivity.class);
                startActivity(intent);
                break;
            case  R.id.tab_layout_simple2:
                intent = new Intent(this, TabActivity2.class);
                startActivity(intent);
                break;
            case  R.id.text_input_simple:
                intent = new Intent(this, TextInputSimpleActivity.class);
                startActivity(intent);
                break;
            case  R.id.custom_behavior:
                intent = new Intent(this, CustomBehaviorActivity.class);
                startActivity(intent);
                break;
            case  R.id.custom_behavior2:
                intent = new Intent(this, CustomBehaviorActivity2.class);
                startActivity(intent);
                break;
            case  R.id.card_view_simple:
                intent = new Intent(this, CardViewSimpleActivity.class);
                startActivity(intent);
                break;
            case  R.id.swipe_btn:
                intent = new Intent(this, SwipeDismissBehaviorActivity.class);
                startActivity(intent);
                break;
            case  R.id.bottom_sheet_demo:
                intent = new Intent(this, BottomSheetBehaviorActivity.class);
                startActivity(intent);
                break;
            case  R.id.fab_snack_btn:
                intent = new Intent(this, FABSimpleActivity.class);
                startActivity(intent);
                break;
            case  R.id.bottom_navigaiton_simple:
                intent = new Intent(this, BottomNavigationActivity.class);
                startActivity(intent);
                break;
            case  R.id.tv_ani:
                intent = new Intent(this, BoWenAnimationActivity.class);
                startActivity(intent);
                break;
            case R.id.tv_sliing_up_panel:
                intent = new Intent(this, SlidingUpPanelActivity.class);
                startActivity(intent);
                break;
            case R.id.btn_up_by_keyboard:
                intent = new Intent(this, BtnUpByKeyBoardActivity.class);
                startActivity(intent);
                break;
            case R.id.btn_test_kotlin:
//                intent = new Intent(this, TestKotlinActivity.class);
//                startActivity(intent);
                break;

        }
    }
}
