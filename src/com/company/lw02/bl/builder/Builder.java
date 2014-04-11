package com.company.lw02.bl.builder;

import com.company.lw02.entity.analects.*;
import com.company.lw02.to.*;
import com.company.lw02.bl.factory.*;


/**
 * Created by Pyzhic Valeriy on 8/04/2014;
 */
public class Builder {
   private FormatFactory formatFac;
   private WorkFactory workFac;
   
   public Builder(){
	  formatFac = new FormatFactory();
	  workFac= new WorkFactory();
   }
   
   /**
	 * <p> Builder method</p>
	 * collects analects
	 * @param ItemsTO to is params of Analects 
	 * @return Analects requested object
	 */
   
   public Analects build(ItemsTO to) {
	   
	   Analects result = new Analects();
	   try{
	     Format format = formatFac.getObj(to.getFormat().type);
	     format.construct(to.getFormat());
	   
	     WorksList worksList = new WorksList(to.getWorksListTitle());
	     for (WorkTO w: to.getWorkList()){
		     LiteraryWork work= workFac.getObj(w.type);
		     work.construct(w);
		     worksList.addWork(work);
	     }
	   
	     Item foramatItem = format;
	     Item wList = worksList;
	     result.addWork(foramatItem);
	     result.addWork(wList);
	   }
	   catch (NullPointerException e){
		  result = new EmptyAnalects();
	   }
	   return result; 
   }
}
