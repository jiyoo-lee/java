import java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class Awt1 {

	/*
	 GUI 모드 : (Java7)AWT(abstract window 도구틀 ex. 계산기), 또는 SWING(AWT - 그래픽쪽으로 많이 UP)  
	 CUI 모드 : Scanner(x)
	 
	 SWING : Jframe -> Jpanel -> Jobject
	 * */
	
	public static void main(String[] args) {
		// Awt 생성 방식
		// Frame -> Panel -> Object (생성단계)
		// Frame -> ex. 팝업창
		// Panel -> 팝업창 안에 공간을 꾸미는 하얀 백지 레이어 html 백지
		// Object -> 작동시키는 것 
		// Object -> Panel -> Frame (적용단계)
		Popclose pc = new Popclose();
		
		Frame fr = new Frame(); //프레임 창 만들기
		fr.setTitle("이지유 로그인"); // 사용자 타이틀 창 이름
		fr.setSize(500, 500); // 창 크기
		fr.setVisible(true); // 사용 유무 만약false 쓰면 실행 창이 안뜸.
		fr.addWindowListener(pc); //awt 메소드를 상속받아 처리
		Panel pa = new Panel(); // 패널 만들기
		
		
		
		CheckboxGroup radio = new CheckboxGroup(); //  체크박스 그룹 설정
		
		TextField id = new TextField(10); // 입력창에 10자까지 쓸 수 있음
		TextField pw = new TextField(10);//
		TextField sa = new TextField("사원번호를 입력하세요."); // 입력값이 미리 적용됨(html = value 값과 비슷)
		Button b1 = new Button("로그인"); //오브젝트 버튼 만들기
		Checkbox c1 = new Checkbox("자동 로그인"); // 체크박스 만들기
		Checkbox c2 = new Checkbox("동의함",false, radio); // 체크박스에 실행하자마자 체크 표시가 되어있다.
		Checkbox c3 = new Checkbox("동의안함",true, radio); // 체크박스에 실행하자마자 체크 표시가 되어있다.
		
		pa.add(c3);
		pa.add(c2);
		pa.add(c1);
		pa.add(sa);
		pa.add(id);
		pa.add(pw);
		pa.add(b1); //add 추가 object를 패널에 적용
		fr.add(pa); // panel > frame에 적용
		
	}

}
class Popclose extends WindowAdapter{
	public void windowClosing(WindowEvent a) {
		System.out.println("프로그램 종료합니다.");
		System.exit(0);
		System.gc();
	}
}
