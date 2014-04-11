package com.company.lw02.bl.factory;

import com.company.lw02.consts.*;
import com.company.lw02.entity.analects.*;

/**
 * Created by Pyzhic Valeriy on 8/04/2014;
 */
public class WorkFactory {

   public WorkFactory(){ 
   }
   
   /**
	 * <p> Factory method</p>
	 * @param WorkType type of requested object 
	 * @return LiteraryWork requested object
	 */
   public LiteraryWork getObj(WorkType type){
	   LiteraryWork result = null;
	   switch (type){
	       case Story:
	    	   result = new Story(); 
	    	   break;
	       case Poem:
	    	   result = new Poem();
	   }    
	   return result;
		
   }
}
