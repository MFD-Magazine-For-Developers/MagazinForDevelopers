package swift_main;

import templates.ContentPanel;
import templates.CreateHyperLinkClass;

public class SwContentPanelLecture extends ContentPanel{
	
	public SwContentPanelLecture(){
		super();
		rf.writeTitle("Swift 추천강의", this);
		
		new CreateHyperLinkClass("추천 강의 페이지로 이동하기 - 1","https://inf.run/cW2M",this);
		new CreateHyperLinkClass("추천 강의 페이지로 이동하기 - 2","https://inf.run/VaKj",this);
	}

}
