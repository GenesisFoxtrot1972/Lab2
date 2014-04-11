package com.company.lw02.controller;

import com.company.lw02.view.*; 
import com.company.lw02.bl.builder.*;
import com.company.lw02.to.*;
import com.company.lw02.entity.analects.*;

/**
 * Created by Pyzhic Valeriy on 8/04/2014;
 */
public class Controller {
   private View view;
   
   public void setView(View view)
   { 
	   this.view = view; 
   }
   
   public void run(){
	   Builder buileder = new Builder(); 
	   int command=1;
	   while (command==1){
		  ItemsTO t = view.getUserInput();
		  command = t.command;
          Analects a = buileder.build(t);
		  t = view.getUserInput();   
		  view.showAnalects(a);
	   }
   }
}
