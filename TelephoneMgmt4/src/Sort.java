import java.util.Collections;
import java.util.Comparator;
import java.util.Vector;

public class Sort {
	private Vector<Telephone> vector;

	public Sort(Vector<Telephone> vector) {
		this.vector = vector;
	}

	public void sort() {
		// Collections.sort(this.vector); // 오름차순
		// Collections.reverse(vector); // 내림차순
		// Collections.sort(this.vector, new MySort());
		Collections.sort(this.vector, new Comparator<Telephone>() {
			@Override
			public int compare(Telephone me, Telephone you) {
				return me.compareTo(you) * -1;

			}
		});
	}

	/*
	 * private class MySort implements Comparator <Telephone>{ // 바깥에서 접근 불가능
	 * 
	 * @Override public int compare(Telephone me, Telephone you) { return
	 * me.compareTo(you) * -1; // 밑의 3줄을 1줄로 표현할 수 있다
	 * 
	 * //if(me.getFee() > you.getFee()) return 1; // 오름차순(1) //else if (me.getFee()
	 * < you.getFee()) return -1; // 내림차순(-1) //else return 0;
	 * 
	 * }
	 * 
	 * }
	 */

}
