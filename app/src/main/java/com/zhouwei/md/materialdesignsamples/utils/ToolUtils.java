package com.zhouwei.md.materialdesignsamples.utils;

import android.os.SystemClock;
import android.support.v7.widget.RecyclerView;
import android.view.MotionEvent;

/**
 * Created by jian.shui on 2018/10/8
 */
public class ToolUtils {
    /**
     * 强制停止RecyclerView的滑动
     * @param mRecyclerView
     */
    public static void forceStopRecyclerViewScroll(RecyclerView mRecyclerView) {
        mRecyclerView.dispatchTouchEvent(MotionEvent.obtain(SystemClock.uptimeMillis(), SystemClock.uptimeMillis(), MotionEvent.ACTION_CANCEL, 0, 0, 0));
    }
}
