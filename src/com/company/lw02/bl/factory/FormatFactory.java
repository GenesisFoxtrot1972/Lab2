package com.company.lw02.bl.factory;

import com.company.lw02.consts.*;
import com.company.lw02.entity.analects.*;

/**
 * Created by Pyzhic Valeriy on 8/04/2014;
 */
public class FormatFactory {
	  
	   
	   public  FormatFactory(){ 
	   }
	   
	   /**
		 * <p> Factory method</p>
		 * @param FormatType type of requested object 
		 * @return Format requested object
		 */
	   public Format getObj(FormatType type){
		   Format result = null;
		   switch (type){
		       case Book:
		    	   result = new BookFormat(); 
		    	   break;
		       case Magazine:
		    	   result = new MagazineFormat();
		   }    
		   return result;
			
	   }
}
