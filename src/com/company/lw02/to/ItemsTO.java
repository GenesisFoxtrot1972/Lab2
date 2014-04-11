package com.company.lw02.to;

import java.util.ArrayList;


/**
 * Created by Pyzhic Valeriy on 8/04/2014;
 */
public class ItemsTO {
	private ArrayList<WorkTO> list =  new ArrayList<WorkTO>();
	private FormatTO format;
	private String worksListTitle;
	public void  addWork(WorkTO w){
		list.add(w);
	}
	public int command;
	
	public ArrayList<WorkTO> getWorkList(){
		return list;
	}
	
	public void setWorksListTitle(String s){
		this.worksListTitle = s;
	}
	
	public String getWorksListTitle(){
 	    return this.worksListTitle;	
	}
	
	public void setFormat(FormatTO format){
		this.format = format;
	}
	
	public FormatTO getFormat(){
		return format;
	}
	
	
}
