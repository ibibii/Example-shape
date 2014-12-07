package com.qf.android_shape;

import java.util.ArrayList;
import java.util.List;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;
import android.widget.ArrayAdapter;
import android.widget.ListView;
/**
 * shape的corner点击时,是点击时的效果覆盖默认效果.
 * @author uaige
 *
 */
public class MainActivity extends Activity {
	private ListView lv;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		lv = (ListView) findViewById(R.id.lv);
		List<String> datas =new  ArrayList<String>();
		for(int i=0;i<20;i++){
			datas.add("  item  "+i);
		}
		ArrayAdapter<String> adapter = new ArrayAdapter<String>(MainActivity.this,R.layout.item_lv,R.id.tx,datas);
		lv.setAdapter(adapter);
	}
}
