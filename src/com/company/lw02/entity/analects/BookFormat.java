package com.company.lw02.entity.analects;

import com.company.lw02.consts.*;
import com.company.lw02.to.*;
/**
 * Created by Pyzhic Valeriy on 8/04/2014;
 */
public class BookFormat extends Format {
    private Cover cover;
    private Illustration illust; 
    
    public void setCover(Cover cover){
    	this.cover = cover;
    }
    
    
    public void setIllustration(Illustration il){
    	this.illust = il;
    }
    
    @Override
    public void construct(FormatTO to){
    	this.title = to.title;
       	this.cover = to.cover;
       	this.illust = to.illust;
    }
    
    @Override 
    public String toString(){
    	String result = new String();
    	result="Book:\n"+"   Title: " + title + "\n   Cover type:" + cover.name()+"\n   Illustration: "+illust.name();
    	return result;
    	
    }
    
    public boolean equals(BookFormat b){
    	boolean result;
    	if ((this.title == b.title)&&(this.illust==b.illust)&&(this.cover==b.cover))
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
    	int hash = title.hashCode() * cover.hashCode() * illust.hashCode();;
        return hash;
    }

  
    
}
