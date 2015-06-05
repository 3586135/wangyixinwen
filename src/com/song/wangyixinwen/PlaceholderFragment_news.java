package com.song.wangyixinwen;

import java.util.ArrayList;
import java.util.List;

import com.song.wangyixinwen.MainActivity.myPagerAdapter;

import android.app.Fragment;
import android.os.Bundle;
import android.support.v4.view.PagerTitleStrip;
import android.support.v4.view.ViewPager;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

public class PlaceholderFragment_news extends Fragment {
	public PlaceholderFragment_news() {
	}

	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container,
			Bundle savedInstanceState) {
		View rootView = inflater.inflate(R.layout.fragment_main_news,
				container, false);

		return rootView;
	}

}
