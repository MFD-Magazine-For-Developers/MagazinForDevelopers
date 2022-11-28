package swift_main;

import templates.ContentPanel;
import templates.CreateHyperLinkClass;

public class SwContentPanelDoc extends ContentPanel {

	SwContentPanelDoc(){
		super();
		rf.writeTitle("Swift 공식문서", this);
		rf.readText("TxtFiles/SwiftTxt/swift_doc.txt",this );
		
		new CreateHyperLinkClass("공식 문서 페이지로 이동하기","https://www.swift.org/",this);

	}
	
}
