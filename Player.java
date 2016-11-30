/**
 * 
 */
package game;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JLabel;

/**
 * @author Ashlyn Wright
 *
 */
public class Player {
	Icon player1;
	int hintCount;
	String wittyComment;
	
	/**
	 * 
	 */
	public Player(Icon player, int hint, String witty) {
		player = this.player1;
		hint = this.hintCount;
		witty = this.wittyComment;
	}
	/**
	 * @return the player character
	 */
	public Icon getPlayer() {
		return player1;
	}
	/**
	 * @param player the new player character to set
	 */
	public void setPlayer(Icon player) {
		this.player1 = player;
	}
	
	public int getHintCount() {
		return hintCount;
	}
	
	public void setHintCount(int count) {
		count = this.hintCount;
	}
	
	public String getWittyComment() {
		return String.format("\"%s\"", wittyComment);
	}
	
	
	
	static void pickPlayer(Icon[] player, JLabel a) {
		
		int k = 0;
		for (int i = 0; i < player.length; i++) {
			if (player[i] == a.getIcon()) {
				k = i + 1;
			} 
		
		if (k >= player.length) k = 0;
		}
			a.setIcon(player[k]);
			a.setVisible(true);
	}
	
	
	

}
