package python_main;

import java.awt.Dimension;
import java.awt.FlowLayout;

import templates.ContentPanel;
import templates.MainPanel;
import templates.ReadingFile;

public class PythonContentPanelChar extends ContentPanel {

	public PythonContentPanelChar() {
		super();
		ReadingFile rf = new ReadingFile();
		setLayout(new FlowLayout(FlowLayout.LEFT, 100, 35));
		setBackground(MainPanel.defaultContentColor);
		setPreferredSize(new Dimension(500, 5000));

		rf.writeTitle("Python의 특징", this);
		rf.readText("TxtFiles/PythonTxt/python_char.txt", this);
		rf.readImage("images/char.png", defaultImgWidth, 500, this);
		rf.readText("TxtFiles/PythonTxt/python_char2.txt", this);
	}
}
