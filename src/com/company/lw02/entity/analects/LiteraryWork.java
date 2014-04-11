package com.company.lw02.entity.analects;

import com.company.lw02.to.*;

/**
 * Created by Pyzhic Valeriy on 8/04/2014;
 */
public class LiteraryWork  {
    protected String author;
    protected String title;
    
    public void setAuthor(String author){
    	this.author = author;
    }
    
    public void setTitle(String title){
    	this.title = title;
    }
    
    public void construct(WorkTO to){}
}
