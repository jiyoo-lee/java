import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.net.URL;

//크롤링2
public class Net4thisfile {

	public static void main(String[] args) throws Exception {

		String page = "https://www.kr.playblackdesert.com/ko-KR/Main/Index";	
		URL url = new URL(page); 
		/* Stream을 사용하면 read만 사용(byte이용)inputStreamReader도 해당 , Reader readLine(String) 
		 * flush()사용형태 : BufferedOutputStream에 사용한다 */
		
		InputStream is = url.openStream(); 
		BufferedInputStream bs = new BufferedInputStream(is); //배열 byte[]
		byte html[] = new byte[1024];
		FileOutputStream fs = new FileOutputStream("game.html"); //배열 값을 로드해서 저장
		
		//BufferedOutputStream os = new BufferedOutputStream(new FileOutputStream("game.html"));
		// 얘는 사용하려면 os.flush를 써주어야한다.
		int s = 0;
		while((s=bs.read(html)) != -1) { //String이면 null int면 -1
			//Stream은 read의 byte배열명을 입력
			fs.write(html,0,s);
		}
		is.close();
		bs.close();
		fs.close();
	}
}
