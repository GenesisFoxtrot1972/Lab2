package com.company.lw02.entry;

import com.company.lw02.controller.*;
import com.company.lw02.view.*;

/**
 * Created by Pyzhic Valeriy on 8/04/2014;
 */
public class Entry {
   public static void main(String args[]){
	   Controller cont = new Controller(); 
	   View view = new View();
	   cont.setView(view);
	   cont.run();
   }   
}
