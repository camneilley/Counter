import javax.print.attribute.standard.Media;
import javax.swing.*;

import java.awt.*;
import java.awt.event.*;
import java.util.ArrayList;

import javafx.scene.media.MediaPlayer;
public class CounterFrame extends JFrame{
	protected static ArrayList<ImageIcon> tiles=new ArrayList<ImageIcon>();
	ImageIcon marik1=new ImageIcon("images/MarikTileLeft.jpg");
	ImageIcon marik2=new ImageIcon("images/MarikTileRight.jpg");
	ImageIcon yugi1=new ImageIcon("images/YugiTileLeft");
	ImageIcon yugi2=new ImageIcon("images/YugiTileRight");
	
	MediaPlayer player=new MediaPlayer(new Media("music/song1"));
	
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
	
	Box left;
	Box right;
	Box bottom;
	
	public void addPlayerTiles(){
		tiles.add(marik1);
		tiles.add(marik2);
		tiles.add(yugi1);
		tiles.add(yugi2);
	}
	public void addMusic(){
		musics.add()
	}
	public CounterFrame(){
		picture1=new JButton(tiles.get(3));
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
		
		
	}
	
}
