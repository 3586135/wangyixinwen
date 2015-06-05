package com.song.wangyixinwen;

import java.util.ArrayList;
import java.util.List;

import com.song.wangyixinwen.R.layout;

import android.R.string;
import android.app.Activity;
import android.app.Fragment;
import android.os.Bundle;
import android.support.v4.view.PagerAdapter;
import android.support.v4.view.PagerTitleStrip;
import android.support.v4.view.ViewPager;
import android.support.v4.*;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

public class MainActivity extends Activity {

	// 初始化界面参数
	private Button buttonNews;
	private Button buttonRead;
	private Button buttonVideo;
	private Button buttonDiscovery;
	private Button buttonMe;
	// 新闻—viewpager
	private ViewPager viewPager;
	private PagerTitleStrip pagerTitleStrip; // 滑动的 每一页的标题
	private List<View> list; // 表示华东装载的布局
	private List<String> titlelist;// 表示滑动的每一页标题

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);

		if (savedInstanceState == null) {
			getFragmentManager().beginTransaction()
					.add(R.id.container, new PlaceholderFragment()).commit();
		}

		// 初始化界面
		Button buttonNews = (Button) findViewById(R.id.main_btn_news);
		Button buttonRead = (Button) findViewById(R.id.main_btn_read);
		Button buttonVideo = (Button) findViewById(R.id.main_btn_video);
		Button buttonDiscovery = (Button) findViewById(R.id.main_btn_discovery);
		Button buttonMe = (Button) findViewById(R.id.main_btn_me);

		// 初始化监听
		ClickListener l = new ClickListener();
		buttonNews.setOnClickListener(l);
		buttonRead.setOnClickListener(l);
		buttonDiscovery.setOnClickListener(l);
		buttonMe.setOnClickListener(l);
		buttonVideo.setOnClickListener(l);

		// initView(); initListener();

		// news动态加载布局
		LayoutInflater vInflater = getLayoutInflater();

		View tab1 = vInflater.inflate(R.layout.news_viewpager_tab1, null);
		View tab2 = LayoutInflater.from(this).inflate(
				R.layout.news_viewpager_tab2, null);
		View tab3 = LayoutInflater.from(this).inflate(
				R.layout.news_viewpager_tab3, null);
		list = new ArrayList<View>();
		list.add(tab1);
		list.add(tab2);
		list.add(tab3);
		titlelist = new ArrayList<String>();
		titlelist.add("title1");
		titlelist.add("title2");
		titlelist.add("title3");

		View test = vInflater.inflate(R.layout.fragment_main_news, null);
		viewPager = (ViewPager) test.findViewById(R.id.news_viewpager);
		myPagerAdapter adapter = new myPagerAdapter();
		viewPager.setAdapter(adapter);
	}

	public class myPagerAdapter extends PagerAdapter {

		@Override
		public int getCount() {
			// 返回的是list<view>布局的个数

			return list.size();
		}

		@Override
		public CharSequence getPageTitle(int position) {
			// TODO Auto-generated method stub
			return titlelist.get(position);// 获得标题栏的值
		}

		@Override
		public Object instantiateItem(View container, int position) {
			// 获取新的view

			((ViewPager) container).addView(list.get(position));

			return list.get(position);
		}

		@Override
		public void destroyItem(View container, int position, Object object) {
			// TODO Auto-generated method stub
			// super.destroyItem(container, position, object);
			((ViewPager) container).removeView(list.get(position));// 获取显示的view并删除，
		}

		@Override
		public boolean isViewFromObject(View arg0, Object arg1) {
			// TODO Auto-generated method stub
			return arg0 == arg1;
		}

	}

	private class ClickListener implements OnClickListener {
		@Override
		public void onClick(View view) {
			// TODO Auto-generated method stub
			switch (view.getId()) {
			case R.id.main_btn_news:
				getFragmentManager()
						.beginTransaction()
						.replace(R.id.container, new PlaceholderFragment_news())
						.commit();
				break;
			case R.id.main_btn_read:
				getFragmentManager()
						.beginTransaction()
						.replace(R.id.container, new PlaceholderFragment_read())
						.commit();
				break;
			case R.id.main_btn_video:
				getFragmentManager()
						.beginTransaction()
						.replace(R.id.container,
								new PlaceholderFragment_video()).commit();
				break;
			case R.id.main_btn_discovery:
				getFragmentManager()
						.beginTransaction()
						.replace(R.id.container,
								new PlaceholderFragment_discovery()).commit();
				break;
			case R.id.main_btn_me:
				getFragmentManager().beginTransaction()
						.replace(R.id.container, new PlaceholderFragment_me())
						.commit();
			default:
				break;
			}
		}
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}

	@Override
	public boolean onOptionsItemSelected(MenuItem item) {
		// Handle action bar item clicks here. The action bar will
		// automatically handle clicks on the Home/Up button, so long
		// as you specify a parent activity in AndroidManifest.xml.
		int id = item.getItemId();
		if (id == R.id.action_settings) {
			return true;
		}
		return super.onOptionsItemSelected(item);
	}
}
