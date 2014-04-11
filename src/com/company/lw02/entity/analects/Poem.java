package com.company.lw02.entity.analects;

import com.company.lw02.consts.*;
import com.company.lw02.to.*;

/**
 * Created by Pyzhic Valeriy on 8/04/2014;
 */
public class Poem extends LiteraryWork{
    private VerseSize size;
	
    
    public void setVerseSize(VerseSize size){
    	this.size = size;
    }
    
    @Override 
    public void construct(WorkTO to){
       this.title = to.title;
       this.author = to.author;
       this.size = to.size;
    }
    
	@Override 
	public String toString(){
	    return "Poem:\n"+"      Author: "+this.author+"\n      Title: " + this.title +"\n      Verse Size: " + this.size;
	}
	
	
	public boolean equals(Poem p){
		boolean result;
		if ((this.author == p.author)&&(this.title == p.title)){	
		   result = true;
		}
		else{
		   result = false;
		}		
		return result;
	}
	
	@Override 
    public int hashCode() {
    	int hash = title.hashCode() * author.hashCode() * size.hashCode();;
        return hash;
    }
	
}
