package hotel;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.LineBorder;
import java.awt.Color;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Calendar;
import java.util.GregorianCalendar;

import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import javax.swing.JSeparator;
import javax.swing.JTabbedPane;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.JButton;
import javax.swing.JTextArea;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JCheckBox;

public class Hotel {

	private JFrame frame;
	private JTextField txtDisplay;
	private JTextField txtFriedRice;
	private JTextField txtShawarma;
	private JTextField txtChicken;
	private JTextField txtChooseDrink;
	private JTextField txtEnterCurrency;
	
	double firstnum;
	double secondnum;
	double result;
	String operations;
	String answer;
	
	double Nigerian_Naira = 360.00;
    double Kenyan_Shilling = 101.00;
    double Chinese_Yuan = 6.29;
    double Indian_Rupee = 65.02;
    
    private JLabel lblClock;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Hotel window = new Hotel();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	public void datetime() {
        Thread datetime = new Thread() {
            public void run() {
                try {
                    for (;;) {
                        Calendar cal = new GregorianCalendar();
                        int day = cal.get(Calendar.DAY_OF_MONTH);
                        int month = cal.get(Calendar.MONTH);
                        int year = cal.get(Calendar.YEAR);

                        int second = cal.get(Calendar.SECOND);
                        int minute = cal.get(Calendar.MINUTE);
                        int hour = cal.get(Calendar.HOUR);

                        lblClock.setText("Time: " + hour + ":" + minute + ":" + second + " " + year + "/" + month + "/" + day);

                        sleep(1000);
                    }
                } catch (Exception e) {

                }
            }
        };
        datetime.start();
    }
	/**
	 * Create the application.
	 */
	public Hotel() {
		initialize();
		datetime();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
        frame = new JFrame();
        frame.setBounds(0, 0, 1500, 800);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.getContentPane().setLayout(null);

        JPanel panel = new JPanel();
        panel.setBorder(new LineBorder(new Color(0, 0, 0), 10));
        panel.setBounds(10, 51, 479, 707);
        frame.getContentPane().add(panel);
        panel.setLayout(null);

        JTabbedPane tabbedPane = new JTabbedPane(JTabbedPane.TOP);
        tabbedPane.setBounds(10, 10, 459, 687);
        panel.add(tabbedPane);

        JPanel panel_3 = new JPanel();
        tabbedPane.addTab("Calculator", null, panel_3, null);
        panel_3.setLayout(null);

        txtDisplay = new JTextField();
        txtDisplay.setHorizontalAlignment(SwingConstants.RIGHT);
        txtDisplay.setFont(new Font("Tahoma", Font.BOLD, 60));
        txtDisplay.setColumns(10);
        txtDisplay.setBounds(10, 24, 430, 60);
        panel_3.add(txtDisplay);
		
        JButton btnbackspace = new JButton("\uF0E7");
        btnbackspace.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent arg0) {

                if (txtDisplay.getText().length() > 0) {
                    String backspace = null;

                    StringBuilder strB = new StringBuilder(txtDisplay.getText());
                    strB.deleteCharAt(txtDisplay.getText().length() - 1);
                    backspace = strB.toString();
                    txtDisplay.setText(backspace);
                }

            }
        });
        btnbackspace.setFont(new Font("Dialog", Font.BOLD, 50));
        btnbackspace.setBounds(10, 94, 100, 100);
        panel_3.add(btnbackspace);

        JButton btn7 = new JButton("7");
        btn7.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent arg0) {

                String EnterValue = txtDisplay.getText() + btn7.getText();
                txtDisplay.setText(EnterValue);

            }
        });
        btn7.setFont(new Font("Tahoma", Font.BOLD, 70));
        btn7.setBounds(10, 204, 100, 100);
        panel_3.add(btn7);

        JButton btn4 = new JButton("4");
        btn4.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent arg0) {

                String EnterValue = txtDisplay.getText() + btn4.getText();
                txtDisplay.setText(EnterValue);

            }
        });
        btn4.setFont(new Font("Tahoma", Font.BOLD, 70));
        btn4.setBounds(10, 314, 100, 100);
        panel_3.add(btn4);

        JButton btn1 = new JButton("1");
        btn1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent arg0) {

                String EnterValue = txtDisplay.getText() + btn1.getText();
                txtDisplay.setText(EnterValue);

            }
        });
        btn1.setFont(new Font("Tahoma", Font.BOLD, 70));
        btn1.setBounds(10, 424, 100, 100);
        panel_3.add(btn1);

        JButton btn0 = new JButton("0");
        btn0.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent arg0) {

                String EnterValue = txtDisplay.getText() + btn0.getText();
                txtDisplay.setText(EnterValue);

            }
        });
        btn0.setFont(new Font("Tahoma", Font.BOLD, 70));
        btn0.setBounds(10, 534, 100, 100);
        panel_3.add(btn0);

        JButton btnDot = new JButton(".");
        btnDot.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent arg0) {

                String EnterValue = txtDisplay.getText() + btnDot.getText();
                txtDisplay.setText(EnterValue);

            }
        });
        btnDot.setFont(new Font("Tahoma", Font.BOLD, 70));
        btnDot.setBounds(120, 534, 100, 100);
        panel_3.add(btnDot);

        JButton btn2 = new JButton("2");
        btn2.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent arg0) {

                String EnterValue = txtDisplay.getText() + btn2.getText();
                txtDisplay.setText(EnterValue);

            }
        });
        btn2.setFont(new Font("Tahoma", Font.BOLD, 70));
        btn2.setBounds(120, 424, 100, 100);
        panel_3.add(btn2);

        JButton btn5 = new JButton("5");
        btn5.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent arg0) {

                String EnterValue = txtDisplay.getText() + btn5.getText();
                txtDisplay.setText(EnterValue);

            }
        });
        btn5.setFont(new Font("Tahoma", Font.BOLD, 70));
        btn5.setBounds(120, 314, 100, 100);
        panel_3.add(btn5);

        JButton btn8 = new JButton("8");
        btn8.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent arg0) {

                String EnterValue = txtDisplay.getText() + btn8.getText();
                txtDisplay.setText(EnterValue);

            }
        });
        btn8.setFont(new Font("Tahoma", Font.BOLD, 70));
        btn8.setBounds(120, 204, 100, 100);
        panel_3.add(btn8);

        JButton btnclear = new JButton("C");
        btnclear.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent arg0) {

                txtDisplay.setText(null);

            }
        });
        btnclear.setFont(new Font("Tahoma", Font.BOLD, 70));
        btnclear.setBounds(120, 94, 100, 100);
        panel_3.add(btnclear);

        JButton btnmodulus = new JButton("%");
        btnmodulus.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent arg0) {

                firstnum = Double.parseDouble(txtDisplay.getText());
                txtDisplay.setText("");
                operations = "%";

            }
        });
        btnmodulus.setFont(new Font("Tahoma", Font.BOLD, 50));
        btnmodulus.setBounds(230, 94, 100, 100);
        panel_3.add(btnmodulus);

        JButton btn9 = new JButton("9");
        btn9.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent arg0) {

                String EnterValue = txtDisplay.getText() + btn9.getText();
                txtDisplay.setText(EnterValue);

            }
        });
        btn9.setFont(new Font("Tahoma", Font.BOLD, 70));
        btn9.setBounds(230, 204, 100, 100);
        panel_3.add(btn9);

        JButton btn6 = new JButton("6");
        btn6.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent arg0) {

                String EnterValue = txtDisplay.getText() + btn6.getText();
                txtDisplay.setText(EnterValue);

            }
        });
        btn6.setFont(new Font("Tahoma", Font.BOLD, 70));
        btn6.setBounds(230, 314, 100, 100);
        panel_3.add(btn6);

        JButton btn3 = new JButton("3");
        btn3.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent arg0) {

                String EnterValue = txtDisplay.getText() + btn3.getText();
                txtDisplay.setText(EnterValue);

            }
        });
        btn3.setFont(new Font("Tahoma", Font.BOLD, 70));
        btn3.setBounds(230, 424, 100, 100);
        panel_3.add(btn3);

        JButton btnplusminus = new JButton("\u00B1");
        btnplusminus.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent arg0) {

                double plusminus = Double.parseDouble(String.valueOf(txtDisplay.getText()));
                plusminus = plusminus * (-1);
                txtDisplay.setText(String.valueOf(plusminus));

            }
        });
        btnplusminus.setFont(new Font("Tahoma", Font.BOLD, 70));
        btnplusminus.setBounds(230, 534, 100, 100);
        panel_3.add(btnplusminus);
    
		
        JButton btnequal = new JButton("=");
        btnequal.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent arg0) {

                String answer;
                secondnum = Double.parseDouble(txtDisplay.getText());

                if(operations == "+") {
                    result = firstnum + secondnum;
                    answer = String.format("%.2f", result);
                    txtDisplay.setText(answer);
                } 
                else if(operations == "-") {
                    result = firstnum - secondnum;
                    answer = String.format("%.2f", result);
                    txtDisplay.setText(answer);
                } 
                else if(operations == "X") {
                    result = firstnum * secondnum;
                    answer = String.format("%.2f", result);
                    txtDisplay.setText(answer);
                } 
                else if(operations == "/") {
                    result = firstnum / secondnum;
                    answer = String.format("%.2f", result);
                    txtDisplay.setText(answer);
                } 
                else if(operations == "%") {
                    result = firstnum % secondnum;
                    answer = String.format("%.2f", result);
                    txtDisplay.setText(answer);
                }
            }
        });
        btnequal.setFont(new Font("Tahoma", Font.BOLD, 70));
        btnequal.setBounds(340, 534, 100, 100);
        panel_3.add(btnequal);

        JButton btndivide = new JButton("/");
        btndivide.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent arg0) {

                firstnum = Double.parseDouble(txtDisplay.getText());
                txtDisplay.setText("");
                operations = "/";
            }
        });
        btndivide.setFont(new Font("Tahoma", Font.BOLD, 70));
        btndivide.setBounds(340, 424, 100, 100);
        panel_3.add(btndivide);

        JButton btnx = new JButton("X");
        btnx.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent arg0) {

                firstnum = Double.parseDouble(txtDisplay.getText());
                txtDisplay.setText("");
                operations = "X";
            }
        });
        btnx.setFont(new Font("Tahoma", Font.BOLD, 70));
        btnx.setBounds(340, 314, 100, 100);
        panel_3.add(btnx);

        JButton btnminus = new JButton("-");
        btnminus.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent arg0) {

                firstnum = Double.parseDouble(txtDisplay.getText());
                txtDisplay.setText("");
                operations = "-";
            }
        });
		
        btnminus.setFont(new Font("Tahoma", Font.BOLD, 70));
        btnminus.setBounds(340, 204, 100, 100);
        panel_3.add(btnminus);

        JButton btnPlus = new JButton("+");
        btnPlus.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent arg0) {

                firstnum = Double.parseDouble(txtDisplay.getText());
                txtDisplay.setText("");
                operations = "+";
            }
        });
        btnPlus.setFont(new Font("Tahoma", Font.BOLD, 70));
        btnPlus.setBounds(340, 94, 100, 100);
        panel_3.add(btnPlus);

        JPanel panel_4 = new JPanel();
        tabbedPane.addTab("Receipt", null, panel_4, null);
        panel_4.setLayout(null);

        JTextArea ReceiptArea = new JTextArea();
        ReceiptArea.setFont(new Font("Monospaced", Font.PLAIN, 15));
        ReceiptArea.setBounds(10, 10, 434, 640);
        panel_4.add(ReceiptArea);

        JPanel panel_1 = new JPanel();
        panel_1.setBorder(new LineBorder(new Color(0, 0, 0), 10));
        panel_1.setBounds(492, 134, 982, 362);
        frame.getContentPane().add(panel_1);
        panel_1.setLayout(null);

        JLabel lblMenu = new JLabel("Menu");
        lblMenu.setBounds(22, 21, 119, 31);
        lblMenu.setForeground(Color.BLUE);
        lblMenu.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 30));
        panel_1.add(lblMenu);

        JLabel lblQty = new JLabel("Qty");
        lblQty.setBounds(278, 21, 119, 31);
        lblQty.setForeground(Color.BLUE);
        lblQty.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 30));
        panel_1.add(lblQty);

        JLabel lblPrice = new JLabel("Price $");
        lblPrice.setBounds(483, 21, 119, 31);
        lblPrice.setForeground(Color.BLUE);
        lblPrice.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 30));
        panel_1.add(lblPrice);

        JLabel btnFriedRice = new JLabel("Fried Rice");
        btnFriedRice.setBounds(22, 62, 143, 31);
        btnFriedRice.setFont(new Font("Tahoma", Font.PLAIN, 25));
        panel_1.add(btnFriedRice);

        JLabel btnShawarma = new JLabel("Shawarma");
        btnShawarma.setBounds(22, 103, 143, 31);
        btnShawarma.setFont(new Font("Tahoma", Font.PLAIN, 25));
        panel_1.add(btnShawarma);

        JLabel btnChicken = new JLabel("Chicken");
        btnChicken.setBounds(22, 144, 143, 31);
        btnChicken.setFont(new Font("Tahoma", Font.PLAIN, 25));
        panel_1.add(btnChicken);

        txtFriedRice = new JTextField();
        txtFriedRice.setBounds(278, 62, 119, 31);
        txtFriedRice.setFont(new Font("Tahoma", Font.BOLD, 20));
        panel_1.add(txtFriedRice);
        txtFriedRice.setColumns(10);

        txtShawarma = new JTextField();
        txtShawarma.setBounds(278, 103, 119, 31);
        txtShawarma.setFont(new Font("Tahoma", Font.BOLD, 20));
        txtShawarma.setColumns(10);
        panel_1.add(txtShawarma);

        txtChicken = new JTextField();
        txtChicken.setBounds(278, 144, 119, 31);
        txtChicken.setFont(new Font("Tahoma", Font.BOLD, 20));
        txtChicken.setColumns(10);
        panel_1.add(txtChicken);

        JLabel label = new JLabel("5.676");
        label.setBounds(483, 62, 143, 31);
        label.setFont(new Font("Tahoma", Font.PLAIN, 25));
        panel_1.add(label);

        JLabel label_1 = new JLabel("3.987");
        label_1.setBounds(483, 103, 143, 31);
        label_1.setFont(new Font("Tahoma", Font.PLAIN, 25));
        panel_1.add(label_1);

        JLabel label_2 = new JLabel("11.452");
        label_2.setBounds(483, 144, 143, 31);
        label_2.setFont(new Font("Tahoma", Font.PLAIN, 25));
        panel_1.add(label_2);

        JComboBox btnChooseDrink = new JComboBox();
        btnChooseDrink.setBounds(22, 185, 207, 38);
        btnChooseDrink.setFont(new Font("Tahoma", Font.PLAIN, 25));
        btnChooseDrink.setModel(new DefaultComboBoxModel(new String[] {"Choose a drink", "Coca Cola", "Heineken", "Pepsi"}));
        panel_1.add(btnChooseDrink);

        txtChooseDrink = new JTextField();
        txtChooseDrink.setBounds(278, 192, 119, 31);
        txtChooseDrink.setFont(new Font("Tahoma", Font.BOLD, 20));
        txtChooseDrink.setColumns(10);
        panel_1.add(txtChooseDrink);
		
		JLabel label_3 = new JLabel("_");
		label_3.setBounds(509, 174, 35, 31);
		label_3.setFont(new Font("Tahoma", Font.PLAIN, 25));
		panel_1.add(label_3);

		JSeparator separator_2 = new JSeparator();
		separator_2.setBounds(620, 21, 9, 320);
		separator_2.setOrientation(SwingConstants.VERTICAL);
		panel_1.add(separator_2);

		JSeparator separator_3 = new JSeparator();
		separator_3.setBounds(22, 233, 580, 2);
		panel_1.add(separator_3);

		JComboBox btnChooseRoom = new JComboBox();
		btnChooseRoom.setBounds(22, 245, 207, 38);
		btnChooseRoom.setModel(new DefaultComboBoxModel(new String[] {"Choose a room", "101", "201", "VIP"}));
		btnChooseRoom.setFont(new Font("Tahoma", Font.PLAIN, 25));
		panel_1.add(btnChooseRoom);

		JCheckBox btnDelivery = new JCheckBox("Delivery");
		btnDelivery.setBounds(22, 289, 207, 31);
		btnDelivery.setFont(new Font("Tahoma", Font.PLAIN, 20));
		panel_1.add(btnDelivery);

		JCheckBox btnTax = new JCheckBox("Tax");
		btnTax.setBounds(22, 322, 93, 21);
		btnTax.setFont(new Font("Tahoma", Font.PLAIN, 20));
		panel_1.add(btnTax);

		JLabel lblCurrencyConverter = new JLabel("Currency Converter");
		lblCurrencyConverter.setBounds(648, 21, 313, 31);
		lblCurrencyConverter.setForeground(Color.BLUE);
		lblCurrencyConverter.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 30));
		panel_1.add(lblCurrencyConverter);

		JComboBox btnSelectCountry = new JComboBox();
		btnSelectCountry.setBounds(664, 62, 269, 38);
		btnSelectCountry.setModel(new DefaultComboBoxModel(new String[] {"Country", "Nigeria", "Kenya", "China", "India"}));
		btnSelectCountry.setFont(new Font("Tahoma", Font.PLAIN, 25));
		panel_1.add(btnSelectCountry);

		txtEnterCurrency = new JTextField();
		txtEnterCurrency.setHorizontalAlignment(SwingConstants.CENTER);
		txtEnterCurrency.setBounds(664, 128, 269, 47);
		txtEnterCurrency.setFont(new Font("Tahoma", Font.BOLD, 30));
		txtEnterCurrency.setColumns(10);
		panel_1.add(txtEnterCurrency);

		JLabel txtCurrencyOutput = new JLabel("");
		txtCurrencyOutput.setHorizontalAlignment(SwingConstants.CENTER);
		txtCurrencyOutput.setFont(new Font("Tahoma", Font.PLAIN, 25));
		txtCurrencyOutput.setBounds(664, 208, 269, 38);
		txtCurrencyOutput.setBorder(new LineBorder(new Color(0, 0, 0), 1));
		panel_1.add(txtCurrencyOutput);

		JButton btnReset2 = new JButton("Reset");
		btnReset2.addActionListener(new ActionListener() {
		    public void actionPerformed(ActionEvent arg0) {

		        txtCurrencyOutput.setText(null);
		        txtEnterCurrency.setText(null);
		        btnSelectCountry.setSelectedItem("Country");
		    }
		});
		btnReset2.setBounds(810, 282, 123, 38);
		btnReset2.setFont(new Font("Tahoma", Font.BOLD, 25));
		panel_1.add(btnReset2);

		JButton btnConvert = new JButton("Convert");
		btnConvert.addActionListener(new ActionListener() {
		    public void actionPerformed(ActionEvent arg0) {

		        double USA_Dollar = Double.parseDouble(txtEnterCurrency.getText());

		        if (btnSelectCountry.getSelectedItem().equals("Nigeria")) {
		            String Naira = String.format("N %.2f", USA_Dollar * Nigerian_Naira);
		            txtCurrencyOutput.setText(Naira);
		        }

		        if (btnSelectCountry.getSelectedItem().equals("Kenya")) {
		            String Shilling = String.format("KS %.2f", USA_Dollar * Kenyan_Shilling);
		            txtCurrencyOutput.setText(Shilling);
		        }

		        if (btnSelectCountry.getSelectedItem().equals("China")) {
		            String Yuan = String.format("CY %.2f", USA_Dollar * Chinese_Yuan);
		            txtCurrencyOutput.setText(Yuan);
		        }

		        if (btnSelectCountry.getSelectedItem().equals("India")) {
		            String Rupee = String.format("INR %.2f", USA_Dollar * Indian_Rupee);
		            txtCurrencyOutput.setText(Rupee);
		        }
		    }
		});
		btnConvert.setBounds(664, 282, 150, 38);
		btnConvert.setFont(new Font("Tahoma", Font.BOLD, 25));
		panel_1.add(btnConvert);

		JPanel panel_2 = new JPanel();
		panel_2.setBorder(new LineBorder(new Color(0, 0, 0), 10));
		panel_2.setBounds(492, 499, 982, 259);
		frame.getContentPane().add(panel_2);
		panel_2.setLayout(null);

		JLabel btnTotalCostOfMeal = new JLabel("Total Cost of Meal");
		btnTotalCostOfMeal.setBounds(29, 32, 224, 31);
		btnTotalCostOfMeal.setFont(new Font("Tahoma", Font.PLAIN, 25));
		panel_2.add(btnTotalCostOfMeal);

		JLabel btnTotalCostOfDrink = new JLabel("Total Cost of Drink");
		btnTotalCostOfDrink.setBounds(29, 88, 224, 31);
		btnTotalCostOfDrink.setFont(new Font("Tahoma", Font.PLAIN, 25));
		panel_2.add(btnTotalCostOfDrink);

		JLabel btnCostOfDelivery = new JLabel("Cost of Delivery");
		btnCostOfDelivery.setBounds(29, 149, 224, 31);
		btnCostOfDelivery.setFont(new Font("Tahoma", Font.PLAIN, 25));
		panel_2.add(btnCostOfDelivery);

		JLabel btnCostOfRoom = new JLabel("Cost of Room");
		btnCostOfRoom.setBounds(29, 202, 224, 31);
		btnCostOfRoom.setFont(new Font("Tahoma", Font.PLAIN, 25));
		panel_2.add(btnCostOfRoom);

		JLabel txtTotalCostOfMeal = new JLabel("");
		txtTotalCostOfMeal.setFont(new Font("Tahoma", Font.PLAIN, 25));
		txtTotalCostOfMeal.setBounds(318, 25, 269, 38);
		txtTotalCostOfMeal.setBorder(new LineBorder(new Color(0, 0, 0), 1));
		panel_2.add(txtTotalCostOfMeal);

		JLabel txtTotalCostOfDrink = new JLabel("");
		txtTotalCostOfDrink.setFont(new Font("Tahoma", Font.PLAIN, 25));
		txtTotalCostOfDrink.setBounds(318, 81, 269, 38);
		txtTotalCostOfDrink.setBorder(new LineBorder(new Color(0, 0, 0), 1));
		panel_2.add(txtTotalCostOfDrink);

		JLabel txtCostOfDelivery = new JLabel("");
		txtCostOfDelivery.setFont(new Font("Tahoma", Font.PLAIN, 25));
		txtCostOfDelivery.setBounds(318, 142, 269, 38);
		txtCostOfDelivery.setBorder(new LineBorder(new Color(0, 0, 0), 1));
		panel_2.add(txtCostOfDelivery);

		JLabel txtCostOfRoom = new JLabel("");
		txtCostOfRoom.setBounds(318, 195, 269, 38);
		txtCostOfRoom.setBorder(new LineBorder(new Color(0, 0, 0), 1));
		panel_2.add(txtCostOfRoom);

		JSeparator separator_4 = new JSeparator();
		separator_4.setBounds(619, 22, 8, 211);
		separator_4.setOrientation(SwingConstants.VERTICAL);
		panel_2.add(separator_4);

		JLabel btnTax1 = new JLabel("Tax");
		btnTax1.setBounds(637, 88, 52, 31);
		btnTax1.setFont(new Font("Tahoma", Font.PLAIN, 25));
		panel_2.add(btnTax1);

		JLabel btnSubTotal = new JLabel("Sub Total");
		btnSubTotal.setBounds(637, 149, 114, 31);
		btnSubTotal.setFont(new Font("Tahoma", Font.PLAIN, 25));
		panel_2.add(btnSubTotal);
		
		JLabel btnTotal = new JLabel("Total");
		btnTotal.setBounds(637, 202, 80, 31);
		btnTotal.setFont(new Font("Tahoma", Font.PLAIN, 25));
		panel_2.add(btnTotal);

		JLabel txtTax = new JLabel("");
		txtTax.setFont(new Font("Tahoma", Font.PLAIN, 25));
		txtTax.setBounds(774, 81, 180, 38);
		txtTax.setBorder(new LineBorder(new Color(0, 0, 0), 1));
		panel_2.add(txtTax);

		JLabel txtSubTotal = new JLabel("");
		txtSubTotal.setFont(new Font("Tahoma", Font.PLAIN, 25));
		txtSubTotal.setBounds(774, 142, 180, 38);
		txtSubTotal.setBorder(new LineBorder(new Color(0, 0, 0), 1));
		panel_2.add(txtSubTotal);

		JLabel txtTotal = new JLabel("");
		txtTotal.setFont(new Font("Tahoma", Font.PLAIN, 25));
		txtTotal.setBounds(774, 195, 180, 38);
		txtTotal.setBorder(new LineBorder(new Color(0, 0, 0), 1));
		panel_2.add(txtTotal);

		lblClock = new JLabel("Clock");
		lblClock.setFont(new Font("Tahoma", Font.PLAIN, 25));
		lblClock.setBounds(637, 25, 317, 38);
		panel_2.add(lblClock);

		JLabel lblNewLabel = new JLabel("Hotel Management System");
		lblNewLabel.setForeground(Color.BLUE);
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 70));
		lblNewLabel.setBounds(512, 31, 959, 109);
		frame.getContentPane().add(lblNewLabel);

		JMenuBar menuBar = new JMenuBar();
		menuBar.setBounds(10, 0, 1454, 41);
		frame.getContentPane().add(menuBar);

		JMenu mnFile = new JMenu("File");
		mnFile.setFont(new Font("Segoe UI", Font.BOLD, 20));
		menuBar.add(mnFile);

		JMenu mnNew = new JMenu("New");
		mnNew.setFont(new Font("Segoe UI", Font.BOLD, 20));
		mnFile.add(mnNew);

		JMenuItem mntmReceipt = new JMenuItem("Receipt");
		mntmReceipt.addActionListener(new ActionListener() {
		    public void actionPerformed(ActionEvent arg0) {
		        Double Invoice1 = Double.parseDouble(txtFriedRice.getText());
		        Double Invoice2 = Double.parseDouble(txtShawarma.getText());
		        Double Invoice3 = Double.parseDouble(txtChicken.getText());
		        Double Invoice4 = Double.parseDouble(txtChooseDrink.getText());

		        ReceiptArea.append("\t\nHotel Management System:\n"
		            + "\nFried Rice: \t\t" + Invoice1
		            + "\nShawarma: \t\t" + Invoice2
		            + "\nChicken : \t\t" + Invoice3
		            + "\n" + btnChooseDrink.getSelectedItem() + " :\t\t" + Invoice4
		            + "\nTotal : \t\t" + txtTotal.getText()
		            + "\n\nWelcome and Thank you for your patronage"
		        );
		    }
		});
		mntmReceipt.setFont(new Font("Segoe UI", Font.BOLD, 20));
		mnNew.add(mntmReceipt);

		JMenuItem mntmReset = new JMenuItem("Reset");
		mntmReset.addActionListener(new ActionListener() {
		    public void actionPerformed(ActionEvent arg0) {
		        txtFriedRice.setText(null);
		        txtShawarma.setText(null);
		        txtChicken.setText(null);
		        txtChooseDrink.setText(null);
		        txtTotalCostOfMeal.setText(null);
		        txtTotalCostOfDrink.setText(null);
		        txtCostOfDelivery.setText(null);
		        txtCostOfRoom.setText(null);
		        txtTax.setText(null);
		        txtSubTotal.setText(null);
		        txtTotal.setText(null);
		        txtEnterCurrency.setText(null);
		        txtCurrencyOutput.setText(null);
		        txtDisplay.setText(null);
		        btnChooseDrink.setSelectedItem("Choose a drink");
		        btnChooseRoom.setSelectedItem("Choose a room");
		        btnSelectCountry.setSelectedItem("Country");
		        ReceiptArea.setText(null);
		    }
		});
		mntmReset.setFont(new Font("Segoe UI", Font.BOLD, 20));
		mnNew.add(mntmReset);

		JMenuItem mntmConvert = new JMenuItem("Convert");
		mntmConvert.addActionListener(new ActionListener() {
		    public void actionPerformed(ActionEvent arg0) {
		        double USA_Dollar = Double.parseDouble(txtEnterCurrency.getText());

		        if (btnSelectCountry.getSelectedItem().equals("Nigeria")) {
		            String Naira = String.format("N %.2f", USA_Dollar * Nigerian_Naira);
		            txtCurrencyOutput.setText(Naira);
		        }

		        if (btnSelectCountry.getSelectedItem().equals("Kenya")) {
		            String Shilling = String.format("KS %.2f", USA_Dollar * Kenyan_Shilling);
		            txtCurrencyOutput.setText(Shilling);
		        }

		        if (btnSelectCountry.getSelectedItem().equals("China")) {
		            String Yuan = String.format("CY %.2f", USA_Dollar * Chinese_Yuan);
		            txtCurrencyOutput.setText(Yuan);
		        }

		        if (btnSelectCountry.getSelectedItem().equals("India")) {
		            String Rupee = String.format("INR %.2f", USA_Dollar * Indian_Rupee);
		            txtCurrencyOutput.setText(Rupee);
		        }
		    }
		});
		mntmConvert.setFont(new Font("Segoe UI", Font.BOLD, 20));
		mnFile.add(mntmConvert);

		JMenuItem mntmTotal = new JMenuItem("Total");
		mntmTotal.setFont(new Font("Segoe UI", Font.BOLD, 20));
		mnFile.add(mntmTotal);

		JSeparator separator = new JSeparator();
		mnFile.add(separator);

		JMenuItem mntmRefresh = new JMenuItem("Refresh");
		mntmRefresh.addActionListener(new ActionListener() {
		    public void actionPerformed(ActionEvent arg0) {
		        txtFriedRice.setText(null);
		        txtShawarma.setText(null);
		        txtChicken.setText(null);
		        txtChooseDrink.setText(null);
		        txtTotalCostOfMeal.setText(null);
		        txtTotalCostOfDrink.setText(null);
		        txtCostOfDelivery.setText(null);
		        txtCostOfRoom.setText(null);
		        txtTax.setText(null);
		        txtSubTotal.setText(null);
		        txtTotal.setText(null);
		        txtEnterCurrency.setText(null);
		        txtCurrencyOutput.setText(null);
		        txtDisplay.setText(null);
		        btnChooseDrink.setSelectedItem("Choose a drink");
		        btnChooseRoom.setSelectedItem("Choose a room");
		        btnSelectCountry.setSelectedItem("Country");
		        ReceiptArea.setText(null);
		    }
		});
		mntmRefresh.setFont(new Font("Segoe UI", Font.BOLD, 20));
		mnFile.add(mntmRefresh);

		JSeparator separator_1 = new JSeparator();
		mnFile.add(separator_1);

		JMenuItem mntmExit = new JMenuItem("Exit");
		mntmExit.addActionListener(new ActionListener() {
		    public void actionPerformed(ActionEvent arg0) {
		        System.exit(0);
		    }
		});
		mntmExit.setForeground(Color.RED);
		mntmExit.setFont(new Font("Segoe UI", Font.BOLD, 20));
		mnFile.add(mntmExit);

		JMenu mnConvert = new JMenu("Convert");
		mnConvert.setFont(new Font("Segoe UI", Font.BOLD, 20));
		menuBar.add(mnConvert);

		JMenu mnTotal = new JMenu("Total");
		mnTotal.setFont(new Font("Segoe UI", Font.BOLD, 20));
		menuBar.add(mnTotal);

		JMenu mnReset = new JMenu("Reset");
		mnReset.setFont(new Font("Segoe UI", Font.BOLD, 20));
		menuBar.add(mnReset);

		JMenu mnReceipt = new JMenu("Receipt");
		mnReceipt.setFont(new Font("Segoe UI", Font.BOLD, 20));
		menuBar.add(mnReceipt);

		JMenu mnExit = new JMenu("Exit");
		mnExit.setFont(new Font("Segoe UI", Font.BOLD, 20));
		menuBar.add(mnExit);

		JButton btnSubmit = new JButton("Submit");
		btnSubmit.addActionListener(new ActionListener() {
		    public void actionPerformed(ActionEvent arg0) {
		        //==========================Drink==============================
		        double Drinks = Double.parseDouble(txtChooseDrink.getText());
		        double CocaCola = 0.957 * Drinks;
		        double Heineken = 2.432 * Drinks;
		        double Pepsi = 1.674 * Drinks;

		        if (btnChooseDrink.getSelectedItem().equals("Coca Cola")) {
		            String pCoca_Cola = String.format("%.3f", CocaCola);
		            txtTotalCostOfDrink.setText(pCoca_Cola);
		        }

		        if (btnChooseDrink.getSelectedItem().equals("Heineken")) {
		            String pHeineken = String.format("%.3f", Heineken);
		            txtTotalCostOfDrink.setText(pHeineken);
		        }

		        if (btnChooseDrink.getSelectedItem().equals("Pepsi")) {
		            String pPepsi = String.format("%.3f", Pepsi);
		            txtTotalCostOfDrink.setText(pPepsi);
		        }

		        if (btnChooseDrink.getSelectedItem().equals("Choose a drink")) {
		            txtTotalCostOfDrink.setText("0.000");
		        }

		        //============================Meal==========================
		        double FriedRice = Double.parseDouble(txtFriedRice.getText());
		        double pFriedRice = 5.676;
		        double getFriedRice = FriedRice * pFriedRice;
		        String TotalFriedRice = String.format("%.3f", getFriedRice);
		        txtTotalCostOfMeal.setText(TotalFriedRice);

		        double Shawarma = Double.parseDouble(txtShawarma.getText());
		        double pShawarma = 3.987;
		        double getShawarma = Shawarma * pShawarma;
		        String TotalShawarma = String.format("%.3f", getShawarma + getFriedRice);
		        txtTotalCostOfMeal.setText(TotalShawarma);

		        double Chicken = Double.parseDouble(txtChicken.getText());
		        double pChicken = 9.452;
		        double getChicken = Chicken * pChicken;
		        String TotalChicken = String.format("%.3f", getChicken + getShawarma + getFriedRice);
		        txtTotalCostOfMeal.setText(TotalChicken);

		        //========================Delivery===========================
		        double cDelivery = 4.50;
		        if (btnDelivery.isSelected()) {
		            String pDelivery = String.format("%.3f", cDelivery);
		            txtCostOfDelivery.setText(pDelivery);
		        } else {
		            txtCostOfDelivery.setText("0.000");
		        }

		        //=======================Tax=================================
		        double pTotal1 = Double.parseDouble(txtTotalCostOfMeal.getText());
		        double pTotal2 = Double.parseDouble(txtTotalCostOfDrink.getText());
		        double pTotal3 = Double.parseDouble(txtCostOfDelivery.getText());
		        double cTotal = (pTotal1 + pTotal2 + pTotal3) / 100;

		        if (btnTax.isSelected()) {
		            String xTotal = String.format("%.3f", cTotal);
		            txtTax.setText(xTotal);
		        }

		        //===========================Total==========================
		        double pTotal4 = Double.parseDouble(txtTax.getText());
		        String zTaxTotal = String.format("$%.3f", pTotal4);
		        txtTax.setText(zTaxTotal);

		        double SubTotal = pTotal1 + pTotal2 + pTotal3;
		        String pSubTotal = String.format("$%.3f", SubTotal);
		        txtSubTotal.setText(pSubTotal);

		        double xTotal = pTotal1 + pTotal2 + pTotal3 + pTotal4;
		        String yTotal = String.format("$%.3f", xTotal);
		        txtTotal.setText(yTotal);
		    }
		});
		btnSubmit.setBounds(333, 282, 150, 38);
		btnSubmit.setFont(new Font("Tahoma", Font.BOLD, 25));
		panel_1.add(btnSubmit);

		JButton btnReset1 = new JButton("Reset");
		btnReset1.addActionListener(new ActionListener() {
		    public void actionPerformed(ActionEvent arg0) {
		        txtFriedRice.setText(null);
		        txtShawarma.setText(null);
		        txtChicken.setText(null);
		        txtChooseDrink.setText(null);
		        txtTotalCostOfMeal.setText(null);
		        txtTotalCostOfDrink.setText(null);
		        txtCostOfDelivery.setText(null);
		        txtCostOfRoom.setText(null);
		        txtTax.setText(null);
		        txtSubTotal.setText(null);
		        txtTotal.setText(null);
		        txtEnterCurrency.setText(null);
		        txtCurrencyOutput.setText(null);
		        txtDisplay.setText(null);
		        btnChooseDrink.setSelectedItem("Choose a drink");
		        btnChooseRoom.setSelectedItem("Choose a room");
		        btnSelectCountry.setSelectedItem("Country");
		        ReceiptArea.setText(null);
		    }
		});
		btnReset1.setBounds(479, 282, 123, 38);
		btnReset1.setFont(new Font("Tahoma", Font.BOLD, 25));
		panel_1.add(btnReset1);

	}
}
