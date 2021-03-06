package com.xiao91.heiboy.impl;

import android.view.View;

/**
 * item点击回调接口
 *
 * xiao
 *
 * 2017-01-07
 *
 */
public interface OnClickRecyclerItemListener {

    /**
     * item view 回调方法
     * @param view  被点击的view
     * @param position 索引值
     */
    void onRecyclerViewItemClick(View view, int position);

}
