package chapter11;

public class BppleMP3 implements MyMP3{

	@Override
	public void playMP3() {
		System.out.println("Bpple ��ǰ�� FM �Ϻ� ����");
	}

	@Override
	public void listenFM() {
		System.out.println("Bpple ��ǰ�� mp3 ����");
	}

	@Override
	public void viewPhoto() {
		System.out.println("Bpple ��ǰ�� ���� ���� ����");
	}

	
}
