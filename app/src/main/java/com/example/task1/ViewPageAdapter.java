package com.example.task1;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;

import java.util.ArrayList;
import java.util.List;

public class ViewPageAdapter extends FragmentPagerAdapter {
    List<Fragment> lstFragment = new ArrayList<>();
    List<String> lsttittle = new ArrayList<>();
    public ViewPageAdapter(@NonNull @org.jetbrains.annotations.NotNull FragmentManager fm) {
        super(fm);
    }

    @NonNull
    @org.jetbrains.annotations.NotNull
    @Override
    public Fragment getItem(int position) {
        return lstFragment.get(position);
    }

    @Override
    public int getCount() {
        return lsttittle.size();
    }

    @Nullable
    @org.jetbrains.annotations.Nullable
    @Override
    public CharSequence getPageTitle(int position) {
        return super.getPageTitle(position);
    }
    //Add Fragments
    public void addFragment(Fragment fragment,String tittle){
        lstFragment.add(fragment);
        lsttittle.add(tittle);
    }

    public void setAdapter(ViewPageAdapter viewPageAdapter) {
    }
}
