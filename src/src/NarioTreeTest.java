package src;

import static org.junit.Assert.*;
import org.junit.Test;

public class NarioTreeTest {
	private NarioTree<Student> tn;

	private void setup() {
		tn = new NarioTree<>(Student.compId);
		Student st = new Student("10", null, null, 0, 0);
		tn.addNode(st, null);
		NodeNario<Student> node = tn.findNode(st);
		tn.addNode(new Student("30", null, null, 0, 0), node);
		tn.addNode(new Student("5", null, null, 0, 0), node);
		tn.addNode(new Student("60", null, null, 0, 0), node);
		node = tn.findNode(new Student("30", null, null, 0, 0));
		tn.addNode(new Student("80", null, null, 0, 0), node);
	}

	@Test
	public void testFindNode() {
		setup();
		assertNotNull(tn.findNode(new Student("10", null, null, 0, 0)));
		assertNotNull(tn.findNode(new Student("30", null, null, 0, 0)));
		assertNotNull(tn.findNode(new Student("5", null, null, 0, 0)));
		assertNotNull(tn.findNode(new Student("60", null, null, 0, 0)));
		assertNotNull(tn.findNode(new Student("30", null, null, 0, 0)));
		assertNotNull(tn.findNode(new Student("80", null, null, 0, 0)));
		assertNull(tn.findNode(new Student("100", null, null, 0, 0)));
		assertEquals(3, tn.findNode(new Student("10", null, null, 0, 0)).getChild().size());
		assertEquals("80", tn.getTree().get(2).getId());
		for (int i = 0; i < tn.getTree().size(); i++) {
			System.out.println(tn.getTree().get(i).getId());
		}
	}
}
