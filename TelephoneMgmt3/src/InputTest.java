import static org.junit.Assert.*;

import org.junit.Test;

public class InputTest {

	@Test
	public void test() {
		Telephone [] array = new Telephone[2];
		Input input = new Input(array);
		input.input(); // 2     422-5123   ������    1084
		assertEquals("111-1111", array[1].getTel());               // "������" : ����  , getName() : ������
	}

}
