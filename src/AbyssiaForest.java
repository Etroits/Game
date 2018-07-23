import java.awt.Component;
import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyListener;
import java.awt.*;

import javax.swing.*;


public class AbyssiaForest extends JFrame {

	
	
	public AbyssiaForest(){
		setTitle("Radiant Historia");
		setBounds(600, 400, 550, 600);
		Lamina textscreen= new Lamina();
		
		add(textscreen);
		Lamina map = new Lamina();
		pack();
		
	}
	}


class Lamina extends JPanel {
	public Lamina(){
		start=true;
		
		setLayout(new BorderLayout());
		
		screen =new JButton("Welcome to your adventure, Stocke");
		screen.setEnabled(false);
		
		
		add(screen,BorderLayout.SOUTH);
		map = new JPanel();
		map.setLayout(new GridLayout(4,4));
		add(map, BorderLayout.CENTER);
		ActionListener inserts = new events();
		ActionListener trap = new events();
		ActionListener pickup = new events();
		ActionListener freeway = new events();
		makingevents("Starter point",inserts);
		makingevents("",freeway);
		makingevents("Enemy", inserts);
		makingevents("Enemy", inserts);
		makingevents("Enemy", inserts);
		makingevents("Potion",pickup );
		makingevents("",trap);
		makingevents("Bomb",pickup);
		makingevents("Potion", pickup);
		makingevents("Enemy", inserts);
		makingevents("",trap);
		makingevents("Holy Water", pickup);
		makingevents("Enemy", inserts);
		makingevents("",freeway);
		makingevents("Enemy", inserts);
		makingevents("Heiss is here", inserts);
		
		
	}
	
	private void makingevents(String e, ActionListener listener){
		
		
		JButton stages = new JButton(e);
		stages.addActionListener(listener);
		
		
		map.add(stages);
		}
	private class events implements ActionListener{

		public void actionPerformed(ActionEvent e) {
			
			String input = e.getActionCommand();
			if(start==true){
				screen.setText("");
				
				start=false;
				
			}
			
			screen.setText(screen.getText()+input);
		}
		
	}
	private JButton screen;
	private JPanel map;
	
	private boolean start;
	
}
