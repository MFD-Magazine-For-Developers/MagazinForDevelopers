package python_main;

import java.awt.Dimension;
import java.awt.FlowLayout;

import templates.ContentPanel;
import templates.MainPanel;
import templates.ReadingFile;

public class PythonContentPanelIde extends ContentPanel {

	public PythonContentPanelIde() {

		super();
		ReadingFile rf = new ReadingFile();
		setLayout(new FlowLayout(FlowLayout.LEFT, 100, 35));
		setBackground(MainPanel.defaultContentColor);
		setPreferredSize(new Dimension(500, 5000));

		rf.writeTitle("Python 개발 환경", this); // 각 챕터의 이름입니다.
		rf.readText("TxtFiles/PythonTxt/python_ide.txt", this);
	}

}
