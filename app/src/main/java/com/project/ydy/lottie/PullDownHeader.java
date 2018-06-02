package com.project.ydy.lottie;

import android.annotation.TargetApi;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;

import com.airbnb.lottie.LottieAnimationView;

import in.srain.cube.views.ptr.PtrFrameLayout;
import in.srain.cube.views.ptr.PtrUIHandler;
import in.srain.cube.views.ptr.indicator.PtrIndicator;

/**
 * @author ydy
 */
public class PullDownHeader extends FrameLayout implements PtrUIHandler {

    private ImageView mScaleImageView;
    private LottieAnimationView mLoadingLottieView;
    private TextView mRefreshInfoTextView;
    private boolean isShowRefreshInfo;

    public PullDownHeader(Context context) {
        this(context, null);
    }

    public PullDownHeader(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.init(context);
    }

    public PullDownHeader(Context context, AttributeSet attributeSet, int defStyleRes) {
        super(context, attributeSet, defStyleRes);
        this.init(context);
    }

    @TargetApi(21)
    public PullDownHeader(Context context, AttributeSet attributeSet, int defStyleAttr, int defStyleRes) {
        super(context, attributeSet, defStyleAttr, defStyleRes);
        this.init(context);
    }

    private void init() {
        this.mScaleImageView.setVisibility(GONE);
        this.mLoadingLottieView.setVisibility(VISIBLE);
        this.mRefreshInfoTextView.setVisibility(GONE);
        this.mLoadingLottieView.playAnimation();
    }

    private void init(Context var1) {
        View view = inflate(var1, R.layout.header_pull_down, this);
        this.mScaleImageView = view.findViewById(R.id.iv_pre);
        this.mLoadingLottieView = view.findViewById(R.id.lav_loading);
        this.mRefreshInfoTextView = view.findViewById(R.id.tv_refresh_info);
    }

    private void onUIRefreshPrepare() {
        this.mScaleImageView.setVisibility(VISIBLE);
        this.mLoadingLottieView.setVisibility(GONE);
        this.mRefreshInfoTextView.setVisibility(GONE);
        this.mLoadingLottieView.setProgress(0f);
        this.mLoadingLottieView.cancelAnimation();
    }

    private void onUIRefreshComplete() {
        if (this.isShowRefreshInfo) {
            this.mScaleImageView.setVisibility(GONE);
            this.mLoadingLottieView.setVisibility(GONE);
            this.mRefreshInfoTextView.setVisibility(VISIBLE);
        }
    }

    public TextView getCompleteView() {
        return this.mRefreshInfoTextView;
    }

    /**
     * 根据手势上下拉缩放ImageView
     *
     * @param frame frame
     * @param isUnderTouch isUnderTouch
     * @param status status
     * @param ptrIndicator ptrIndicator
     */
    @Override
    public void onUIPositionChange(PtrFrameLayout frame, boolean isUnderTouch, byte status, PtrIndicator ptrIndicator) {
        int offset = frame.getOffsetToRefresh();
        int currentPosY = ptrIndicator.getCurrentPosY();
        if (currentPosY >= offset) {
            this.mScaleImageView.setScaleX(1.0F);
            this.mScaleImageView.setScaleY(1.0F);
        } else if (status == 2) {
            //根据偏移量计算缩放比例
            float scale = (float) (offset - currentPosY) / (float) offset;
            this.mScaleImageView.setScaleX(1.0F - scale);
            this.mScaleImageView.setScaleY(1.0F - scale);
        }
    }

    @Override
    public void onUIRefreshBegin(PtrFrameLayout var1) {
        this.init();
    }

    @Override
    public void onUIRefreshComplete(PtrFrameLayout var1) {
        this.onUIRefreshComplete();
    }

    @Override
    public void onUIRefreshPrepare(PtrFrameLayout var1) {
        this.onUIRefreshPrepare();
    }

    @Override
    public void onUIReset(PtrFrameLayout var1) {
        this.onUIRefreshPrepare();
    }

    public void setShowRefreshInfo(boolean showRefreshInfo) {
        this.isShowRefreshInfo = showRefreshInfo;
    }
}
