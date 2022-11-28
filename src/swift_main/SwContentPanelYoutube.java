package swift_main;

import templates.ContentPanel;
import templates.CreateHyperLinkClass;

public class SwContentPanelYoutube extends ContentPanel{

	SwContentPanelYoutube(){
		super();
		rf.writeTitle("추천 유튜버", this);
		
		new CreateHyperLinkClass("iOSAcademy의 유튜브 방문하기","https://www.youtube.com/c/iOSAcademy",this);
		new CreateHyperLinkClass("yagom의 유튜브 방문하기","https://www.youtube.com/c/yagom",this);
	}
	
	
}
