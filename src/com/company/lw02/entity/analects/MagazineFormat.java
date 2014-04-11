package com.company.lw02.entity.analects;

import com.company.lw02.consts.*;
import com.company.lw02.to.FormatTO;

/**
 * Created by Pyzhic Valeriy on 8/04/2014;
 */
public class MagazineFormat extends Format{
	private SheetType sheet;
    
	@Override
    public void construct(FormatTO to){
    	this.title = to.title;
       	this.sheet = to.sheet; 
    }
	
	public void setSheet(SheetType sheet){
		this.sheet = sheet;
	}
	
	public SheetType getSheet(){
	    return sheet;
	}
	
	@Override 
    public String toString(){
    	String result = new String();
    	result="Magazine:\n"+"   Title: " + title+ "\n   Sheets type:" + sheet.name();
    	return result;
    	
    }
	
	 public boolean equals(MagazineFormat b){
	    	boolean result;
	    	if ((this.title == b.title)&&(this.sheet==b.sheet))
	    	{	
	    		result = true;
	    	}
	    	else{ 
	    		result = false;
	    	}
	    	return result;
	    }
	 
	 @Override 
	 public int hashCode() {
	    	int hash = title.hashCode() * sheet.hashCode();
	        return hash;
	 }
}
