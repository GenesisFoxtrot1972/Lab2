package com.company.lw02.entity.analects;

import com.company.lw02.consts.Genre;
import com.company.lw02.to.WorkTO;

/**
 * Created by Pyzhic Valeriy on 8/04/2014;
 */
public class Story extends LiteraryWork{

    private Genre genre;
    
    @Override 
    public void construct(WorkTO to){
       this.title = to.title;
       this.author = to.author;
       this.genre = to.genre;
    }
    
	@Override 
	public String toString(){
		return "Story:\n"+"      Author: "+this.author+"\n      Title: " + this.title +"\n      Genre: " + this.genre;
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
    	int hash = title.hashCode() * author.hashCode() * genre.hashCode();;
        return hash;
    }
}
