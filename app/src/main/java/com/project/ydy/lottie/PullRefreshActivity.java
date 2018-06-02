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
        this.mPtr.setDurationToCloseHeader(1000);

        this.mPtr.setDurationToClose(500);
        this.mPtr.setLoadingMinTime(1500);
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
