package com.mobiledevpro.commonsuilibrary;

import android.view.View;

import com.mobiledevpro.commons.activity.BaseActivity;

public class MainActivity extends BaseActivity {

    @Override
    protected int getLayoutResId() {
        return R.layout.activity_main;
    }

    @Override
    protected boolean isAdjustFontScaleToNormal() {
        return false;
    }

    @Override
    protected void populateView(View layoutView) {

    }

    @Override
    protected void initToolbar() {

    }

    @Override
    protected void initPresenters() {

    }
}
