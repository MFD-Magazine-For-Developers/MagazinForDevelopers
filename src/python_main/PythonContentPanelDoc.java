package python_main;

import templates.ContentPanel;

public class PythonContentPanelDoc extends ContentPanel{

	PythonContentPanelDoc(){
		super();
		rf.writeTitle("Python 공식 문서", this); // 각 챕터의 이름입니다.
		rf.readText("TxtFiles/PythonTxt/python_docs.txt", this);
	}
	
}