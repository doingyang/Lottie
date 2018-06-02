package com.project.ydy.lottie;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

/**
 * @author ydy
 */
public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private TextView tvAnimationRefresh;
    private TextView tvAnimationMore;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initView();
        setListener();
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.tv_animation_refresh:
                startActivity(new Intent(MainActivity.this, PullRefreshActivity.class));
                break;
            case R.id.tv_animation_more:
                startActivity(new Intent(MainActivity.this, LottieUseActivity.class));
                break;
            default:
                break;
        }
    }

    private void setListener() {
        tvAnimationRefresh.setOnClickListener(this);
        tvAnimationMore.setOnClickListener(this);
    }

    private void initView() {
        tvAnimationRefresh = findViewById(R.id.tv_animation_refresh);
        tvAnimationMore = findViewById(R.id.tv_animation_more);
    }
}
