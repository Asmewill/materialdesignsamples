package com.zhouwei.md.materialdesignsamples.asmewill;

import android.animation.Animator;
import android.os.Build;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.view.ViewAnimationUtils;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.view.animation.AccelerateInterpolator;
import android.widget.TextView;
import android.widget.Toast;

import com.zhouwei.md.materialdesignsamples.R;

/***
 * 仿百度贴吧详情状态栏
 */
public class BoWenAnimationActivity extends AppCompatActivity implements View.OnClickListener{
    TextView btn_oval;
    TextView btn_rect;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bowen_animation);
        btn_oval= (TextView) findViewById(R.id.btn_oval);
        btn_rect= (TextView) findViewById(R.id.btn_rect);
        btn_oval.setOnClickListener(this);
        btn_rect.setOnClickListener(this);


    }

    @Override
    public void onClick(View view) {
        switch (view.getId()){
            case R.id.btn_oval:
                if(Build.VERSION.SDK_INT>=Build.VERSION_CODES.LOLLIPOP){
                    Animator ovalAni = ViewAnimationUtils.createCircularReveal(
                            btn_oval,
                            btn_oval.getWidth()/2,
                            btn_oval.getHeight()/2,
                            btn_oval.getWidth(),
                            0);
                    ovalAni.setInterpolator(new AccelerateDecelerateInterpolator());
                    ovalAni.setDuration(2000);
                    ovalAni.start();
                }else{
                    Toast.makeText(getApplicationContext(), "手机版本小于5.0,无法显示该动画，请更新系统！", Toast.LENGTH_SHORT).show();
                }
                break;
            case R.id.btn_rect:
                btn_rect.setBackgroundResource(R.color.colorAccent);
                if(Build.VERSION.SDK_INT>=Build.VERSION_CODES.LOLLIPOP){
                    Animator rectAni = ViewAnimationUtils.createCircularReveal(
                            btn_rect,
                            btn_rect.getWidth()/2,
                            btn_rect.getHeight(),
                            btn_rect.getHeight()/4,
                            (float) Math.hypot(btn_rect.getWidth(), btn_rect.getHeight()));
                    rectAni.setInterpolator(new AccelerateInterpolator());
                    rectAni.setDuration(300);
                    rectAni.start();
                }else{
                    Toast.makeText(getApplicationContext(), "手机版本小于5.0,无法显示该动画，请更新系统！", Toast.LENGTH_SHORT).show();
                }
                break;
        }

    }
}
