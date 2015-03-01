import javax.swing.*;
import java.awt.*;
import javax.swing.event.*;
import java.awt.event.*;


public class Drag extends JPanel
{

	JButton b = new JButton("1");
	JButton c = new JButton("2");
	JButton d = new JButton("3");

	JButton b1 = new JButton("1");
	JButton b2= new JButton("2");
	JButton b3 = new JButton("3");

	JFrame f = new JFrame("Tutorial 1");


	int fx=0;
	int fy=0;
	int x=0;
	int y=0;


	int count = 0;
		

	JLabel over = new JLabel("Game Over");



	public Drag(){
		f.setSize(500,500);
				

		final JButton back = new JButton("REPLAY");
		back.setBounds(200,300,100,30);
		add(back);
		back.setVisible(false);


		back.addActionListener(

			new ActionListener(){


		public void actionPerformed(ActionEvent e){


			
			f.dispose();
			new Drag();

		}
			
			});


		over.setBounds(50,200,450,50);
		over.setForeground(Color.white);
		over.setFont(new Font("Dialog", 1, 65));
		over.setVisible(false);
		add(over);
		

		b.setBounds(50,50,100,30);
		add(b);
	
		
		c.setBounds(50,100,100,30);
		add(c);

		
		d.setBounds(50,150,100,30);
		add(d);

		b1.setBounds(200,50,100,30);
		b1.setContentAreaFilled(false);
		b1.setBackground(Color.green);
		b1.setOpaque(true);
		add(b1);
	

		b2.setBounds(200,100,100,30);
		b2.setContentAreaFilled(false);
		b2.setBackground(Color.yellow);
		b2.setOpaque(true);
		add(b2);
	
		b3.setBounds(200,150,100,30);
		b3.setContentAreaFilled(false);
		b3.setBackground(Color.green);
		b3.setOpaque(true);
		add(b3);
		




	b.addMouseMotionListener(


	new MouseMotionAdapter(){



	public void mouseDragged(MouseEvent evt){
		fx = 0;
		fy = 0;



	fx = evt.getXOnScreen() - x;
	
	fy = evt.getYOnScreen() - y;

		
	b.setLocation(fx,fy);
	System.out.println(fx + "     and     " +fy);

		if(fx>400 && fy<0){

			b.setLocation(400,0);


		}
		else if(fx< 0 && fy<0){

			b.setLocation(0,0);
		
		}
		else if(fx<0 && fy>440){

			b.setLocation(0,440);

		}
		
		else if(fx<0){
			b.setLocation(0,fy);

		}
		else if(fy<0 && 0<fx){

			b.setLocation(fx,0);

		}
		else if(fx>400 && fy<0){


			b.setLocation(400,0);

		}
		else if(fx>400 && fy>400){


			b.setLocation(400,440);

		}
		
		else if(fx>400){


			b.setLocation(400,fy);

		}
		
		else if(fy>440){

			b.setLocation(fx,440);

		}
		
		

		


	

	}

});



	b.addMouseListener(


	new MouseAdapter(){


	public void mousePressed(MouseEvent t){
		x = 0;
		y = 0;


	x = t.getX();
	y = t.getY();



	}


	
	public void mouseReleased(MouseEvent g){


		
		if((fx==200 && fy==50)|| (((190<fx) && (fx<210)) && ((40<fy)&&(fy<60))))  {

			count = count + 1;

			b1.setVisible(false);
			b.setVisible(false);

			if(count == 3){
				over.setVisible(true);
				back.setVisible(true);

			}


		}
		else{

			b.setLocation(50,50);


		}
		

		}


	});
		









		

	c.addMouseMotionListener(


	new MouseMotionAdapter(){



	public void mouseDragged(MouseEvent evt){
		fx = 0;
		fy = 0;



	fx = evt.getXOnScreen() - x;
	
	fy = evt.getYOnScreen() - y;

		
	c.setLocation(fx,fy);
	System.out.println(fx + "     and     " +fy);

		if(fx>400 && fy<0){

			c.setLocation(400,0);


		}
		else if(fx< 0 && fy<0){

			c.setLocation(0,0);
		
		}
		else if(fx<0 && fy>440){

			c.setLocation(0,440);

		}
		
		else if(fx<0){
			c.setLocation(0,fy);

		}
		else if(fy<0 && 0<fx){

			c.setLocation(fx,0);

		}
		else if(fx>400 && fy<0){


			c.setLocation(400,0);

		}
		else if(fx>400 && fy>400){


			c.setLocation(400,440);

		}
		
		else if(fx>400){


			c.setLocation(400,fy);

		}
		
		else if(fy>440){

			c.setLocation(fx,440);

		}
		


		


	

	}

});



	c.addMouseListener(


	new MouseAdapter(){


	public void mousePressed(MouseEvent t){
		x = 0;
		y = 0;


	x = t.getX();
	y = t.getY();



	}


	
	public void mouseReleased(MouseEvent g){


		
		if((fx==200 && fy==100)|| (((190<fx) && (fx<210)) && ((90<fy)&&(fy<110))))  {


				count = count + 1;
			b2.setVisible(false);
			c.setVisible(false);


			if(count == 3){
				over.setVisible(true);
				back.setVisible(true);

			}

		}
		else{

			c.setLocation(50,100);


		}
		
		

		}


	});





	d.addMouseMotionListener(


	new MouseMotionAdapter(){



	public void mouseDragged(MouseEvent evt){
		fx = 0;
		fy = 0;



	fx = evt.getXOnScreen() - x;
	
	fy = evt.getYOnScreen() - y;

		
	d.setLocation(fx,fy);
	System.out.println(fx + "     and     " +fy);

		if(fx>400 && fy<0){

			d.setLocation(400,0);


		}
		else if(fx< 0 && fy<0){

			d.setLocation(0,0);
		
		}
		else if(fx<0 && fy>440){

			d.setLocation(0,440);

		}
		
		else if(fx<0){
			d.setLocation(0,fy);

		}
		else if(fy<0 && 0<fx){

			d.setLocation(fx,0);

		}
		else if(fx>400 && fy<0){


			d.setLocation(400,0);

		}
		else if(fx>400 && fy>400){


			d.setLocation(400,440);

		}
		
		else if(fx>400){


			d.setLocation(400,fy);

		}
		
		else if(fy>440){

			d.setLocation(fx,440);

		}
		


		


	

	}

});



	d.addMouseListener(


	new MouseAdapter(){


	public void mousePressed(MouseEvent t){
		x = 0;
		y = 0;


	x = t.getX();
	y = t.getY();



	}


	
	public void mouseReleased(MouseEvent g){


		
		if((fx==200 && fy==150)|| (((190<fx) && (fx<210)) && ((140<fy)&&(fy<160))))  {


			count = count + 1;
			b3.setVisible(false);
			d.setVisible(false);


			if(count == 3){
				over.setVisible(true);
				back.setVisible(true);

			}

		}
		else{

			d.setLocation(50,150);


		}
		

		}


	});
		




		
		setLayout(null);
		setBounds(0,0,f.getWidth(),f.getHeight());
		f.add(this);
		setBackground(Color.red);
		
		f.setResizable(false);
		f.setDefaultCloseOperation(3);
		f.setVisible(true);

		

	}



		public static void main(String args[]){


			new Drag();

		}
}
