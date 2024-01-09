import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;

import javax.swing.*;

 class Objects extends JButton implements MouseListener, MouseMotionListener {
	 
	 panel FatherPanel;
	 ImageIcon image1;
	 int num;
	 int turned = 0;
	
	     String TopColor;
	     String TopPart;
		String BottomColor;
		String BottomPart;
		String RightColor;
		String RightPart;
		String LeftColor;
		String LeftPart;
		
		
	    String Path;
	    
	    public Objects() {
	        
	    	this.setVisible(true);
	    	this.setSize(50,50);
	    	this.setText("Start Game");
//	    	this.setBackground(Color.green);
	    }
public Objects(String path, String topColor, String topPart, String bottomColor, String bottomPart, String rightColor, String rightPart, String leftColor, String leftPart, int n){
	super();
	this.num = n;
	image1 = new ImageIcon(path);
	image1.setImage(image1.getImage().getScaledInstance(250,250,Image.SCALE_DEFAULT));
	 Path = path;
	 TopColor = topColor;
	 TopPart = topPart;
	 BottomColor = bottomColor;
	 BottomPart = bottomPart;
	 RightColor = rightColor;
	 RightPart = rightPart;
	 LeftColor = leftColor;
	 LeftPart = leftPart;

	this.setBorder(BorderFactory.createLineBorder(Color.gray));
	this.setSize(250,250);
	this.setIcon(image1);
	this.addMouseListener(this);
	this.addMouseMotionListener(this);
}
@Override
public void mouseClicked(MouseEvent e) {
	// TODO Auto-generated method stub
	if(e.getSource().getClass() == this.getClass()) {
	this.setBackground(Color.black);
	
	
	}
}
@Override
public void mousePressed(MouseEvent e) {
	// TODO Auto-generated method stub
	
}
@Override
public void mouseReleased(MouseEvent e) {
	// TODO Auto-generated method stub
	
}
@Override
public void mouseEntered(MouseEvent e) {
	// TODO Auto-generated method stub
	
}
@Override
public void mouseExited(MouseEvent e) {
	// TODO Auto-generated method stub
}
@Override
public void mouseDragged(MouseEvent e) {
	// TODO Auto-generated method stub
	
}
@Override
public void mouseMoved(MouseEvent e) {
	// TODO Auto-generated method stub
	
}
 }