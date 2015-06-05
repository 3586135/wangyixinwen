package com.song.wangyixinwen;

import android.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

public class PlaceholderFragment_me extends Fragment {
	public PlaceholderFragment_me() {
	}

	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container,
			Bundle savedInstanceState) {
		View rootView = inflater.inflate(R.layout.fragment_main_me,
				container, false);
		
		return rootView;
	}
}
