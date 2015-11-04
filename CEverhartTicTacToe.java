/*A very simple JAVA GUI of Tic-Tac-Toe created by Christopher Tyler Everhart */

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JOptionPane;

import java.awt.GridBagLayout;
import java.awt.GridLayout;

import javax.swing.JButton;

import java.awt.GridBagConstraints;
import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowEvent;

import javax.swing.JLabel;


public class CEverhartTicTacToe implements ActionListener{

	public int playerTurn = 1;
	//declarations
	JButton btn0 = new JButton("1");
	JButton btn1 = new JButton("4");
	JButton btn2 = new JButton("7");
	JButton btn3 = new JButton("2");
	JButton btn4 = new JButton("5");
	JButton btn5 = new JButton("8");
	JButton btn6 = new JButton("3");
	JButton btn7 = new JButton("6");
	JButton btn8 = new JButton("9");
	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					CEverhartTicTacToe window = new CEverhartTicTacToe();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public CEverhartTicTacToe() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame("Tic-Tac-Toe");
		frame.setBounds(100, 100, 360, 450);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		//initial statement to player 1
		final JLabel gameStatus = new JLabel("Welcome, to begin Player 1 should choose a space.");
		gameStatus.setBounds(20, 351, 310, 50);
		frame.getContentPane().add(gameStatus);
		
		
		
		//defining button location
		btn0.setBounds(10, 11, 100, 100);
		frame.getContentPane().add(btn0);
		btn0.addActionListener(this);
		btn0.addActionListener(new ActionListener()
		{
			//disables the square and changes the player turn
			@Override
			public void actionPerformed(ActionEvent e)
			{
				if (playerTurn == 1)
				gameStatus.setText("Player " + 2 + "'s Turn");
				else if (playerTurn == 2)
				gameStatus.setText("Player " + 1 + "'s Turn");
				
				btn0.setEnabled(false);
				
			}
		});
		
		btn1.setBounds(10, 122, 100, 100);
		frame.getContentPane().add(btn1);
		btn1.addActionListener(this);
		btn1.addActionListener(new ActionListener()
		{
			//disables the square and changes the player turn
			@Override
			public void actionPerformed(ActionEvent e)
			{
				if (playerTurn == 1)
				gameStatus.setText("Player " + 2 + "'s Turn");
				else if (playerTurn == 2)
				gameStatus.setText("Player " + 1 + "'s Turn");
					
				btn1.setEnabled(false);
			}
		});
		
		
		btn2.setBounds(10, 233, 100, 100);
		frame.getContentPane().add(btn2);
		btn2.addActionListener(this);
		btn2.addActionListener(new ActionListener()
		{
			//disables the square and changes the player turn
			@Override
			public void actionPerformed(ActionEvent e)
			{
				if (playerTurn == 1)
				gameStatus.setText("Player " + 2 + "'s Turn");
				else if (playerTurn == 2)
				gameStatus.setText("Player " + 1 + "'s Turn");
				
				btn2.setEnabled(false);
			}
		});
		
		
		btn3.setBounds(120, 11, 100, 100);
		frame.getContentPane().add(btn3);
		btn3.addActionListener(this);
		btn3.addActionListener(new ActionListener()
		{
			//disables the square and changes the player turn
			@Override
			public void actionPerformed(ActionEvent e)
			{
				if (playerTurn == 1)
				gameStatus.setText("Player " + 2 + "'s Turn");
				else if (playerTurn == 2)
				gameStatus.setText("Player " + 1 + "'s Turn");
				
				btn3.setEnabled(false);
			}
		});
		
		
		btn4.setBounds(120, 122, 100, 100);
		frame.getContentPane().add(btn4);
		btn4.addActionListener(this);
		btn4.addActionListener(new ActionListener()
		{
			//disables the square and changes the player turn
			@Override
			public void actionPerformed(ActionEvent e)
			{
				if (playerTurn == 1)
				gameStatus.setText("Player " + 2 + "'s Turn");
				else if (playerTurn == 2)
				gameStatus.setText("Player " + 1 + "'s Turn");
				
				btn4.setEnabled(false);
			}
		});
		
		
		
		btn5.setBounds(120, 233, 100, 100);
		frame.getContentPane().add(btn5);
		btn5.addActionListener(this);
		btn5.addActionListener(new ActionListener()
		{
			//disables the square and changes the player turn
			@Override
			public void actionPerformed(ActionEvent e)
			{
				if (playerTurn == 1)
				gameStatus.setText("Player " + 2 + "'s Turn");
				else if (playerTurn == 2)
				gameStatus.setText("Player " + 1 + "'s Turn");
				
				btn5.setEnabled(false);
					
			}
		});
		
	
		btn6.setBounds(230, 11, 100, 100);
		frame.getContentPane().add(btn6);
		btn6.addActionListener(this);
		btn6.addActionListener(new ActionListener()
		{
			//disables the square and changes the player turn
			@Override
			public void actionPerformed(ActionEvent e)
			{
				if (playerTurn == 1)
				gameStatus.setText("Player " + 2 + "'s Turn");
				else if (playerTurn == 2)
				gameStatus.setText("Player " + 1 + "'s Turn");
				
				btn6.setEnabled(false);
			}
		});
		
		
		
		btn7.setBounds(230, 122, 100, 100);
		frame.getContentPane().add(btn7);
		btn7.addActionListener(this);
		btn7.addActionListener(new ActionListener()
		{
			//disables the square and changes the player turn
			@Override
			public void actionPerformed(ActionEvent e)
			{
				if (playerTurn == 1)
				gameStatus.setText("Player " + 2 + "'s Turn");
				else if (playerTurn == 2)
				gameStatus.setText("Player " + 1 + "'s Turn");
				
				btn7.setEnabled(false);
			}
		});
		
	
		btn8.setBounds(230, 233, 100, 100);
		frame.getContentPane().add(btn8);
		btn8.addActionListener(this);
		btn8.addActionListener(new ActionListener()
		{
			//disables the square and changes the player turn
			@Override
			public void actionPerformed(ActionEvent e)
			{
				if (playerTurn == 1)
				gameStatus.setText("Player " + 2 + "'s Turn");
				else if (playerTurn == 2)
				gameStatus.setText("Player " + 1 + "'s Turn");
				
				btn8.setEnabled(false);
			}
		});
	}
		
	@Override
	public void actionPerformed(ActionEvent e) {
		
		
		Object src = e.getSource();
		JButton b = (JButton) src;
		//if/else statements used to determine whether the square pressed
		//should be an X or an O
		if (playerTurn == 1)
		{
			b.setText("X");
			playerTurn++;
		}
		else if (playerTurn == 2)
		{
			b.setText("O");
			playerTurn--;
		}
		if (gameCheck(btn0, btn1, btn2, btn3, btn4, btn5, btn6, btn7, btn8) == true)
		{
			//checks to see if a winner is found, and determines who wins
			//system exits after a winner is declared
			if (playerTurn == 1)
			{
				JOptionPane.showMessageDialog(frame, "Congratulations!  Player 2 has won!");
				System.exit(0);
			}
			else if(playerTurn == 2)
			{
				JOptionPane.showMessageDialog(frame, "Congratulations!  Player 1 has won!");
				System.exit(0);
			}
		}
		//determines if there are any squares left in case of a tie
		if (!(btn0.isEnabled()) && !(btn1.isEnabled())  && !(btn2.isEnabled()) && !(btn3.isEnabled()) &&
				!(btn4.isEnabled()) && !(btn5.isEnabled()) && !(btn6.isEnabled()) && !(btn7.isEnabled()) 
				&& !(btn8.isEnabled()) )
		{
			JOptionPane.showMessageDialog(frame, "The game is a tie...");
			System.exit(0);
		}
	
	}
	public boolean gameCheck(JButton b0, JButton b1, JButton b2, JButton b3, JButton b4, JButton b5,
			JButton b6, JButton b7, JButton b8){
		//runs checks to see if a winner has gotten three in a row horizontally, vertically, or diagonally
		if (b0.getText().equals(b1.getText()) && b1.getText().equals(b2.getText()))
		{
			return true;
		}
		if (b3.getText().equals(b4.getText())  && b4.getText().equals(b5.getText()))
		{
			return true;
		}
		if (b6.getText().equals(b7.getText()) && b7.getText().equals(b8.getText()))
		{
			return true;
		}
		if (b0.getText().equals(b3.getText()) && b3.getText().equals(b6.getText()))
		{
			return true;
		}
		if (b1.getText().equals(b4.getText()) && b4.getText().equals(b7.getText()))
		{
			return true;
		}
		if (b2.getText().equals(b5.getText()) && b5.getText().equals(b8.getText()))
		{
			return true;
		}
		if (b0.getText().equals(b4.getText()) && b4.getText().equals(b8.getText()))
		{
			return true;
		}
		if (b2.getText().equals(b4.getText()) && b4.getText().equals(b6.getText()))
		{
			return true;
		}
		
		else
			return false;
		}
	
	
	
	
	public void windowClosing (WindowEvent x)
	{
		System.exit(0);
	}
}
