package python_main;

import java.awt.Dimension;
import java.awt.FlowLayout;

import templates.ContentPanel;
import templates.MainPanel;
import templates.ReadingFile;


public class PythonContentPanelBook extends ContentPanel {

	public PythonContentPanelBook() {

		super();
		ReadingFile rf = new ReadingFile();
		setLayout(new FlowLayout(FlowLayout.LEFT, 100, 35));
		setBackground(MainPanel.defaultContentColor);
		setPreferredSize(new Dimension(500, 5000));
		rf.writeTitle("Python 추천 도서", this);
		rf.writeTitle("\n", this);
		
		rf.readText("TxtFiles/PythonTxt/python_book.txt", this);
		rf.readImage("images/book1.jpeg", 200, 250, this);
		
		rf.readText("TxtFiles/PythonTxt/python_book2.txt", this);
		rf.readImage("images/book2.jpeg", 200, 250, this);
		
		rf.readText("TxtFiles/PythonTxt/python_book3.txt", this);
		rf.readImage("images/book3.jpeg", 200, 250, this);

	}
}