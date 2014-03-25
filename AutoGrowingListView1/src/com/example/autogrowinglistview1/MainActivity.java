package com.example.autogrowinglistview1;

import java.util.ArrayList;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.ListView;

public class MainActivity extends Activity {

	ArrayList<String> arr;
	EditText text;
	ArrayAdapter<String> adapter;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);

		text = (EditText) findViewById(R.id.editText1);
		ListView listView = (ListView) findViewById(R.id.listView1);

		arr = new ArrayList<String>();
		setData();

		adapter = new ArrayAdapter<String>(getApplicationContext(),
				android.R.layout.simple_list_item_1, arr);
		listView.setAdapter(adapter);

		findViewById(R.id.button1).setOnClickListener(new OnClickListener() {

			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub

				arr.add(text.getText().toString());
				adapter.notifyDataSetChanged();
			}
		});

	}

	private void setData() {
		// TODO Auto-generated method stub

		for (int i = 0; i < 5; i++) {
			arr.add("" + i);

		}

	}

}
