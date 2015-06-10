package com.song.news.fragment;

import java.util.ArrayList;
import java.util.List;

import com.song.news.MainActivity.myPagerAdapter;
import com.song.wangyixinwen.R;
import com.song.wangyixinwen.R.layout;

import android.app.Fragment;
import android.os.Bundle;
import android.support.v4.view.PagerTitleStrip;
import android.support.v4.view.ViewPager;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

public class Fragment_news extends Fragment {
	public Fragment_news() {
	}

	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container,
			Bundle savedInstanceState) {
		View rootView = inflater.inflate(R.layout.fragment_main_news,
				container, false);

		return rootView;
	}

}
