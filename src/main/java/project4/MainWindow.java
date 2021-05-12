package project4;

import java.awt.Dimension;
import java.awt.Window;
import java.awt.Dialog.ModalityType;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.AbstractButton;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.SwingUtilities;


import project4.DliaSotrudnikov;
import project4.DliaZaiomshikov;
import project4.Standart;
import project4.info;
import project4.ListenerButton;


public class MainWindow {
	  private JPanel mainPanel = new JPanel();
	    private JDialog modalDialog;
	public MainWindow() {
		
	    
		JFrame main_GUI = new JFrame("calculator"); // �������� ������������ ����
		main_GUI.setTitle ("����������� ��������������� ������"); 
		main_GUI.setBounds(400,200,400,350);
		main_GUI.setResizable(false); // ������������� ������ ����
		
		JPanel main_panel = new JPanel(); // ������ - ������������ ��� ����������� ����������� � ����
		main_panel.setLayout(null); 
		
		


		
		JButton openModalDialogBtn = new JButton("�����");            
    	openModalDialogBtn.setBounds(150,235,105,30);
    openModalDialogBtn.addActionListener(new ActionListener() {

        public void actionPerformed(ActionEvent e) {
            openModalDialogBtnActionPerformed(e);

        }
        

    });
    main_panel.add(openModalDialogBtn);

		
		JButton button_exit = new JButton("�����"); // ���������� ������
    	button_exit.setBounds(250,235,105,30); // ��������� ������
    	ActionListener actionListener = new ListenerButton(); //������� ���������
    	button_exit.addActionListener(actionListener); // ��������� ��������� � ������
    	main_panel.add(button_exit); // ���������� ������ �� ������
    	

	label(main_panel); // ���������� �������� 
	main_GUI.add(main_panel); // ���������� �� ����������� ���� ������
	menu(main_GUI); // ���������� JComboBox
	main_GUI.setVisible(true);

	
	main_GUI.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // �������� ���� JFrame � �������� Java
	
	}

	  
	void label(JPanel panel) {
			
			
			final JTextField log = new JTextField(); // �������� ���������� ����
    		log.setBounds(20,105,200,30); // ��������� ���������� ���� ( ��� ��������� �� ������ ������������ x,y;������, �����)
    		panel.add(log); // ���������� ���������� ���� �� ������
			JLabel laba_log = new JLabel("������� �����");
			laba_log.setBounds(20,80,300,30);
			panel.add(laba_log);
			
			JLabel laba_pass = new JLabel("������� ������");
			laba_pass.setBounds(20,130,300,30);
			panel.add(laba_pass);
			final JTextField pass = new JTextField();  // �������� ���������� ����
    		pass.setBounds(20,155,200,30); //  ��������� ���������� ���� ( ��� ��������� �� ������ ������������ x,y;������, �����)
    		panel.add(pass); // ���������� ���������� ���� �� ������
			
		}
		void menu(JFrame frame1) {
			JMenuBar bar = new JMenuBar(); // ������� JMenuBar
			
			JMenu menu = new JMenu("����"); // ������� ������ "����"
			
			//JMenuBar home = new JMenuBar(); // ������� JMenuBar
			JMenuItem menuItem_info  = new JMenuItem("����������");//�������� ������ "����������" � ����
			ActionListener actionListener1 = new info(); //������� ���������
			menuItem_info.addActionListener(actionListener1); // ��������� ��������� � ������
			JMenuItem menuItem_exit = new JMenuItem("�����"); // �������� ������ "�����" � ����
			ActionListener actionListener = new ListenerButton(); //�������� ���������
			menuItem_exit.addActionListener(actionListener); // ���������� ��������� � ������
			
			menu.add(menuItem_info);
			menu.addSeparator();
			menu.add(menuItem_exit);
			
			bar.add(menu);
			
			frame1.setJMenuBar(bar); // ��������� JMenuBar � ����������� ����
		} 
			private void openModalDialogBtnActionPerformed(ActionEvent e) {
		        if (modalDialog == null) {
		            Window topWindow = SwingUtilities.getWindowAncestor(mainPanel);
		            modalDialog = new JDialog(topWindow, "��������������");
		            modalDialog.setSize(400,400);
		            
		            modalDialog.setVisible(true);
		            modalDialog.dispose();
		            JPanel frame = new JPanel();
		            JButton aye = new JButton("e");
		            aye.setBounds(10,10,10,10);
		            
		            modalDialog.add(frame);
		        	frame.add(aye);
		        	String[] uslovia = {"����������� �������", "����� ���������� ������ � ������ �����", "������� ����������� ��������-�������� ����� �����"};
		    		final JComboBox usl = new JComboBox(uslovia);
		    		usl.setBounds(20,45,340,30);
		    		frame.add(usl);
		    		
		    		final JTextField summ = new JTextField(); // �������� ���������� ����
		    		summ.setBounds(20,105,200,30); // ��������� ���������� ���� ( ��� ��������� �� ������ ������������ x,y;������, �����)
		    		frame.add(summ); // ���������� ���������� ���� �� ������
		    		
		    		final JTextField srok = new JTextField();  // �������� ���������� ����
		    		srok.setBounds(20,155,200,30); //  ��������� ���������� ���� ( ��� ��������� �� ������ ������������ x,y;������, �����)
		    		frame.add(srok); // ���������� ���������� ���� �� ������
		    		
		    		final JCheckBox dosr = new JCheckBox("�� �������� �������� �������� ������ � ������ ���"); // ������� ������
		    		dosr.setBounds(20,200,400,30); // ������� ���������� ������
		    		frame.add(dosr); // ���������� ������ �� ������
		    		
		    		
		    		JLabel laba_usl = new JLabel("������� �������"); // 
					laba_usl.setBounds(20,20,200,30); 
					frame.add(laba_usl);
					
					JLabel laba_summ = new JLabel("������� ����� ������� �� 50 000 �� 3 000 000 ���");
					laba_summ.setBounds(20,80,300,30);
					frame.add(laba_summ);
					
					JLabel laba_srok = new JLabel("������� ���� ������ �� 12 �� 60 �������");
					laba_srok.setBounds(20,130,300,30);
					frame.add(laba_srok);
		    		
		    		JButton button_obes = new JButton("���������"); // ���������� ������
		        	button_obes.setBounds(20,235,105,30); // ������ ���������
		        	button_obes.addActionListener(new ListenerButton() // ���������
		        	{
		        		
		    			@Override
		                public void actionPerformed(ActionEvent e) {
		                	if (usl.getSelectedIndex() == 0) { // ���� ������� ����������� �������
		                		Standart uslovie = new Standart(); // �������� ���������� ��� ������ �� ����������� ��������
		                		uslovie.setSumm(summ.getText()); // ���������� ����� 
		                		uslovie.setSrok(srok.getText());// ���������� �����
		                		uslovie.setDosr(dosr.isSelected()); //�������� �� ��������� ���������  
		                		uslovie.raschet();
		                		
		                	} else if (usl.getSelectedIndex() == 1) { // ���� ������� ������� ��� ��������� � ������ ����������� �������  
		                		DliaZaiomshikov uslovie = new DliaZaiomshikov();// �������� ���������� ��� ������ � �������� ��� ��������� � ������ ����������� �������
		                		uslovie.setSumm(summ.getText()); // ���������� ����� 
		                		uslovie.setSrok(srok.getText());// ���������� �����
		                		uslovie.setDosr(dosr.isSelected());//�������� �� ��������� ��������� 
		                		uslovie.raschet();
		                		
		                	} else if (usl.getSelectedIndex() == 2) { // ���� ������� ������� ��� ����������� ��������-��������� 
		                		DliaSotrudnikov uslovie = new DliaSotrudnikov(); // �������� ���������� ��� ������ � �������� ��� ����������� ��������-��������� 
		                		uslovie.setSumm(summ.getText());// ���������� ����� 
		                		uslovie.setSrok(srok.getText());// ���������� �����
		                		uslovie.setDosr(dosr.isSelected());//�������� �� ��������� ��������� 
		                		uslovie.raschet();
		                	}
		            
		    			}
		    			
		        	});
		        	frame.add(button_obes); // ���������� ������ �� ������
		        } else {
		            modalDialog.setVisible(true);
		        }
		    }	
		  class DialogPanel {
			    private final Dimension DIALOG_SIZE = new Dimension(400, 50);
			    private JPanel dialogPanel = new JPanel();

			    public DialogPanel() {
			        dialogPanel.add(new JLabel("Hello from a dialog", SwingConstants.CENTER));
			        dialogPanel.setPreferredSize(DIALOG_SIZE);
			    }
		
		  public JPanel getMainPanel() {
		        return mainPanel;
		    }
		  }
	public static void main(String[] args) { // ���������� �������: http://www.mstu.edu.ru/study/materials/java/
		new MainWindow();
	}

}
