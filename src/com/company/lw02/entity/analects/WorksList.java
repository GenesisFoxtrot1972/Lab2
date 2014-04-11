package com.company.lw02.entity.analects;

import java.util.ArrayList;

/**
 * Created by Pyzhic Valeriy on 8/04/2014;
 */
public class WorksList extends Item {
    private ArrayList<LiteraryWork> list;
    public String title;
    
    public WorksList(String title)
    {
    	list = new ArrayList<LiteraryWork>(); 
    	this.title = title;
    }
    
    public void addWork(LiteraryWork w){
    	list.add(w);
    }
    
    public void removeWork(LiteraryWork w){
    	list.remove(w);
    }
    
    @Override 
    public String toString(){
    	String result = new String();
    	result += this.title +" Works List:\n";
        for (LiteraryWork w: list){
        	result +="   "+w.toString()+'\n'; 
        }
        result +="----------------------------------------------------------------";
    	return result;
    }   
}
