package chapter15;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.io.OutputStream;

public class ObjectWriteTest {

	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub
		PersonInfo person = new PersonInfo();
		person.setAge(20);
		person.setName("Hong Gil Dong");
		person.setSsn("123456789");
		OutputStream out = new FileOutputStream("person.dat");
		ObjectOutputStream oos = new ObjectOutputStream(out);
		oos.writeObject(person);
		oos.close();
		out.close();
	}

}
