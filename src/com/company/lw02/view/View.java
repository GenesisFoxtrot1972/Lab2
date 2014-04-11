package com.company.lw02.view;

import java.util.Random;
import com.company.lw02.consts.*;
import com.company.lw02.to.*;
import com.company.lw02.entity.analects.*;

/**
 * Created by Pyzhic Valeriy on 8/04/2014;
 */
public class View {
	
	private Random rand = new Random();
	
	/**
	 * Imitate user input
	 * @return ImputTO requested object
	 */
    public ItemsTO getUserInput()
    {
    	ItemsTO items = new ItemsTO();
    	FormatTO format = new FormatTO();
    	format.type = FormatType.values()[rand.nextInt(2)];
    	format.title = "Some Title";
    	if (format.type == FormatType.Book){
    		format.cover = Cover.values()[rand.nextInt(2)];	
    		format.illust = Illustration.values()[rand.nextInt(3)];
    	}
    	else{
    		format.sheet = SheetType.values()[rand.nextInt(2)];	
    	}
    	
    	items.setWorksListTitle("Some title");
    	for (int i=0; i<rand.nextInt(3)+2; i++){
    		items.addWork(this.getWork());
    	}
    	items.setFormat(format); 
    	items.command = rand.nextInt(2);
    	return items;
    }
    
    public WorkTO getWork(){
    	WorkTO work = new WorkTO();
    	work.type = WorkType.values()[rand.nextInt(2)];
    	work.title ="Some title";
    	work.author = "Some author";
    	if (work.type == WorkType.Poem){
    		work.size = VerseSize.values()[rand.nextInt(6)];
    	}
    	else{
    		work.genre = Genre.values()[rand.nextInt(6)];
    	}
    	return work;
    }
    
    public void showAnalects(Analects a){
       System.out.println(a);    	
    }
}

