package Constructor;

public class Main03P204 {

	public static void main(String[] args) {
		// 웹툰 2개를 만들어서 연재 진행 및 완결까지 시켜보세요.
		// 연재 회차는 3~4회로 해주세요.
		Webtoon w1 = new Webtoon("외지주", "박태준");
		w1.uploadWbtoon();
		w1.uploadWbtoon();
		w1.uploadWbtoon();
		w1.uploadWbtoon();	
		w1.getInfo();
		w1.completWebtoon();
		w1.getInfo();
		
		Webtoon w2 = new Webtoon("갓오하", "까먹음");
		w2.uploadWbtoon();
		w2.uploadWbtoon();
		w2.uploadWbtoon();
		w2.getInfo();
		w2.completWebtoon();
		w2.getInfo();
		}
	}
