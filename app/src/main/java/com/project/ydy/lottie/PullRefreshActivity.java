package com.project.ydy.lottie;

import android.content.Intent;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import in.srain.cube.views.ptr.PtrFrameLayout;
import in.srain.cube.views.ptr.PtrHandler;

/**
 * @author ydy
 */
public class PullRefreshActivity extends AppCompatActivity implements PtrHandler {

    private PtrFrameLayout mPtr;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pull_refresh);
        initView();
        initData();
    }

    private void initData() {
        PullDownHeader krHeader = new PullDownHeader(this);
        krHeader.setShowRefreshInfo(true);
        krHeader.getCompleteView().setText("暂无更新内容");
        this.mPtr.setHeaderView(krHeader);
        this.mPtr.addPtrUIHandler(krHeader);
        this.mPtr.setPtrHandler(this);

        //阻尼系数：默认1.7f，越大，感觉下拉时越吃力
        this.mPtr.setResistance(1.7f);
        //触发刷新时移动的位置比例：默认1.2f，移动达到头部高度1.2倍时可触发刷新操作
        this.mPtr.setRatioOfHeaderHeightToRefresh(1.2f);
        //回弹延时：默认200ms，回弹到刷新高度所用时间
        this.mPtr.setDurationToClose(200);
        //最短加载时间
        this.mPtr.setLoadingMinTime(1500);
        //头部回弹时间：刷新完成，关闭Header的时间，默认1000ms
        this.mPtr.setDurationToCloseHeader(1500);
        //刷新时是否保持头部：默认值true
        this.mPtr.setKeepHeaderWhenRefresh(true);
        //下拉开始刷新还是释放后再开始刷新：默认为false释放刷新
        this.mPtr.setPullToRefresh(false);

        this.mPtr.setEnabledNextPtrAtOnce(true);
    }

    private void initView() {
        mPtr = (PtrFrameLayout) findViewById(R.id.ptr);
    }

    @Override
    public boolean checkCanDoRefresh(PtrFrameLayout frame, View content, View header) {
        return true;
    }

    @Override
    public void onRefreshBegin(PtrFrameLayout frame) {
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                mPtr.refreshComplete();
            }
        }, 3000);
    }
}
