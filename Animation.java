package graphics;

import java.awt.*;
import javax.swing.*;

public class Animation extends Canvas {
	
	int x=100,y=20,wid=80,ht=80;
	int stepsize = 10;
	int maxx,maxy;
	
	Animation(int w,int h)
	{
		this.maxx=w;
		this.maxy=h;
		setBackground(Color.white);
	}
public void paint(Graphics g) {
	
	//

	//sun
	g.setColor(Color.orange);
	g.fillOval(x,y,wid,ht);
	//g.fillOval(100,20,80,80);
	//g.fillArc(100,20,80,80,0,360);
	if(x+wid>maxx)
		stepsize=-stepsize;
	else
		if(x+wid>maxx || x<0)
			stepsize=-stepsize;
	x=x+stepsize;
	
	if(x==200) {
		{
		int a[]= {550,560,560,570};//All triangle corner x coordinate
		int b[]= {20,10,15,20};
		g.fillPolygon(a, b,4);
		 try {
				Thread.sleep(180);
			} catch (InterruptedException e) {
			       System.out.println(e);
			}
		 
		}
		/*{    
			g.setColor(Color.blue);
			g.fillRect(0,0,600,330);
			 try {
					Thread.sleep(180);
				} catch (InterruptedException e) {
				       System.out.println(e);
				}
			
		}*/
	}
	if(x==400) {
		{
		int a[]= {350,360,360,370};//All corner x coordinate
		int b[]= {80,70,75,80};
		g.fillPolygon(a, b,4);
		 try {
				Thread.sleep(180);
			} catch (InterruptedException e) {
			       System.out.println(e);
			}
	
		}
	}
	
	//house
	g.setColor(Color.red);
	g.fillRect(130,200,200,130); 
	//door
	g.setColor(Color.yellow);
	g.fillRect(210,250,40,80);
	//roof
	g.setColor(Color.blue);
	int x[]= {130,330,230};//All triangle corner x coordinate
	int y[]= {200,200,100};
	g.fillPolygon(x, y,3);
	//line
	g.setColor(Color.green);
    g.drawLine(5,330,600,330);//(x1,y1,,x2,y2)
    
	   try {
		Thread.sleep(180);
	} catch (InterruptedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
   
    repaint();
}
public static void main(String[] args) {  
    Animation a=new Animation(600,400);  
    JFrame f=new JFrame();  
    f.add(a);  
    f.setSize(600,400);  
    //f.setLayout(null);  
    f.setVisible(true);  
}  

}
