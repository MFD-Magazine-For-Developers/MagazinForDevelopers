package java_main;

import templates.ContentPanel;

public class JContentPanelInfo extends ContentPanel {

	public JContentPanelInfo() {

		super();

		rf.writeTitle("Java소개", this); // 각 챕터의 이름입니다.
		rf.readImage("images/java.gif", 200, 200, this);
		rf.readText("TxtFiles/JavaTxt/Java_info.txt", this);

	}

}