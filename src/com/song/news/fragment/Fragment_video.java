package com.song.news.fragment;

import com.song.wangyixinwen.R;
import com.song.wangyixinwen.R.layout;

import android.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

public class Fragment_video extends Fragment {

	public Fragment_video() {
	}

	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container,
			Bundle savedInstanceState) {
		View rootView = inflater.inflate(R.layout.fragment_main_video,
				container, false);

		return rootView;
	}
}
