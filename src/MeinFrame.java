import java.awt.*;
import java.awt.event.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.*;

public class MeinFrame extends JFrame implements MouseListener, MouseMotionListener, WindowListener
{
Objects selectedbutton;
Image image1;
Boolean select = false;
panel temppanel;
ImageIcon image;
	int x,y;
	Objects button1 = new Objects("3.png", "white", "back", "black", "front", "gray", "front", "gray", "back", 1);
	   Objects button2 = new Objects("5.png", "gray", "back", "black", "front", "black", "back", "white", "front", 2);
	  Objects button3= new Objects("2.png", "black", "back", "brown", "front", "gray", "front", "white", "back", 3);
	   Objects button4= new Objects("1.png", "brown", "back", "gray", "front", "white", "front", "black", "back", 4);
	   Objects button5= new Objects("10.png", "gray", "back", "brown", "front", "black", "back", "white", "front", 5);
	   Objects button6= new Objects("11.png", "gray", "back", "brown", "front", "white", "back", "black", "front", 6);
	   Objects button7= new Objects("9.png", "black", "back", "brown", "front", "white", "back", "gray", "front", 7);
	   Objects button8= new Objects("7.png", "black", "back", "gray", "front", "brown", "back", "white", "front", 8);
	   Objects button9= new Objects("6.png", "brown", "back", "gray", "front", "white", "back", "black", "front", 9);
	   Objects buttonh1 = new Objects("h3.png", "white", "back", "black", "front", "gray", "front", "gray", "back", 1);
	   Objects buttonh2 = new Objects("h5.png", "gray", "back", "black", "front", "black", "back", "white", "front", 2);
	  Objects buttonh3= new Objects("h2.png", "black", "back", "brown", "front", "gray", "front", "white", "back", 3);
	   Objects buttonh4= new Objects("h1.png", "brown", "back", "gray", "front", "white", "front", "black", "back", 4);
	   Objects buttonh5= new Objects("h10.png", "gray", "back", "brown", "front", "black", "back", "white", "front", 5);
	   Objects buttonh6= new Objects("h11.png", "gray", "back", "brown", "front", "white", "back", "black", "front", 6);
	   Objects buttonh7= new Objects("h9.png", "black", "back", "brown", "front", "white", "back", "gray", "front", 7);
	   Objects buttonh8= new Objects("h7.png", "black", "back", "gray", "front", "brown", "back", "white", "front", 8);
	   Objects buttonh9= new Objects("h6.png", "brown", "back", "gray", "front", "white", "back", "black", "front", 9);
	  
	   Objects button01 = new Objects();
	   Objects button02 = new Objects();
	   panel panel1;
	   panel panel2;
	   panel panel3;
	   panel panel4;
	   panel panel5;
	   panel panel6;
	   panel panel7;
	   panel panel8;
	   panel panel9;
	   
	   
	   public MeinFrame(String title, int num) {
		   super(title);
		   this.setSize(500,500);
		   this.setLocationRelativeTo(null);
		   this.setVisible(true);
		   this.setLayout(new GridLayout(2,2));
		  this.setResizable(false);
		  
		 ImageIcon imagesheep = new ImageIcon("schaaf.jfif");
		 imagesheep.setImage(imagesheep.getImage().getScaledInstance(250,250,Image.SCALE_DEFAULT));
		 ImageIcon imagedog = new ImageIcon("dogsmile.png");
		 imagedog.setImage(imagedog.getImage().getScaledInstance(250,250,Image.SCALE_DEFAULT));
		 
		  this.add(button01);
		  this.add(button02);
		  
		  button01.setIcon(imagesheep);
		  button02.setIcon(imagedog);
		  
		  
		  JLabel label01 = new JLabel();
		  JLabel label02 = new JLabel();
		  
		  
		  this.add(label01);
		  this.add(label02);
		  
		  label01.setText("<html><body>Click on the Sheep to start <br>Crazy Sheep Game</body></html>");
		  label02.setText("<html><body>Click on the Dog to start <br>Crazy Dog Game</body></html>");
		  
		  
		  label01.setOpaque(true);
		  label02.setOpaque(true);
		  
		  label02.setBackground(Color.DARK_GRAY);
		  label02.setForeground(Color.white);
		 
		  label01.setBackground(Color.LIGHT_GRAY);
		  label01.setForeground(Color.white);
		  
		  

	
		  button01.addMouseListener(this);
		   button01.addMouseMotionListener(this);
		   button02.addMouseListener(this);
		   button02.addMouseMotionListener(this);
		  
		 
		   
	   }
	   public MeinFrame() {
		   
		   super("Finished");
		   this.setSize(400,400);
		   this.setLocationRelativeTo(null);
		   this.setVisible(true);
			ImageIcon finishedicon = new ImageIcon("finished.jfif");
			
			
			
			JLabel picLabel = new JLabel();
			
			picLabel.setIcon(finishedicon);
			this.add(picLabel);
		 
	   }
	   
  public MeinFrame(int x)
  {
	 if(x == 1 ) {
		 this.setTitle("Crazy Sheep Game");
	 }
	 else{
		 this.setTitle("Crazy Dog Game");
		 button1 = buttonh1;
		 button2 = buttonh2;
		 button3 = buttonh3;
		 button4 = buttonh4;
		 button5 = buttonh5;
		 button6 = buttonh6;
		 button7 = buttonh7;
		 button8 = buttonh8;
		 button9 = buttonh9;
	 }
	  
	this.setSize(750,750);
	this.setLocationRelativeTo(null);
	this.setVisible(true);
	this.setResizable(false);
	GridLayout mylayout = new GridLayout(3,3);
	this.setLayout(mylayout);
		   
   addWindowListener(this);
  
    panel1 = new panel(1);
   this.add(panel1);
   panel2 = new panel(2);
   this.add(panel2);
   panel3 = new panel(3);
   this.add(panel3);
    panel4 = new panel(4);
   this.add(panel4);
   panel5 = new panel(5);
   this.add(panel5);
    panel6 = new panel(6);
   this.add(panel6);
   panel7 = new panel(7);
   this.add(panel7);
   panel8 =new panel(8);
   this.add(panel8);
   panel9 = new panel(9);
   this.add(panel9);

   
   button1.addMouseListener(this);
   button1.addMouseMotionListener(this);
   button2.addMouseListener(this);
   button2.addMouseMotionListener(this);
   button3.addMouseListener(this);
   button3.addMouseMotionListener(this);
   button4.addMouseListener(this);
   button4.addMouseMotionListener(this);
   button5.addMouseListener(this);
   button5.addMouseMotionListener(this);
   button6.addMouseListener(this);
   button6.addMouseMotionListener(this);
   button7.addMouseListener(this);
   button7.addMouseMotionListener(this);
   button8.addMouseListener(this);
   button8.addMouseMotionListener(this);
   button9.addMouseListener(this);
   button9.addMouseMotionListener(this);
   

   panel1.add(button1);
   button1.FatherPanel = panel1;
   panel1.SonButton = button1;
   
   panel2.add(button2);
   button2.FatherPanel = panel2;
   panel2.SonButton = button2;
   
   panel3.add(button3);
   button3.FatherPanel = panel3;
   panel3.SonButton = button3;
   
   panel4.add(button4);
   button4.FatherPanel = panel4;
   panel4.SonButton = button4;
   
   panel5.add(button5);
   button5.FatherPanel = panel5;
   panel5.SonButton = button5;
   
   panel6.add(button6);
   button6.FatherPanel = panel6;
   panel6.SonButton = button6;
   
   panel7.add(button7);
   button7.FatherPanel = panel7;
   panel7.SonButton = button7;
   
   panel8.add(button8);
   button8.FatherPanel = panel8;
   panel8.SonButton = button8;
   
   panel9.add(button9);
   button9.FatherPanel = panel9;
   panel9.SonButton = button9;
   
 
   
}
  
  
	  public static BufferedImage rotateImage(BufferedImage imagetorotate) {
		  int widthOfImage = imagetorotate.getWidth();
	        int heightOfImage = imagetorotate.getHeight();
	        int typeOfImage = imagetorotate.getType();
	        
	        BufferedImage newImageFromBuffer = new BufferedImage(widthOfImage, heightOfImage, typeOfImage);

	        Graphics2D graphics2D = newImageFromBuffer.createGraphics();

	        graphics2D.rotate(Math.toRadians(90), widthOfImage / 2, heightOfImage / 2);
	        graphics2D.drawImage(imagetorotate, null, 0, 0);
 
	        return newImageFromBuffer;	
	  }
	  
	  
	  public void turn(Objects O) {
		  try {

	            BufferedImage originalImage = ImageIO.read(new File(O.Path));
O.turned +=1;

if(O.turned == 4)
{
	O.turned = 0;
}
	            BufferedImage subImage = rotateImage(originalImage);

	            File rotatedImageFile = new File(O.Path);

	            ImageIO.write(subImage, "png", rotatedImageFile);
	           
	           
	        	
	            O.setIcon(new ImageIcon(subImage));
	            
	 
	           
	        } catch (IOException h) {
	            h.printStackTrace();
	         
	        }
		  
		  //Objekt Variablen werden verändert
		  String tempColor;
		  String tempColor2;
		  String tempPart;
		  String tempPart2;
		  
		  //TOP
		  tempColor = O.TopColor;
		  tempPart = O.TopPart;
		  O.TopColor = O.LeftColor;
		  O.TopPart = O.LeftPart;
		  
		  //RIGHT
		  tempColor2 = O.RightColor;
		  tempPart2 = O.RightPart;
		  O.RightColor = tempColor;
		  O.RightPart = tempPart;
		  
		  //Bottom
		  tempColor = O.BottomColor;
		  tempPart = O.BottomPart;
		  O.BottomColor = tempColor2;
		  O.BottomPart = tempPart2;
		  
		  //LEFT
		  O.LeftColor = tempColor;
		  O.LeftPart = tempPart;
		  
		  
		  
		  
		  
		  CheckSolution();
	  }


	@Override
	public void mouseDragged(MouseEvent e) {
		
	}

	@Override
	public void mouseMoved(MouseEvent e) {
		
	}

	@Override
	public void mouseClicked(MouseEvent e) {
		// TODO Auto-generated method stub
	if(e.getSource() == button01) {
		this.dispose();
		MeinFrame frame = new MeinFrame(1);
		
	}
	else if(e.getSource() == button02) {
		this.dispose();
		MeinFrame frame = new MeinFrame(2);
	}
	else {
		if(select == false) {
		 if(e.getSource() == button1) {
			 selectedbutton = button1;
//			 button1.setBorder(BorderFactory.createLoweredBevelBorder());
		 }
		 else if(e.getSource() == button2) {
			 selectedbutton = button2;
//			 button2.setBorder(BorderFactory.createLineBorder(Color.red));
		 }
		 else if(e.getSource() == button3) {
			 selectedbutton = button3;			 
//			 button3.setBorder(BorderFactory.createLineBorder(Color.red));
		 }
		 else  if(e.getSource() == button4) {
			 selectedbutton = button4;
//			 button4.setBorder(BorderFactory.createLineBorder(Color.red));
		 }
		 else if(e.getSource() == button5) {
			 selectedbutton = button5;
//			 button5.setBorder(BorderFactory.createLineBorder(Color.red));
		 }
		 else  if(e.getSource() == button6) {
			 selectedbutton = button6;
//			 button6.setBorder(BorderFactory.createLineBorder(Color.red));
		 }
		 else  if(e.getSource() == button7) {
			 selectedbutton = button7;			
//			 button7.setBorder(BorderFactory.createLineBorder(Color.red));
		 }
		 else if(e.getSource() == button8) {
			 selectedbutton = button8;
//			 button8.setBorder(BorderFactory.createLineBorder(Color.red));
		 }
		 else if(e.getSource() == button9) {
			 selectedbutton = button9;
//			 button9.setBorder(BorderFactory.createLineBorder(Color.red));
		 }
		 selectedbutton.setBorder(BorderFactory.createEmptyBorder(10,0,0,0));
			select = true;
		}
		else {
			
			if(e.getSource() == selectedbutton) {
				selectedbutton.FatherPanel.remove(selectedbutton);
				turn(selectedbutton);
				selectedbutton.FatherPanel.add(selectedbutton);
				selectedbutton.FatherPanel.repaint();
				selectedbutton.FatherPanel.revalidate();
			}
			else if(e.getSource() != selectedbutton && e.getSource() == button1) {
				button1.FatherPanel.remove(button1);
				button1.FatherPanel.add(selectedbutton);
				selectedbutton.FatherPanel.remove(selectedbutton);
				selectedbutton.FatherPanel.add(button1);
				temppanel = selectedbutton.FatherPanel;
				selectedbutton.FatherPanel = button1.FatherPanel;
				button1.FatherPanel = temppanel;
				selectedbutton.FatherPanel.SonButton = selectedbutton;
				button1.FatherPanel.SonButton = button1;
				temppanel = null;
		
			}
			else if(e.getSource() != selectedbutton && e.getSource() == button2) {
				button2.FatherPanel.remove(button2);
				button2.FatherPanel.add(selectedbutton);
				selectedbutton.FatherPanel.remove(selectedbutton);
				selectedbutton.FatherPanel.add(button2);
				temppanel = selectedbutton.FatherPanel;
				selectedbutton.FatherPanel = button2.FatherPanel;
				button2.FatherPanel = temppanel;
				selectedbutton.FatherPanel.SonButton = selectedbutton;
				button2.FatherPanel.SonButton = button2;
				temppanel = null;
				
			}
			else if(e.getSource() != selectedbutton && e.getSource() == button3) {
				button3.FatherPanel.remove(button3);
				button3.FatherPanel.add(selectedbutton);
				selectedbutton.FatherPanel.remove(selectedbutton);
				selectedbutton.FatherPanel.add(button3);
				temppanel = selectedbutton.FatherPanel;
				selectedbutton.FatherPanel = button3.FatherPanel;
				button3.FatherPanel = temppanel;
				selectedbutton.FatherPanel.SonButton = selectedbutton;
				button3.FatherPanel.SonButton = button3;
				temppanel = null;
			
			}
			else if(e.getSource() != selectedbutton && e.getSource() == button4) {
				button4.FatherPanel.remove(button4);
				button4.FatherPanel.add(selectedbutton);
				selectedbutton.FatherPanel.remove(selectedbutton);
				selectedbutton.FatherPanel.add(button4);
				temppanel = selectedbutton.FatherPanel;
				selectedbutton.FatherPanel = button4.FatherPanel;
				button4.FatherPanel = temppanel;
				selectedbutton.FatherPanel.SonButton = selectedbutton;
				button4.FatherPanel.SonButton = button4;
				temppanel = null;
				
			}
			else if(e.getSource() != selectedbutton && e.getSource() == button5) {
				button5.FatherPanel.remove(button5);
				button5.FatherPanel.add(selectedbutton);
				selectedbutton.FatherPanel.remove(selectedbutton);
				selectedbutton.FatherPanel.add(button5);
				temppanel = selectedbutton.FatherPanel;
				selectedbutton.FatherPanel = button5.FatherPanel;
				button5.FatherPanel = temppanel;
				selectedbutton.FatherPanel.SonButton = selectedbutton;
				button5.FatherPanel.SonButton = button5;
				temppanel = null;
				
			}
			else if(e.getSource() != selectedbutton && e.getSource() == button6) {
				button6.FatherPanel.remove(button6);
				button6.FatherPanel.add(selectedbutton);
				selectedbutton.FatherPanel.remove(selectedbutton);
				selectedbutton.FatherPanel.add(button6);
				temppanel = selectedbutton.FatherPanel;
				selectedbutton.FatherPanel = button6.FatherPanel;
				button6.FatherPanel = temppanel;
				selectedbutton.FatherPanel.SonButton = selectedbutton;
				button6.FatherPanel.SonButton = button6;
				temppanel = null;
				
			}
			else if(e.getSource() != selectedbutton && e.getSource() == button7) {
				button7.FatherPanel.remove(button7);
				button7.FatherPanel.add(selectedbutton);
				selectedbutton.FatherPanel.remove(selectedbutton);
				selectedbutton.FatherPanel.add(button7);
				temppanel = selectedbutton.FatherPanel;
				selectedbutton.FatherPanel = button7.FatherPanel;
				button7.FatherPanel = temppanel;
				selectedbutton.FatherPanel.SonButton = selectedbutton;
				button7.FatherPanel.SonButton = button7;
				temppanel = null;
				
			}
			else if(e.getSource() != selectedbutton && e.getSource() == button8) {
				button8.FatherPanel.remove(button8);
				button8.FatherPanel.add(selectedbutton);
				selectedbutton.FatherPanel.remove(selectedbutton);
				selectedbutton.FatherPanel.add(button8);
				temppanel = selectedbutton.FatherPanel;
				selectedbutton.FatherPanel = button8.FatherPanel;
				button8.FatherPanel = temppanel;
				selectedbutton.FatherPanel.SonButton = selectedbutton;
				button8.FatherPanel.SonButton = button8;
				temppanel = null;
				
			}
			else if(e.getSource() != selectedbutton && e.getSource() == button9) {
				button9.FatherPanel.remove(button9);
				button9.FatherPanel.add(selectedbutton);
				selectedbutton.FatherPanel.remove(selectedbutton);
				selectedbutton.FatherPanel.add(button9);
				temppanel = selectedbutton.FatherPanel;
				selectedbutton.FatherPanel = button9.FatherPanel;
				button9.FatherPanel = temppanel;
				selectedbutton.FatherPanel.SonButton = selectedbutton;
				button9.FatherPanel.SonButton = button9;
				temppanel = null;
				
			}
			
			select = false;
			selectedbutton.setBorder(null);
			
			}
	CheckSolution();
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
		
	}

	@Override
	public void mouseExited(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}
	public void turnback(Objects object)
	{
		while(object.turned!= 0)
		{
			turn(object);
			
		}
	}


public void CheckSolution() {
	
System.out.println(panel1.SonButton.BottomColor);
	if(panel1.SonButton.RightColor == panel2.SonButton.LeftColor && panel1.SonButton.RightPart != panel2.SonButton.LeftPart && panel1.SonButton.BottomColor == panel4.SonButton.TopColor && panel1.SonButton.BottomPart != panel4.SonButton.TopPart && panel2.SonButton.RightColor == panel3.SonButton.LeftColor && panel2.SonButton.RightPart != panel3.SonButton.LeftPart && panel2.SonButton.BottomColor == panel5.SonButton.TopColor && panel2.SonButton.BottomPart != panel5.SonButton.TopPart&& panel3.SonButton.BottomColor == panel6.SonButton.TopColor && panel3.SonButton.BottomPart != panel6.SonButton.TopPart && panel4.SonButton.RightColor == panel5.SonButton.LeftColor && panel4.SonButton.RightPart != panel5.SonButton.LeftPart && panel4.SonButton.BottomColor == panel7.SonButton.TopColor && panel4.SonButton.BottomPart != panel7.SonButton.TopPart && panel5.SonButton.RightColor == panel6.SonButton.LeftColor && panel5.SonButton.RightPart != panel6.SonButton.LeftPart && panel5.SonButton.BottomColor == panel8.SonButton.TopColor && panel5.SonButton.BottomPart != panel8.SonButton.TopPart && panel6.SonButton.BottomColor == panel9.SonButton.TopColor && panel6.SonButton.BottomPart != panel9.SonButton.TopPart && panel7.SonButton.RightColor == panel8.SonButton.LeftColor && panel7.SonButton.RightPart != panel8.SonButton.LeftPart && panel8.SonButton.RightColor == panel9.SonButton.LeftColor && panel8.SonButton.RightPart != panel9.SonButton.LeftPart) 
		{
		this.dispose();
        MeinFrame Finished = new MeinFrame();
	}
	
}

	@Override
	public void windowOpened(WindowEvent e) {
		// TODO Auto-generated method stub
		
	}


	@Override
	public void windowClosing(WindowEvent e) {
		// TODO Auto-generated method stub
		  turnback(button1);
		  turnback(button2);
		  turnback(button3);
		  turnback(button4);
		  turnback(button5);
		  turnback(button6);
		  turnback(button7);
		  turnback(button8);
		  turnback(button9);
		System.exit(0);
	}


	@Override
	public void windowClosed(WindowEvent e) {
		// TODO Auto-generated method stub
		
		  
	}


	@Override
	public void windowIconified(WindowEvent e) {
		// TODO Auto-generated method stub
		
	}


	@Override
	public void windowDeiconified(WindowEvent e) {
		// TODO Auto-generated method stub
		
	}


	@Override
	public void windowActivated(WindowEvent e) {
		// TODO Auto-generated method stub
		
	}


	@Override
	public void windowDeactivated(WindowEvent e) {
		// TODO Auto-generated method stub
		
	}

}

 
	

	