package chapter15;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.image.BufferedImage;
import java.io.FileOutputStream;
import java.io.OutputStream;

import javax.imageio.ImageIO;

public class ImageMakeEx {
	public static void main(String[] args)throws Exception {
		String str = "이 메시지를 이미지 파일로 만들겁니다.";
		//메모상에 이미지 파일 만들기
		BufferedImage image = new BufferedImage(400, 400, BufferedImage.TYPE_INT_RGB);
		//그림을 그릴 수 있는 붓을 얻어 내기
		Graphics g = image.getGraphics();
		//흰색으로 바탕 도형을 칠하기
		g.setColor(Color.WHITE);
		g.fillRect(0,  0, 400, 400);
		//파란색으로 색상을 변경하기
		g.setColor(Color.BLUE);
		//문자열을 윛에 표시하기
		g.drawString(str,  10, 100);
		//이미지를 저장할 Stream
		OutputStream out = new FileOutputStream("aaa.jpg");
		//이미지 기록
		ImageIO.write(image, "JPG", out);
		out.close();
	}
}
