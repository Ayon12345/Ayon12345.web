package mypackage;

import javax.swing.*; 
import java.awt.*;
import java.awt.event.*;	



public class MyClass extends JFrame implements ActionListener
{
	JLabel heading;
	JPanel mainPanel;
	Font font=new Font("",Font.BOLD,30);
	JButton []btns=new JButton[9];
	int gamechances[]={2,2,2,2,2,2,2,2,2};
	int activePlayer=0;
	
	    int a[]= {0,1,2};
		int b[]= {3,4,5};
		int c[]= {6,7,8};
		int d[]= {0,3,6};
		int k[]= {1,4,7};
		int f[]= {2,5,8};
		int g[]= {0,4,8};
	    int h[]= {2,4,6};
		
		int winner=2;
     	
	
	
	 public MyClass()
	 {	 
	
    setTitle("Tic Tac Toe Game");
	setSize(750,750);  
    setLayout(null);
	createGUI();
    setVisible(true);
	setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	 }
	 
	 private void createGUI(){
		 
		 ////adding JLabel

		 this.getContentPane().setBackground(Color.decode("#444444"));
		 this.setLayout(new BorderLayout()); //this for calling JFrame
		 
         heading=new JLabel("TicTacToe");
		 heading.setFont(font);
		 heading.setForeground(Color.red); 	 //red clr on heading
		 heading.setIcon(new ImageIcon("t.png"));
		 heading.setHorizontalAlignment(JLabel.CENTER);
		 heading.setVerticalTextPosition(JLabel.CENTER);
		 
		 	this.add (heading, BorderLayout.NORTH);
		
		 //////adding JPanel
		 
              mainPanel=new JPanel();
		 mainPanel.setLayout(new GridLayout(3, 3));
		 
		 for (int i=1;i<=9;i++){
			 JButton btn=new JButton();
			 btn.setFont(font);
			 btn.setBackground(Color.red); //button backgrnd clr to red
			 btn.setForeground(Color.black);  //button txt clr to red
			 btns[i-1]=btn;
			 btn.addActionListener(this);// actionPerformed will run
			 btn.setName((i-1)+""); //button name 
			 mainPanel.add(btn);}
		
		  this.add(mainPanel,BorderLayout.CENTER);
		  //this.add(label); 
}

		 public void actionPerformed(ActionEvent e){
			 
			 System.out.println("Clicked");
			 JButton selectedbutton=(JButton)e.getSource();
			 
			 String findname=selectedbutton.getName();
			 System.out.println(findname);
			 int name=Integer.parseInt(findname);//converting string name to int
			 
			 if(gamechances[name]==2){
				 if(activePlayer==1){
					 selectedbutton.setIcon(new ImageIcon("3.png"));
					 gamechances[name]=activePlayer; //cannot change if done once
					 activePlayer=0;
				 }
				  else{
				 selectedbutton.setIcon(new ImageIcon("0.png"));
				 gamechances[name]=activePlayer;
				 activePlayer=1;
			                     }
	                     ///////////winner//////// 			
    
	       /////////a///////////
	if(gamechances[a[0]]==gamechances[a[1]]&&(gamechances[a[1]]==gamechances[a[2]])&&gamechances[a[2]]!=2)
	        {   
            
			winner=gamechances[a[0]];
			JOptionPane.showMessageDialog(this,"player " +winner+ " won the game");
			
			int i = JOptionPane.showConfirmDialog(this,"Play Again");
			if(i==0){
				this.setVisible(false);
				new MyClass();
				JOptionPane.showMessageDialog(this,"Welcome Back *_*");
			}
			else if(i==1){
				System.exit(2333);
			}
			else{
				
			}
		  		System.out.println(i);
			}
			
			
			///////////////b////////
if(gamechances[b[0]]==gamechances[b[1]]&&(gamechances[b[1]]==gamechances[b[2]])&&gamechances[b[2]]!=2)
	        {   
            
			
			winner=gamechances[b[0]];
			JOptionPane.showMessageDialog(this,"player " +winner+ " won the game");
			
			int i = JOptionPane.showConfirmDialog(this,"Play Again");
			if(i==0){
				this.setVisible(false);
				new MyClass();
				JOptionPane.showMessageDialog(this,"Welcome Back *_*");
			}
			else if(i==1){
				System.exit(2333);
			}
			else{
				
			}
		  		
		  		System.out.println(i);
			}
			
			
		//////////////c//////////
			
if(gamechances[c[0]]==gamechances[c[1]]&&(gamechances[c[1]]==gamechances[c[2]])&&gamechances[c[2]]!=2)
	        {   
            
			
			winner=gamechances[c[0]];
			JOptionPane.showMessageDialog(this,"player " +winner+ " won the game");
			int i = JOptionPane.showConfirmDialog(this,"Play Again");
			if(i==0){
				this.setVisible(false);
				new MyClass();
				JOptionPane.showMessageDialog(this,"Welcome Back *_*");
			}
			else if(i==1){
				System.exit(2333);
			}
			else{
				
			}
		  		System.out.println(i);
			}
			
			
			
			///////////////////d////////////
			
if(gamechances[d[0]]==gamechances[d[1]]&&(gamechances[d[1]]==gamechances[d[2]])&&gamechances[d[2]]!=2)
	        {   
            
			
			winner=gamechances[d[0]];
			JOptionPane.showMessageDialog(this,"player " +winner+ " won the game");
			int i = JOptionPane.showConfirmDialog(this,"Play Again");
			if(i==0){
				this.setVisible(false);
				new MyClass();
				JOptionPane.showMessageDialog(this,"Welcome Back *_*");
			}
			else if(i==1){
				System.exit(2333);
			}
			else{
				
			}
		  		System.out.println(i);
			}
			
			
			/////////////////////////k///////////////////
			
		if(gamechances[k[0]]==gamechances[k[1]]&&(gamechances[k[1]]==gamechances[k[2]])&&gamechances[k[2]]!=2)
	        {   
            
			
			winner=gamechances[k[1]];
			JOptionPane.showMessageDialog(this,"player " +winner+ " won the game");
			int i = JOptionPane.showConfirmDialog(this,"Play Again");
			if(i==0){
				this.setVisible(false);
				new MyClass();
				JOptionPane.showMessageDialog(this,"Welcome Back *_*");
			}
			else if(i==1){
				System.exit(2333);
			}
			else{
				
			}
		  		System.out.println(i);
			}	
			
			
			//////////////////f////////////////////
			
	if(gamechances[f[0]]==gamechances[f[1]]&&(gamechances[f[1]]==gamechances[f[2]])&&gamechances[f[2]]!=2)
	        {   
            
			
			winner=gamechances[f[2]];
			JOptionPane.showMessageDialog(this,"player " +winner+ " won the game");
			int i = JOptionPane.showConfirmDialog(this,"Play Again");
			if(i==0){
				this.setVisible(false);
				new MyClass();
				JOptionPane.showMessageDialog(this,"Welcome Back *_*");
			}
			else if(i==1){
				System.exit(2333);
			}
			else{
				
			}
		  		System.out.println(i);
			}		
			
			
			//////////////////////g////////////////
if(gamechances[g[0]]==gamechances[g[1]]&&(gamechances[g[1]]==gamechances[g[2]])&&gamechances[g[2]]!=2)
	        {   
            
			
			winner=gamechances[g[0]];
			JOptionPane.showMessageDialog(this,"player " +winner+ " won the game");
			int i = JOptionPane.showConfirmDialog(this,"Play Again");
			if(i==0){
				this.setVisible(false);
				new MyClass();
				JOptionPane.showMessageDialog(this,"Welcome Back *_*");
			}
			else if(i==1){
				System.exit(2333);
			}
			else{
				
			}
		  		System.out.println(i);
			}			
			
			
			         /////////////////h/////////////
		if(gamechances[h[0]]==gamechances[h[1]]&&(gamechances[h[1]]==gamechances[h[2]])&&gamechances[a[2]]!=2)
	        {   
            
			
			winner=gamechances[h[2]];
			JOptionPane.showMessageDialog(this,"player " +winner+ " won the game");
			int i = JOptionPane.showConfirmDialog(this,"Play Again");
			if(i==0){
				this.setVisible(false);
				new MyClass();
				JOptionPane.showMessageDialog(this,"Welcome Back *_*");
			}
			else if(i==1){
				System.exit(2333);
			}
			else{
				
			}
		  		System.out.println(i);
			}	
			
			            ///////////////DRAW//////////////
			
		 else if((gamechances[a[2]]!=2)&&(gamechances[b[2]]!=2)&&(gamechances[c[2]]!=2)&&(gamechances[d[2]]!=2)&&(gamechances[k[2]]!=2)&&(gamechances[f[2]]!=2)&&(gamechances[g[2]]!=2)&&(gamechances[h[2]]!=2)){
				JOptionPane.showMessageDialog(this,"Draw");
			int i = JOptionPane.showConfirmDialog(this,"Play Again");
			if(i==0){
				this.setVisible(false);
				new MyClass();
				JOptionPane.showMessageDialog(this,"Welcome Back *_*");
			}
			else if(i==1){
				System.exit(2333);
			}
			else{
				
			}
		  		System.out.println(i);
			}	
			
	
			 }
			 
			else{
					JOptionPane.showMessageDialog(this,"position taken,try another position");
				}
				

   }			
		 }
		 
		 
	 
	 
