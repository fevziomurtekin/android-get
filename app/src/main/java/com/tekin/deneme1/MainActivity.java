package com.tekin.deneme1;

import android.app.Activity;
import android.os.Bundle;
import android.widget.ListView;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import java.util.ArrayList;


public class MainActivity extends Activity implements Download_data.download_complete{

	public ListView list;
    public ArrayList<Example> countries = new ArrayList<Example>();
    public ListAdapter adapter;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);

		list = (ListView) findViewById(R.id.list);
		adapter = new ListAdapter(this);
		list.setAdapter(adapter);

		Download_data download_data = new Download_data((Download_data.download_complete) this);
		download_data.download_data_from_link("http://192.168.56.1:8080/cek.php");
		
	}

	public void get_data(String data)
	{
		try {
			JSONArray data_array=new JSONArray(data);

			
			for (int i = 0 ; i < data_array.length() ; i++)
			{
				JSONObject obj=new JSONObject(data_array.get(i).toString());

				Example add=new Example();

				add.stName = obj.getString("st_name");
				add.stMajor=obj.getString("st_major");
				add.stTel = obj.getString("st_tel");

				countries.add(add);

			}

			adapter.notifyDataSetChanged();
			
		}
		catch (JSONException e) {
			e.printStackTrace();
		}

	}


}
