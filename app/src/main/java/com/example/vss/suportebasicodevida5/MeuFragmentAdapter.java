package com.example.vss.suportebasicodevida5;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

/**
 * Created by a46570 on 05-03-2015.
 */
public class MeuFragmentAdapter extends FragmentPagerAdapter {

    MeuFragmentAdapter(FragmentManager fm) {
        super(fm);
    }

    @Override
    public Fragment getItem(int position) {

        Fragment fragment = null;

        if (position == 0) {
            fragment = new FragmentEngPedirParaTossir1();
        }
        if (position == 1) {
            fragment = new FragmentPrincipal();
        }
        if (position == 2) {
            fragment = new FragmentSbvVerificarEstadoDeCosciencia1();
        }
        return fragment;
    }

    @Override
    public int getCount() {
        return 3;
    }
}
