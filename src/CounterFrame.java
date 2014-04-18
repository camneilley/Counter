import javax.print.attribute.standard.Media;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.ArrayList;

public class CounterFrame extends JFrame{
	//Make empty array for pictures
	protected static ArrayList<ImageIcon> tiles=new ArrayList<ImageIcon>();
	//initialize all pictures
	ImageIcon marik1=new ImageIcon("images/MarikTileLeft.jpg");
	ImageIcon marik2=new ImageIcon("images/MarikTileRight.jpg");
	ImageIcon yugi1=new ImageIcon("images/YugiTileLeft");
	ImageIcon yugi2=new ImageIcon("images/YugiTileRight");
	//initialize all GUI components, 1:left;2:right
	JButton picture1;
	JButton picture2;
	
	JTextArea name1;
	JTextArea name2;
	
	JLabel lifePoints1;
	JLabel lifePoints2;
	
	JTextArea inca1;
	JTextArea inca2;
	JTextArea incb1;
	JTextArea incb2;
	JTextArea incc1;
	JTextArea incc2;
	
	JButton minusa1;
	JButton minusa2;
	JButton minusb1;
	JButton minusb2;
	JButton minusc1;
	JButton minusc2;
	
	JButton plusa1;
	JButton plusa2;
	JButton plusb1;
	JButton plusb2;
	JButton plusc1;
	JButton plusc2;
	
	JButton music;
	JComboBox musicMenu;
	JButton leaderboard;
	JButton soundOn;
	JButton soundOff;
	JButton reset;
	//Declare Boxes for organization
	Box left;
	Box incrowa1;
	Box incrowb1;
	Box incrowc1;
	Box right;
	Box incrowa2;
	Box incrowb2;
	Box incrowc2;
	Box bottom;
	//Add pictures to array of pictures
	public void addPlayerTiles(){
		tiles.add(marik1);
		tiles.add(marik2);
		tiles.add(yugi1);
		tiles.add(yugi2);
	}
	//begin constructor
	public CounterFrame(){
		addPlayerTiles();
		setLayout(new FlowLayout());
		//initialize GUI components
		picture1=new JButton(tiles.get(1));
		picture2=new JButton(tiles.get(1));
		
		name1=new JTextArea("Player1");
		name2=new JTextArea("Player2");
		name1.setEditable(true);
		name2.setEditable(true);
		
		lifePoints1=new JLabel("8000");
		lifePoints2=new JLabel("8000");
		
		inca1=new JTextArea("50");
		inca2=new JTextArea("50");
		incb1=new JTextArea("100");
		incb2=new JTextArea("100");
		incc1=new JTextArea("1000");
		incc2=new JTextArea("1000");
		
		inca1.setEditable(true);
		inca2.setEditable(true);
		incb1.setEditable(true);
		incb2.setEditable(true);
		incc1.setEditable(true);
		incc2.setEditable(true);
		
		minusa1=new JButton(new ImageIcon("images/minus.jpg"));
		minusa2=new JButton(new ImageIcon("images/minus.jpg"));
		minusb1=new JButton(new ImageIcon("images/minus.jpg"));
		minusb2=new JButton(new ImageIcon("images/minus.jpg"));
		minusc1=new JButton(new ImageIcon("images/minus.jpg"));
		minusc2=new JButton(new ImageIcon("images/minus.jpg"));
		
		plusa1=new JButton(new ImageIcon("images/plus.jpg"));
		plusa2=new JButton(new ImageIcon("images/plus.jpg"));
		plusb1=new JButton(new ImageIcon("images/plus.jpg"));
		plusb2=new JButton(new ImageIcon("images/plus.jpg"));
		plusc1=new JButton(new ImageIcon("images/plus.jpg"));
		plusc2=new JButton(new ImageIcon("images/plus.jpg"));
		
		music=new JButton(new ImageIcon("images/music.jpg"));
		String[] songs={"Song1","Song2","Song3"};
		musicMenu=new JComboBox(songs);
		leaderboard=new JButton("Leaderboards");
		soundOn=new JButton(new ImageIcon("images/music.jpg"));
		soundOff=new JButton(new ImageIcon("images/music.jpg"));
		reset=new JButton("Reset");
		//initialize containers
		left=Box.createVerticalBox();
		incrowa1=Box.createHorizontalBox();
		incrowb1=Box.createHorizontalBox();
		incrowc1=Box.createHorizontalBox();
		
		right=Box.createVerticalBox();
		incrowa2=Box.createHorizontalBox();
		incrowb2=Box.createHorizontalBox();
		incrowc2=Box.createHorizontalBox();
		
		bottom=Box.createHorizontalBox();
		//add components to left box, incrementors in separate boxes
		left.add(picture1);
		left.add(name1);
		left.add(lifePoints1);
			incrowa1.add(minusa1);
			incrowa1.add(inca1);
			incrowa1.add(plusa1);
		left.add(incrowa1);
			incrowb1.add(minusb1);
			incrowb1.add(incb1);
			incrowb1.add(plusb1);
		left.add(incrowb1);
			incrowc1.add(minusc1);
			incrowc1.add(incc1);
			incrowc1.add(plusc1);
		left.add(incrowc1);
		//Add to right box
		right.add(picture2);
		right.add(name2);
		right.add(lifePoints2);
			incrowa2.add(minusa2);
			incrowa2.add(inca2);
			incrowa2.add(plusa2);
		right.add(incrowa2);
			incrowb2.add(minusb2);
			incrowb2.add(incb2);
			incrowb2.add(plusb2);
		right.add(incrowb2);
			incrowc2.add(minusc2);
			incrowc2.add(incc2);
			incrowc2.add(plusc2);
		right.add(incrowc2);
		//Add to bottom box
		bottom.add(music);
		bottom.add(musicMenu);
		bottom.add(leaderboard);
		bottom.add(reset);
		bottom.add(soundOn);
		bottom.add(soundOff);
		//Add boxes to main container
		add(left);
		add(right);
		add(bottom);
		
		
		
		
	}
	
}
