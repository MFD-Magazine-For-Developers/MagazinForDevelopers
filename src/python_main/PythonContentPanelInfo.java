package python_main;

import java.awt.Dimension;
import java.awt.FlowLayout;

import templates.ContentPanel;
import templates.MainPanel;
import templates.ReadingFile;

public class PythonContentPanelInfo extends ContentPanel {

	public PythonContentPanelInfo() {

		super();
		ReadingFile rf = new ReadingFile();
		setLayout(new FlowLayout(FlowLayout.LEFT, 100, 35));
		setBackground(MainPanel.defaultContentColor);
		setPreferredSize(new Dimension(500, 5000));

		rf.writeTitle("Python 소개", this); // 각 챕터의 이름입니다.
		rf.readText("TxtFiles/PythonTxt/python_info.txt", this);

	}

}
