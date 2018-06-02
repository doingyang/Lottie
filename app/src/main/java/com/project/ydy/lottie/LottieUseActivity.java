package com.project.ydy.lottie;

import android.animation.Animator;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

import com.airbnb.lottie.LottieAnimationView;

/**
 * @author ydy
 */
public class LottieUseActivity extends AppCompatActivity implements View.OnClickListener {

    private static final String ANIMATION_JSON = "{\"v\":\"4.13.0\",\"fr\":30,\"ip\":0,\"op\":150,\"w\":720,\"h\":1280,\"nm\":\"portWin\",\"ddd\":0,\"assets\":[{\"id\":\"comp_0\",\"layers\":[{\"ddd\":0,\"ind\":1,\"ty\":4,\"nm\":\"Shape Layer 3\",\"sr\":1,\"ks\":{\"o\":{\"a\":0,\"k\":100,\"ix\":11},\"r\":{\"a\":0,\"k\":15,\"ix\":10},\"p\":{\"a\":0,\"k\":[568,319.5,0],\"ix\":2},\"a\":{\"a\":0,\"k\":[0,0,0],\"ix\":1},\"s\":{\"a\":1,\"k\":[{\"i\":{\"x\":[0.057,0.057,0.667],\"y\":[1,1,1]},\"o\":{\"x\":[0,0,0.333],\"y\":[0,0,0]},\"n\":[\"0p057_1_0_0\",\"0p057_1_0_0\",\"0p667_1_0p333_0\"],\"t\":9,\"s\":[0,0,100],\"e\":[100,100,100]},{\"t\":33}],\"ix\":6}},\"ao\":0,\"shapes\":[{\"ty\":\"gr\",\"it\":[{\"ty\":\"sr\",\"sy\":2,\"d\":1,\"pt\":{\"a\":0,\"k\":3,\"ix\":3},\"p\":{\"a\":1,\"k\":[{\"i\":{\"x\":0.194,\"y\":1},\"o\":{\"x\":0.054,\"y\":0},\"n\":\"0p194_1_0p054_0\",\"t\":9,\"s\":[0,0],\"e\":[0,300],\"to\":[0,50],\"ti\":[0,-50]},{\"t\":33}],\"ix\":4},\"r\":{\"a\":0,\"k\":0,\"ix\":5},\"or\":{\"a\":0,\"k\":100,\"ix\":7},\"os\":{\"a\":0,\"k\":0,\"ix\":9},\"ix\":1,\"nm\":\"Polystar Path 1\",\"mn\":\"ADBE Vector Shape - Star\",\"hd\":false},{\"ty\":\"fl\",\"c\":{\"a\":0,\"k\":[1,0,0,1],\"ix\":4},\"o\":{\"a\":0,\"k\":100,\"ix\":5},\"r\":1,\"nm\":\"Fill 1\",\"mn\":\"ADBE Vector Graphic - Fill\",\"hd\":false},{\"ty\":\"tr\",\"p\":{\"a\":0,\"k\":[0,0],\"ix\":2},\"a\":{\"a\":0,\"k\":[0,0],\"ix\":1},\"s\":{\"a\":1,\"k\":[{\"i\":{\"x\":[0.194,0.431],\"y\":[1,1]},\"o\":{\"x\":[0.054,0.057],\"y\":[0,0]},\"n\":[\"0p194_1_0p054_0\",\"0p431_1_0p057_0\"],\"t\":9,\"s\":[50,0],\"e\":[0,100]},{\"t\":33}],\"ix\":3},\"r\":{\"a\":0,\"k\":0,\"ix\":6},\"o\":{\"a\":0,\"k\":100,\"ix\":7},\"sk\":{\"a\":0,\"k\":0,\"ix\":4},\"sa\":{\"a\":0,\"k\":0,\"ix\":5},\"nm\":\"Transform\"}],\"nm\":\"Polystar 1\",\"np\":3,\"cix\":2,\"ix\":1,\"mn\":\"ADBE Vector Group\",\"hd\":false},{\"ty\":\"rp\",\"c\":{\"a\":0,\"k\":12,\"ix\":1},\"o\":{\"a\":0,\"k\":0,\"ix\":2},\"m\":1,\"ix\":2,\"tr\":{\"ty\":\"tr\",\"p\":{\"a\":0,\"k\":[0,0],\"ix\":2},\"a\":{\"a\":0,\"k\":[0,0],\"ix\":1},\"s\":{\"a\":0,\"k\":[100,100],\"ix\":3},\"r\":{\"a\":0,\"k\":30,\"ix\":4},\"so\":{\"a\":0,\"k\":100,\"ix\":5},\"eo\":{\"a\":0,\"k\":100,\"ix\":6},\"nm\":\"Transform\"},\"nm\":\"Repeater 1\",\"mn\":\"ADBE Vector Filter - Repeater\",\"hd\":false}],\"ip\":9,\"op\":34.5,\"st\":9,\"bm\":0},{\"ddd\":0,\"ind\":2,\"ty\":4,\"nm\":\"Shape Layer 2\",\"sr\":1,\"ks\":{\"o\":{\"a\":0,\"k\":100,\"ix\":11},\"r\":{\"a\":0,\"k\":7.5,\"ix\":10},\"p\":{\"a\":0,\"k\":[568,319.5,0],\"ix\":2},\"a\":{\"a\":0,\"k\":[0,0,0],\"ix\":1},\"s\":{\"a\":1,\"k\":[{\"i\":{\"x\":[0.057,0.057,0.667],\"y\":[1,1,1]},\"o\":{\"x\":[0,0,0.333],\"y\":[0,0,0]},\"n\":[\"0p057_1_0_0\",\"0p057_1_0_0\",\"0p667_1_0p333_0\"],\"t\":9,\"s\":[0,0,100],\"e\":[100,100,100]},{\"t\":30}],\"ix\":6}},\"ao\":0,\"shapes\":[{\"ty\":\"gr\",\"it\":[{\"ty\":\"sr\",\"sy\":2,\"d\":1,\"pt\":{\"a\":0,\"k\":3,\"ix\":3},\"p\":{\"a\":1,\"k\":[{\"i\":{\"x\":0.194,\"y\":1},\"o\":{\"x\":0.054,\"y\":0},\"n\":\"0p194_1_0p054_0\",\"t\":9,\"s\":[0,0],\"e\":[0,300],\"to\":[0,50],\"ti\":[0,-50]},{\"t\":30}],\"ix\":4},\"r\":{\"a\":0,\"k\":0,\"ix\":5},\"or\":{\"a\":0,\"k\":100,\"ix\":7},\"os\":{\"a\":0,\"k\":0,\"ix\":9},\"ix\":1,\"nm\":\"Polystar Path 1\",\"mn\":\"ADBE Vector Shape - Star\",\"hd\":false},{\"ty\":\"fl\",\"c\":{\"a\":0,\"k\":[0.981387867647,0.886240581438,0.30961525113,1],\"ix\":4},\"o\":{\"a\":0,\"k\":100,\"ix\":5},\"r\":1,\"nm\":\"Fill 1\",\"mn\":\"ADBE Vector Graphic - Fill\",\"hd\":false},{\"ty\":\"tr\",\"p\":{\"a\":0,\"k\":[0,0],\"ix\":2},\"a\":{\"a\":0,\"k\":[0,0],\"ix\":1},\"s\":{\"a\":1,\"k\":[{\"i\":{\"x\":[0.194,0.431],\"y\":[1,1]},\"o\":{\"x\":[0.054,0.057],\"y\":[0,0]},\"n\":[\"0p194_1_0p054_0\",\"0p431_1_0p057_0\"],\"t\":9,\"s\":[50,0],\"e\":[0,100]},{\"t\":30}],\"ix\":3},\"r\":{\"a\":0,\"k\":0,\"ix\":6},\"o\":{\"a\":0,\"k\":100,\"ix\":7},\"sk\":{\"a\":0,\"k\":0,\"ix\":4},\"sa\":{\"a\":0,\"k\":0,\"ix\":5},\"nm\":\"Transform\"}],\"nm\":\"Polystar 1\",\"np\":3,\"cix\":2,\"ix\":1,\"mn\":\"ADBE Vector Group\",\"hd\":false},{\"ty\":\"rp\",\"c\":{\"a\":0,\"k\":24,\"ix\":1},\"o\":{\"a\":0,\"k\":0,\"ix\":2},\"m\":1,\"ix\":2,\"tr\":{\"ty\":\"tr\",\"p\":{\"a\":0,\"k\":[0,0],\"ix\":2},\"a\":{\"a\":0,\"k\":[0,0],\"ix\":1},\"s\":{\"a\":0,\"k\":[100,100],\"ix\":3},\"r\":{\"a\":0,\"k\":15,\"ix\":4},\"so\":{\"a\":0,\"k\":100,\"ix\":5},\"eo\":{\"a\":0,\"k\":100,\"ix\":6},\"nm\":\"Transform\"},\"nm\":\"Repeater 1\",\"mn\":\"ADBE Vector Filter - Repeater\",\"hd\":false}],\"ip\":7.5,\"op\":31.5,\"st\":7.5,\"bm\":0},{\"ddd\":0,\"ind\":3,\"ty\":4,\"nm\":\"Shape Layer 1\",\"sr\":1,\"ks\":{\"o\":{\"a\":0,\"k\":100,\"ix\":11},\"r\":{\"a\":0,\"k\":0,\"ix\":10},\"p\":{\"a\":0,\"k\":[568,319.5,0],\"ix\":2},\"a\":{\"a\":0,\"k\":[0,0,0],\"ix\":1},\"s\":{\"a\":1,\"k\":[{\"i\":{\"x\":[0.057,0.057,0.667],\"y\":[1,1,1]},\"o\":{\"x\":[0,0,0.333],\"y\":[0,0,0]},\"n\":[\"0p057_1_0_0\",\"0p057_1_0_0\",\"0p667_1_0p333_0\"],\"t\":6,\"s\":[0,0,100],\"e\":[100,100,100]},{\"t\":27}],\"ix\":6}},\"ao\":0,\"shapes\":[{\"ty\":\"gr\",\"it\":[{\"ty\":\"sr\",\"sy\":2,\"d\":1,\"pt\":{\"a\":0,\"k\":3,\"ix\":3},\"p\":{\"a\":1,\"k\":[{\"i\":{\"x\":0.194,\"y\":1},\"o\":{\"x\":0.054,\"y\":0},\"n\":\"0p194_1_0p054_0\",\"t\":6,\"s\":[0,0],\"e\":[0,300],\"to\":[0,50],\"ti\":[0,-50]},{\"t\":27}],\"ix\":4},\"r\":{\"a\":0,\"k\":0,\"ix\":5},\"or\":{\"a\":0,\"k\":100,\"ix\":7},\"os\":{\"a\":0,\"k\":0,\"ix\":9},\"ix\":1,\"nm\":\"Polystar Path 1\",\"mn\":\"ADBE Vector Shape - Star\",\"hd\":false},{\"ty\":\"fl\",\"c\":{\"a\":0,\"k\":[1,0.497633421655,0.16718751496,1],\"ix\":4},\"o\":{\"a\":0,\"k\":100,\"ix\":5},\"r\":1,\"nm\":\"Fill 1\",\"mn\":\"ADBE Vector Graphic - Fill\",\"hd\":false},{\"ty\":\"tr\",\"p\":{\"a\":0,\"k\":[0,0],\"ix\":2},\"a\":{\"a\":0,\"k\":[0,0],\"ix\":1},\"s\":{\"a\":1,\"k\":[{\"i\":{\"x\":[0.194,0.431],\"y\":[1,1]},\"o\":{\"x\":[0.054,0.057],\"y\":[0,0]},\"n\":[\"0p194_1_0p054_0\",\"0p431_1_0p057_0\"],\"t\":6,\"s\":[50,0],\"e\":[0,100]},{\"t\":27}],\"ix\":3},\"r\":{\"a\":0,\"k\":0,\"ix\":6},\"o\":{\"a\":0,\"k\":100,\"ix\":7},\"sk\":{\"a\":0,\"k\":0,\"ix\":4},\"sa\":{\"a\":0,\"k\":0,\"ix\":5},\"nm\":\"Transform\"}],\"nm\":\"Polystar 1\",\"np\":3,\"cix\":2,\"ix\":1,\"mn\":\"ADBE Vector Group\",\"hd\":false},{\"ty\":\"rp\",\"c\":{\"a\":0,\"k\":12,\"ix\":1},\"o\":{\"a\":0,\"k\":0,\"ix\":2},\"m\":1,\"ix\":2,\"tr\":{\"ty\":\"tr\",\"p\":{\"a\":0,\"k\":[0,0],\"ix\":2},\"a\":{\"a\":0,\"k\":[0,0],\"ix\":1},\"s\":{\"a\":0,\"k\":[100,100],\"ix\":3},\"r\":{\"a\":0,\"k\":30,\"ix\":4},\"so\":{\"a\":0,\"k\":100,\"ix\":5},\"eo\":{\"a\":0,\"k\":100,\"ix\":6},\"nm\":\"Transform\"},\"nm\":\"Repeater 1\",\"mn\":\"ADBE Vector Filter - Repeater\",\"hd\":false}],\"ip\":6,\"op\":28.5,\"st\":6,\"bm\":0},{\"ddd\":0,\"ind\":4,\"ty\":4,\"nm\":\"Shape Layer 4\",\"sr\":1,\"ks\":{\"o\":{\"a\":0,\"k\":100,\"ix\":11},\"r\":{\"a\":0,\"k\":0,\"ix\":10},\"p\":{\"a\":0,\"k\":[568,319.5,0],\"ix\":2},\"a\":{\"a\":0,\"k\":[0,0,0],\"ix\":1},\"s\":{\"a\":0,\"k\":[100,100,100],\"ix\":6}},\"ao\":0,\"shapes\":[{\"ty\":\"gr\",\"it\":[{\"ty\":\"rc\",\"d\":1,\"s\":{\"a\":1,\"k\":[{\"i\":{\"x\":[1,0.95],\"y\":[1,1]},\"o\":{\"x\":[0.71,0.333],\"y\":[0,0]},\"n\":[\"1_1_0p71_0\",\"0p95_1_0p333_0\"],\"t\":0,\"s\":[4,0],\"e\":[435,4]},{\"i\":{\"x\":[0,0],\"y\":[1,1]},\"o\":{\"x\":[0.02,0.087],\"y\":[0,0]},\"n\":[\"0_1_0p02_0\",\"0_1_0p087_0\"],\"t\":7.5,\"s\":[435,4],\"e\":[0,3]},{\"t\":12}],\"ix\":2},\"p\":{\"a\":1,\"k\":[{\"i\":{\"x\":1,\"y\":1},\"o\":{\"x\":0.71,\"y\":0},\"n\":\"1_1_0p71_0\",\"t\":0,\"s\":[-568,0],\"e\":[-283,0],\"to\":[47.5,0],\"ti\":[-94.6666641235352,0]},{\"i\":{\"x\":0,\"y\":1},\"o\":{\"x\":0.02,\"y\":0},\"n\":\"0_1_0p02_0\",\"t\":7.5,\"s\":[-283,0],\"e\":[0,0],\"to\":[94.6666641235352,0],\"ti\":[-47.1666679382324,0]},{\"t\":12}],\"ix\":3},\"r\":{\"a\":0,\"k\":0,\"ix\":4},\"nm\":\"Rectangle Path 1\",\"mn\":\"ADBE Vector Shape - Rect\",\"hd\":false},{\"ty\":\"fl\",\"c\":{\"a\":0,\"k\":[1,0.615883501838,0.36321997549,1],\"ix\":4},\"o\":{\"a\":0,\"k\":100,\"ix\":5},\"r\":1,\"nm\":\"Fill 1\",\"mn\":\"ADBE Vector Graphic - Fill\",\"hd\":false},{\"ty\":\"tr\",\"p\":{\"a\":0,\"k\":[0,0],\"ix\":2},\"a\":{\"a\":0,\"k\":[0,0],\"ix\":1},\"s\":{\"a\":0,\"k\":[100,100],\"ix\":3},\"r\":{\"a\":0,\"k\":0,\"ix\":6},\"o\":{\"a\":0,\"k\":100,\"ix\":7},\"sk\":{\"a\":0,\"k\":0,\"ix\":4},\"sa\":{\"a\":0,\"k\":0,\"ix\":5},\"nm\":\"Transform\"}],\"nm\":\"Rectangle 1\",\"np\":3,\"cix\":2,\"ix\":1,\"mn\":\"ADBE Vector Group\",\"hd\":false}],\"ip\":0,\"op\":54,\"st\":0,\"bm\":0}]}],\"layers\":[{\"ddd\":0,\"ind\":1,\"ty\":0,\"nm\":\"Fireworks\",\"refId\":\"comp_0\",\"sr\":1,\"ks\":{\"o\":{\"a\":0,\"k\":100,\"ix\":11},\"r\":{\"a\":0,\"k\":-62.525,\"ix\":10},\"p\":{\"a\":0,\"k\":[153.272,612.543,0],\"ix\":2},\"a\":{\"a\":0,\"k\":[568,319.5,0],\"ix\":1},\"s\":{\"a\":0,\"k\":[100,100,100],\"ix\":6}},\"ao\":0,\"w\":1136,\"h\":639,\"ip\":26,\"op\":80,\"st\":26,\"bm\":0},{\"ddd\":0,\"ind\":2,\"ty\":0,\"nm\":\"Fireworks\",\"refId\":\"comp_0\",\"sr\":1,\"ks\":{\"o\":{\"a\":0,\"k\":100,\"ix\":11},\"r\":{\"a\":0,\"k\":-82.434,\"ix\":10},\"p\":{\"a\":0,\"k\":[315.416,300.741,0],\"ix\":2},\"a\":{\"a\":0,\"k\":[568,319.5,0],\"ix\":1},\"s\":{\"a\":0,\"k\":[100,100,100],\"ix\":6}},\"ao\":0,\"w\":1136,\"h\":639,\"ip\":17,\"op\":71,\"st\":17,\"bm\":0},{\"ddd\":0,\"ind\":3,\"ty\":0,\"nm\":\"Fireworks\",\"refId\":\"comp_0\",\"sr\":1,\"ks\":{\"o\":{\"a\":0,\"k\":100,\"ix\":11},\"r\":{\"a\":0,\"k\":-108.396,\"ix\":10},\"p\":{\"a\":0,\"k\":[564.728,513.82,0],\"ix\":2},\"a\":{\"a\":0,\"k\":[568,319.5,0],\"ix\":1},\"s\":{\"a\":0,\"k\":[100,100,100],\"ix\":6}},\"ao\":0,\"w\":1136,\"h\":639,\"ip\":8,\"op\":62,\"st\":8,\"bm\":0},{\"ddd\":0,\"ind\":4,\"ty\":0,\"nm\":\"Fireworks\",\"refId\":\"comp_0\",\"sr\":1,\"ks\":{\"o\":{\"a\":0,\"k\":100,\"ix\":11},\"r\":{\"a\":0,\"k\":-119.562,\"ix\":10},\"p\":{\"a\":0,\"k\":[360,640,0],\"ix\":2},\"a\":{\"a\":0,\"k\":[568,319.5,0],\"ix\":1},\"s\":{\"a\":0,\"k\":[100,100,100],\"ix\":6}},\"ao\":0,\"w\":1136,\"h\":639,\"ip\":0,\"op\":54,\"st\":0,\"bm\":0},{\"ddd\":0,\"ind\":5,\"ty\":0,\"nm\":\"Fireworks\",\"refId\":\"comp_0\",\"sr\":1,\"ks\":{\"o\":{\"a\":0,\"k\":100,\"ix\":11},\"r\":{\"a\":0,\"k\":-105.393,\"ix\":10},\"p\":{\"a\":0,\"k\":[253.284,768.545,0],\"ix\":2},\"a\":{\"a\":0,\"k\":[568,319.5,0],\"ix\":1},\"s\":{\"a\":0,\"k\":[100,100,100],\"ix\":6}},\"ao\":0,\"w\":1136,\"h\":639,\"ip\":98,\"op\":152,\"st\":98,\"bm\":0},{\"ddd\":0,\"ind\":6,\"ty\":0,\"nm\":\"Fireworks\",\"refId\":\"comp_0\",\"sr\":1,\"ks\":{\"o\":{\"a\":0,\"k\":100,\"ix\":11},\"r\":{\"a\":0,\"k\":-125.303,\"ix\":10},\"p\":{\"a\":0,\"k\":[415.429,456.742,0],\"ix\":2},\"a\":{\"a\":0,\"k\":[568,319.5,0],\"ix\":1},\"s\":{\"a\":0,\"k\":[100,100,100],\"ix\":6}},\"ao\":0,\"w\":1136,\"h\":639,\"ip\":89,\"op\":143,\"st\":89,\"bm\":0},{\"ddd\":0,\"ind\":7,\"ty\":0,\"nm\":\"Fireworks\",\"refId\":\"comp_0\",\"sr\":1,\"ks\":{\"o\":{\"a\":0,\"k\":100,\"ix\":11},\"r\":{\"a\":0,\"k\":-151.264,\"ix\":10},\"p\":{\"a\":0,\"k\":[664.741,669.822,0],\"ix\":2},\"a\":{\"a\":0,\"k\":[568,319.5,0],\"ix\":1},\"s\":{\"a\":0,\"k\":[100,100,100],\"ix\":6}},\"ao\":0,\"w\":1136,\"h\":639,\"ip\":80,\"op\":134,\"st\":80,\"bm\":0},{\"ddd\":0,\"ind\":8,\"ty\":0,\"nm\":\"Fireworks\",\"refId\":\"comp_0\",\"sr\":1,\"ks\":{\"o\":{\"a\":0,\"k\":100,\"ix\":11},\"r\":{\"a\":0,\"k\":-162.431,\"ix\":10},\"p\":{\"a\":0,\"k\":[460.013,796.002,0],\"ix\":2},\"a\":{\"a\":0,\"k\":[568,319.5,0],\"ix\":1},\"s\":{\"a\":0,\"k\":[100,100,100],\"ix\":6}},\"ao\":0,\"w\":1136,\"h\":639,\"ip\":72,\"op\":126,\"st\":72,\"bm\":0}]}";
    private static final String TAG = "TAG";

    private LottieAnimationView lavOne;
    private LottieAnimationView lavTwo;
    private LottieAnimationView lavThree;
    private Button btnOne;
    private Button btnTwo;
    private Button btnThree;

    private boolean flag = true;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lottie_use);
        initView();
        setListener();
    }

    /**
     * 指纹
     */
    private void showAnimationFive() {
        lavThree.cancelAnimation();
        lavThree.setAnimation("fingerPrint.json");
        lavThree.setRepeatCount(0);
        lavThree.setRepeatMode(1);
        lavThree.playAnimation();
    }

    /**
     * 充电
     */
    private void showAnimationFour() {
        lavThree.cancelAnimation();
        lavThree.setAnimation("battery.json");
        lavThree.setRepeatCount(0);
        lavThree.setRepeatMode(1);
        lavThree.playAnimation();
    }

    /**
     * 两种状态切换
     */
    private void showAnimationThree() {
        if (flag) {
            flag = false;
            lavThree.cancelAnimation();
            lavThree.setAnimation("menuButton1.json");
            lavThree.setRepeatCount(0);
            lavThree.setRepeatMode(1);
            lavThree.setMinAndMaxProgress(0.0f, 0.5f);
            lavThree.playAnimation();
        } else {
            flag = true;
            lavThree.cancelAnimation();
            lavThree.setAnimation("menuButton1.json");
            lavThree.setRepeatCount(0);
            lavThree.setRepeatMode(2);
            lavThree.setMinAndMaxProgress(0.5f, 1.0f);
            lavThree.playAnimation();
        }
    }

    /**
     * 根据json字符串加载动画
     * 灵活性高，可动态从网络下载json数据替换
     */
    private void showAnimationTwo() {
        lavTwo.setAnimationFromJson(ANIMATION_JSON);
        lavTwo.setRepeatCount(-1);
        lavTwo.setRepeatMode(1);
        lavTwo.playAnimation();
    }

    /**
     * 根据本地assets下json文件加载动画
     */
    private void showAnimationOne() {
        lavOne.setAnimation("walking.json");
        lavOne.setRepeatCount(-1);
        lavOne.setRepeatMode(1);
        lavOne.playAnimation();
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.btn_one:
                //walking
                showAnimationOne();
                break;
            case R.id.btn_two:
                //fireworks
                showAnimationTwo();
                break;
            case R.id.btn_three:
                //
                showAnimationThree();
//                showAnimationFour();
//                showAnimationFive();
                break;
            default:
                break;
        }
    }

    private void setListener() {
        btnOne.setOnClickListener(this);
        btnTwo.setOnClickListener(this);
        btnThree.setOnClickListener(this);
    }

    private void initView() {
        lavOne = findViewById(R.id.lav_one);
        lavTwo = findViewById(R.id.lav_two);
        lavThree = findViewById(R.id.lav_three);
        lavOne.setImageResource(R.mipmap.ic_launcher);
        lavTwo.setImageResource(R.mipmap.ic_launcher);
        lavThree.setImageResource(R.mipmap.ic_launcher);
        btnOne = findViewById(R.id.btn_one);
        btnTwo = findViewById(R.id.btn_two);
        btnThree = findViewById(R.id.btn_three);
    }
}