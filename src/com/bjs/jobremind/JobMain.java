package com.bjs.jobremind;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.swing.JOptionPane;
import javax.swing.SwingUtilities;

public class JobMain {

	public static void main(String[] args) {
		SwingUtilities.invokeLater(new Runnable() {
			public void run() {
				createAndShowGUI();
			}
		});
	}

	private static void createAndShowGUI() {

		DateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		JOptionPane.showMessageDialog(null, "现在是" + sdf.format(new Date()),"上班打卡", JOptionPane.INFORMATION_MESSAGE);
		
		try {
			Thread.sleep(5*1000);
//			Thread.sleep(60 * 1000*60*9);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		JOptionPane.showConfirmDialog(null, "现在可以下班了！！", "下班啦",
				JOptionPane.OK_OPTION);
	}
}
