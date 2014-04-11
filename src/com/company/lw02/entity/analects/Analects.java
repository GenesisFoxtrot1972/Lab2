package com.company.lw02.entity.analects;

import java.util.ArrayList;

/**
 * Created by Pyzhic Valeriy on 8/04/2014;
 */
public class Analects {
    private ArrayList<Item> items;
   
    
    public Analects(){
    	items = new ArrayList<Item>();
    }
    
    public void addWork(Item i){
    	items.add(i);
    }
    
    @Override
    public String toString(){
        String result = new String();
        for (Item i: items){
        	result+=i.toString()+'\n';
        }
        return result;
    }
}
