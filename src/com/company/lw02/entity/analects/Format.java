package com.company.lw02.entity.analects;

import com.company.lw02.to.*;


/**
 * Created by Pyzhic Valeriy on 8/04/2014;
 */
public class  Format extends  Item{
   protected String title;
   
   public void setTitle(String title){
	   this.title = title;
   }
   
   public String getTitle(){
	   return title;
   }
   
   public void construct(FormatTO to){};
	   
   
}
