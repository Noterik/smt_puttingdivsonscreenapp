/* 
* PuttingdivsonscreenApplication.java
* 
* Copyright (c) 2012 Noterik B.V.
* 
* This file is part of Lou, related to the Noterik Springfield project.
* It was created as a example of how to use the multiscreen toolkit
*
* Putting divs on screen app is free software: you can redistribute it and/or modify
* it under the terms of the GNU General Public License as published by
* the Free Software Foundation, either version 3 of the License, or
* (at your option) any later version.
*
*  Putting divs on screen  is distributed in the hope that it will be useful,
* but WITHOUT ANY WARRANTY; without even the implied warranty of
* MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
* GNU General Public License for more details.
*
* You should have received a copy of the GNU General Public License
* along with Putting divs on screen .  If not, see <http://www.gnu.org/licenses/>.
*/
package org.springfield.lou.application.types;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;

import org.springfield.lou.application.*;
import org.springfield.lou.screen.*;

public class PuttingdivsonscreenApplication extends Html5Application{
	
	private ArrayList<String> colors = new ArrayList<String>( Arrays.asList("maroon", "red", "orange","yellow","olive","purple","fuchsia","lime","green","navy","blue","aqua","teal","silver","gray"));
	private Random rnd;
	
 	public PuttingdivsonscreenApplication(String id) {
		super(id); 
	}
	
    public void onNewScreen(Screen s) {
    	// We set some HTML content on the screen in a div with ID "hello"
    	s.setContent("hello", "<div style=\" border: 1px solid #000; width: 200px; height: 50px;\" id=\"divinput\">");
    	
    	//We set some value in divinput
    	s.setContent("divinput", "Hello i'm div");

    	rnd = new Random();
		String selectedcolor = colors.get(rnd.nextInt(colors.size()));
		
		// We set a style of an element with ID "divinput"
		s.setDiv("divinput","style:background-color: "+selectedcolor);
    }
}
