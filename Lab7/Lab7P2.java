import java.awt.*;
import java.awt.event.*;

class Lab7P2 implements ActionListener{
	Frame f = new Frame("Event Handling");
	Button b = new Button("click");
	TextField tf = new TextField(30);
	Label l = new Label("this is label");
	int count = 1;
	
	Lab7P2(){
		f.setLayout(new FlowLayout());
		f.setSize(400,100);
		f.add(b);
		f.add(tf);
		f.add(l);
		b.addActionListener(this);
		
		f.addWindowListener(new WindowAdapter(){
			public void windowClosing(WindowEvent e){
				
				f.dispose();
			}
		});
		f.setVisible(true);
	}
	public void actionPerformed(ActionEvent ae){
		System.out.println(tf.getText() +count);
		count++;
		l.setText(tf.getText());
	}
	
	public static void main(String...args){
		new Lab7P2();
	}
}
			
			
		
