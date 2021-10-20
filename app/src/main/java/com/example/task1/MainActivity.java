package com.example.task1;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.ViewPager;

import android.os.Bundle;
import android.telecom.Call;
import android.view.MenuItem;
import android.widget.Toolbar;

import com.example.task1.ui.Calls;
import com.example.task1.ui.Chats;
import com.example.task1.ui.Status;
import com.google.android.material.tabs.TabLayout;

public class MainActivity extends AppCompatActivity {

    ViewPageAdapter viewPageAdapter;
    TabLayout tabLayout;
    ViewPager viewpager;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

//        Toolbar toolbar = findViewById(R.id.toolBar);
//        getSupportActionBar(toolbar);
//        getSupportActionBar().setTitle(getString(R.string.app_name));
//        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        //Tabbed Activity
        tabLayout = findViewById(R.id.tabLayout);
        viewpager = findViewById(R.id.viewPager);
        viewPageAdapter = new ViewPageAdapter(getSupportFragmentManager());

        //viewPagerAdapter
        viewPageAdapter.addFragment(new Calls(),"Calls");
        viewPageAdapter.addFragment(new Chats(),"Calls");
        viewPageAdapter.addFragment(new Status(),"");
        viewPageAdapter.setAdapter(viewPageAdapter);
        tabLayout.setupWithViewPager(viewpager);

       
        private void setupViewpager(ViewPager viewPager) {
            MyPageAdapter adapter = new MyPageAdapter(getSupportFragmentManager());
            adapter.addFrag(new ChatsFragment(),"Chats");
            adapter.addFrag(new StatusFragment(),"Account");
            adapter.addFrag(new CallsFragment(),"Calls");
            viewPager.setAdapter(adapter);

            tabLayout.getTabAt(0).setIcon(R.drawable.ic_baseline_chat_24);
            tabLayout.getTabAt(1).setIcon(R.drawable.account);
            tabLayout.getTabAt(2).setIcon(R.drawable.ic_baseline_call_24 );
        }

//    @Override
//    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
//        return super.onOptionsItemSelected(item);
//    }
}