package chapter11;

public class TonyMP3 implements MyMP3 {

	@Override
	public void playMP3() {
		System.out.println("tony ��ǰ�� FM ���� ����");
	}

	@Override
	public void listenFM() {
		System.out.println("tony ��ǰ�� mp3 ����");
	}

	@Override
	public void viewPhoto() {
		System.out.println("tony ��ǰ�� �̹��� ��� ����");
	}

}
