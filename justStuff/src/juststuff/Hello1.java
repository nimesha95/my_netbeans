/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package juststuff;

import java.applet.Applet;
import java.awt.*;
public class Hello1 extends Applet
{ public void paint (Graphics frame)
    {  
		//  set up some constants
	    final int MID = 150;	// middle of the snowman
	    final int TOP = 50;		// top of the snowman

		//  need to set the background colors
	    setBackground (Color.cyan);

		// color the ground
	    frame.setColor (Color.blue);
		// the ground is a blue rectangle
	    frame.fillRect (1, 175, 300, 50) ; 
            
            frame.setColor(Color.red);
            frame.fillRoundRect(15,25, 50, 50, 50, 50);
		// Can you color in a sun????

		//  draw three large snowballs to make up snowman
	    frame.setColor (Color.white);

			// draw head
	    frame.fillOval (MID - 20, TOP, 40, 40);
			// draw middle (upper torso)
	    frame.fillOval (MID - 35, TOP + 35, 70, 50);
			// draw base (lower torso)
	    frame.fillOval (MID - 50, TOP + 80, 100, 60);
	    
		//  draw in features of snowman
	    frame.setColor (Color.black);

		   //  draw eyes
			// draw left eye
	    frame.fillOval (MID - 10, TOP + 10, 5, 5);
			// draw right eye
	    frame.fillOval (MID + 5, TOP + 10, 5, 5);

			// draw mouth
	    frame.drawArc (MID - 10, TOP + 20, 20, 10, 190, 160);

		   //  draw arms
			// draw left arm
	    frame.drawLine (MID - 25, TOP + 60, MID - 50, TOP + 40);
			// draw right arm
	    frame.drawLine (MID + 25, TOP + 60, MID + 55, TOP + 60);

		   //  draw hat
			// draw brim of hat
	    frame.drawLine (MID - 20, TOP + 5, MID + 20, TOP + 5);
			// draw top of hat
	    frame.fillRect (MID - 15, TOP - 20, 30, 25);
    }
}    // End class SnowMan


