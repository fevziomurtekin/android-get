package com.tekin.deneme1;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

public class 	ListAdapter extends BaseAdapter {

	MainActivity main;
	
	ListAdapter(MainActivity main)
	{
		this.main = main;
	}
	
	@Override
	public int getCount() {
		return  main.countries.size();
	}
 
	@Override
	public Object getItem(int position) {
		return null;
	}
 
	@Override
	public long getItemId(int position) {
		return 0;
	}
	
	static class ViewHolderItem {
		TextView name;
		TextView major;
		TextView tel;
	}

	@Override
	public View getView(int position, View convertView, ViewGroup parent){
		ViewHolderItem holder = new ViewHolderItem();
		if (convertView == null) {
		 LayoutInflater inflater = (LayoutInflater) main.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
	        convertView = inflater.inflate(R.layout.cell, null);
	        
	        holder.name = (TextView) convertView.findViewById(R.id.name);
	        holder.major = (TextView) convertView.findViewById(R.id.major);
			holder.tel= (TextView) convertView.findViewById(R.id.tel);
	        
	        convertView.setTag(holder);
		}
		else
		{
			 holder = (ViewHolderItem) convertView.getTag();
		}
	        
		
		holder.name.setText(this.main.countries.get(position).getStName());
		holder.major.setText(this.main.countries.get(position).getStMajor());
		holder.tel.setText(this.main.countries.get(position).getStTel());

		
		return convertView;
	}

}
