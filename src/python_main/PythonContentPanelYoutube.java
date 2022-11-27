package python_main;

import java.awt.Dimension;
import java.awt.FlowLayout;

import templates.ContentPanel;
import templates.MainPanel;
import templates.ReadingFile;

public class PythonContentPanelYoutube extends ContentPanel {

	public PythonContentPanelYoutube() {
		super();
		ReadingFile rf = new ReadingFile();
		setLayout(new FlowLayout(FlowLayout.LEFT, 100, 35));
		setBackground(MainPanel.defaultContentColor);
		setPreferredSize(new Dimension(500, 5000));

		rf.writeTitle("Python 추천 유튜브", this);
		rf.readText("TxtFiles/PythonTxt/python_youtube.txt", this);

	}

}
