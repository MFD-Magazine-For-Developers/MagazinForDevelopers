package python_main;

import java.awt.Component;

import javax.swing.Box;
import javax.swing.BoxLayout;

import templates.AbstractButtonsWrapper;
import templates.IndexPanel;
import templates.MakeBtnAndPanel;

public class PythonButtonsWrapper extends AbstractButtonsWrapper {

	IndexPanel IndexPanel;

	public PythonButtonsWrapper() {

		MakeBtnAndPanel mbap = new MakeBtnAndPanel(); // 3. 버튼이랑 패널 객체를 생성하고

		mbap.method("소개", new PythonContentPanelInfo()); // 4. 인자로 버튼이름과 버튼을 누르면 나타날 패널을 넣어줍니다.
		mbap.method("특징", new PythonContentPanelChar()); // 다른 곳은 다 그대로 두고 여기 추가만 해주시면 됩니다.
		mbap.method("개발 환경", new PythonContentPanelIde());
		mbap.method("공식 문서", new PythonContentPanelDoc());
		mbap.method("추천 유튜브", new PythonContentPanelYoutube());
		mbap.method("추천 강의", new PythonContentPanelLecture());
		mbap.method("추천 도서", new PythonContentPanelBook());

		for (int i = 0; i < mbap.btnArr.size(); i++) { // 버튼을 화면에 그려주는 부분입니다.
			mbap.btnArr.get(i).setAlignmentX(Component.CENTER_ALIGNMENT);
			this.add(Box.createVerticalStrut(20));
			mbap.btnArr.get(i).setMaximumSize(maxSize);
			add(mbap.btnArr.get(i));
		}
		setVisible(true);
	}
	
	
}
