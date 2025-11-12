import java.awt.*;
import java.awt.event.*;
class Lab7P2 implements ActionListener,WindowListener{
	Lab7P2(){
		final int count[] = {1};
		Frame f = new Frame("Event Handling");
		f.setLayout(new FlowLayout());
		f.setSize(400,100);
		Button b = new Button("click");
		//b.setLabel=click;
		TextField tf = new TextField(30);
		Label l = new Label("this is label");
		f.add(b);
		f.add(tf);
		f.add(l);
		b.addActionListener(this);
		f.addWindowListener(this);
		f.setVisible(true);
	}
}
			public void actionPerformed(ActionEvent ae){
				System.out.println(tf.getText() +count[0]);
				count[0]++;
				l.setText(tf.getText());
			}
			public void windowClosing(WindowEvent e){
				
				f.dispose();
			}
		
