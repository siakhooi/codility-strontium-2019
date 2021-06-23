package nsh.codility;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public abstract class AbstractStrontium2019Test {
	abstract Strontium2019Interface getTestObject();

	@Test
	void test01() {
		String[] words = new String[] { "aabb", "aaaa", "bbab" };
		int E = 6;

		assertEquals(E, getTestObject().solution(words));
	}

	@Test
	void test02() {
		String[] words = new String[] { "xxbxx", "xbx", "x" };
		int E = 4;

		assertEquals(E, getTestObject().solution(words));
	}

	@Test
	void test03() {
		String[] words = new String[] { "dd", "bb", "cc", "dd" };
		int E = 4;

		assertEquals(E, getTestObject().solution(words));
	}

	@Test
	void test04() {
		String[] words = new String[] { "aaaabaaaa", "aaaa", "aaab", "baaa" };
		int E = 11;

		assertEquals(E, getTestObject().solution(words));
	}

	@Test
	void test05() {
		String[] words = new String[] { "aaaabaa", "aaaa", "aaab", "baaa" };
		int E = 11;

		assertEquals(E, getTestObject().solution(words));
	}

	@Test
	void test06() {
		String[] words = new String[] { "baa", "aaaacdaaaaaa" };
		int E = 6;

		assertEquals(E, getTestObject().solution(words));
	}

	@Test
	void test07() {
		String[] words = new String[] { "a", "b", "aba", "aadaa", "aaaeaaa", "aaaaeaaaa", "aaaaafaaaaa",
				"aaaaaatyaaaaaa" };
		int E = 12;

		assertEquals(E, getTestObject().solution(words));
	}

	@Test
	void test08() {
		String[] words = new String[] { "a", "b", "abaaaa", "aadaaaaaa", "aaaeaaaaa", "aaaaeaa", "aaaaafa",
				"aaaaaatyaaa" };
		int E = 13;

		assertEquals(E, getTestObject().solution(words));
	}

	@Test
	void test09() {
		String[] words = new String[] { "a", "b", "aba", "aaaeaaa", "aaaaafaaaaa", "aatyaaaa", "aatya" };
		int E = 10;

		assertEquals(E, getTestObject().solution(words));
	}

	@Test
	void test10() {
		String[] words = new String[] { "aabaa", "aabaa", "a", "a", "t", "t", "y", "y", "ty", "ty", "t", "t", "y",
				"y" };
		int E = 6;

		assertEquals(E, getTestObject().solution(words));
	}

	@Test
	void test11() {
		String[] words = new String[] { "abbba" };
		int E = 3;

		assertEquals(E, getTestObject().solution(words));
	}

	@Test
	void test12a() {
		String[] words = new String[] { "aba", "aba", "aba" };
		int E = 2;

		assertEquals(E, getTestObject().solution(words));
	}

	@Test
	void test12b() {
		String[] words = new String[] { "aba", "aba", "aba", "aabaa", "aabaa", "aabaa", "aaabaaa", "aaabaaa",
				"aaabaaa" };
		int E = 6;

		assertEquals(E, getTestObject().solution(words));
	}

	@Test
	void test12c() {
		String[] words = new String[] { "aaab", "baaa", "aaaabaaa" };
		int E = 7;

		assertEquals(E, getTestObject().solution(words));
	}

}
