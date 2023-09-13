package awtDemo;

import java.awt.*;    
public class App extends Frame {
	App(){
		super("HariMani");
		setSize(400, 200);
		setLayout(null);
		Button btn = new Button("Click me");
	    add(btn);
	    btn.setBounds(50, 50, 75, 30);
	    setVisible(true);
	    
	}
	
	public static void main(String[] args) {
	     App a = new App();

	}

}
