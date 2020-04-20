package UI;

import java.io.FileNotFoundException;

import javax.swing.JOptionPane;

import TechServ.BlockSectionDA;

public class COMReportVersion2 {
	// constructor
	public COMReportVersion2() throws FileNotFoundException {
		BlockSectionDA BlockSectionDA = new BlockSectionDA();
	}

	public static void main(String[] args) throws FileNotFoundException {
		try {

			new COMReportVersion2();
		} catch (Exception e) {
			System.out.println(e);
		}
	}
}
