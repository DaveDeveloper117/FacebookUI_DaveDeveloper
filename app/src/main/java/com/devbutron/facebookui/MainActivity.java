package com.devbutron.facebookui;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentPagerAdapter;
import androidx.viewpager.widget.ViewPager;

import android.os.Bundle;
import android.view.View;
import android.widget.RelativeLayout;

import com.google.android.material.tabs.TabItem;
import com.google.android.material.tabs.TabLayout;

public class MainActivity extends AppCompatActivity {

    RelativeLayout topBar;
    TabLayout homeTabLayout;
    ViewPager contentView;
    TabItem tabHome, tabWatch, tabMarketPlace, tabGaming, tabNotification, tabMenu;
    PagerController pagerController;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        topBar = findViewById(R.id.topBar);
        homeTabLayout = findViewById(R.id.homeTabLayout);
        contentView = findViewById(R.id.contentView);

        tabGaming = findViewById(R.id.tabGaming);
        tabHome = findViewById(R.id.tabHome);
        tabMarketPlace = findViewById(R.id.tabMarketPlace);
        tabWatch = findViewById(R.id.tabWatch);
        tabNotification = findViewById(R.id.tabNotification);
        tabMenu = findViewById(R.id.tabMenu);

        pagerController = new PagerController(getSupportFragmentManager(), homeTabLayout.getTabCount());
        contentView.setAdapter(pagerController);

        homeTabLayout.setOnTabSelectedListener(new TabLayout.OnTabSelectedListener() {
            @Override
            public void onTabSelected(TabLayout.Tab tab) {
                contentView.setCurrentItem(tab.getPosition());
                if (tab.getPosition()==0){
                    pagerController.notifyDataSetChanged();
                    topBar.setVisibility(View.VISIBLE);
                }
                if (tab.getPosition()==1){
                    pagerController.notifyDataSetChanged();
                    topBar.setVisibility(View.GONE);
                }
                if (tab.getPosition()==2){
                    pagerController.notifyDataSetChanged();
                    topBar.setVisibility(View.GONE);
                }
                if (tab.getPosition()==3){
                    pagerController.notifyDataSetChanged();
                    topBar.setVisibility(View.GONE);
                }
                if (tab.getPosition()==4){
                    pagerController.notifyDataSetChanged();
                    topBar.setVisibility(View.GONE);
                }
                if (tab.getPosition()==5){
                    pagerController.notifyDataSetChanged();
                    topBar.setVisibility(View.GONE);
                }
            }

            @Override
            public void onTabUnselected(TabLayout.Tab tab) {

            }

            @Override
            public void onTabReselected(TabLayout.Tab tab) {

            }
        });
        contentView.addOnPageChangeListener(new TabLayout.TabLayoutOnPageChangeListener(homeTabLayout));
    }
}