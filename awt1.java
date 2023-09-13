package awtDemo;

import java.awt.*;    
public class App {

	public static void main(String[] args) {
		Frame frm = new Frame("HariMani");
		frm.setSize(700,500);
		frm.setLayout(null);
	    Button btn = new Button("Click Me");
	    frm.add(btn);
	    btn.setBounds(75, 75,200, 50);
		frm.setVisible(true);
		
		

	}

}
