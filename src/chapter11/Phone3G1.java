package chapter11;

public class Phone3G1 implements VoiceCall, VisualCall {

	@Override
	public void sendVisualMsg() {
		// TODO Auto-generated method stub
		System.out.println("���� �޽��� ���");
	}

	@Override
	public void getVisualMsg() {
		// TODO Auto-generated method stub
		System.out.println("���� �޽��� ������");
	}

	@Override
	public void sendVoiceMsg() {
		// TODO Auto-generated method stub
		System.out.println("���� ������");
	}

	@Override
	public void getVoiceMsg() {
		// TODO Auto-generated method stub
		System.out.println("���� ����");
	}

}
