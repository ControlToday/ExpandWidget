package com.jian.widget.myapplication;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import com.expand.widget.banner.BannerView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        BannerView banner = (BannerView) findViewById(R.id.home_banner);
        banner.setIndicatorsVisibility(true);

        ArrayList<String> urls = new ArrayList<>();
        urls.add("http://y.gtimg.cn/music/common/upload/t_focus_info_iphone/34738.jpg");
        urls.add("http://y.gtimg.cn/music/common/upload/t_focus_info_iphone/34738.jpg");
        urls.add("http://y.gtimg.cn/music/common/upload/t_focus_info_iphone/34817.jpg");
        urls.add("http://y.gtimg.cn/music/common/upload/t_focus_info_iphone/34817.jpg");
        banner.setImageUrls(urls);
        banner.setIndicatorsVisibility(false);
    }
}
