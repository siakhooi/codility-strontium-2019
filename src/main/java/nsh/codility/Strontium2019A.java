package nsh.codility;

public class Strontium2019A implements Strontium2019Interface {

	class Node {
		int left, right, middle;
		int bigLeft, bigRight;
		int within;

		void add(int m) {
			middle += m;
		}

		void setWithin(int w) {
			within = Math.max(w, within);
		}

		void add(int l, int r) {
			if (l == 0 && r > right)
				right = r;
			else if (r == 0 && l > left)
				left = l;
			else if (l < left && r > right)
				right = r;
			else if (r < right && l > left)
				left = l;
			else if (l >= left && r >= right) {
				addBig(l, r);
				return;
			}
			updateBig();
		}

		void updateBig() {
			if (bigLeft == 0)
				return;
			if (left >= bigLeft) {
				if (bigRight > right)
					right = bigRight;
				bigLeft = 0;
			} else if (right >= bigRight) {
				if (bigLeft > left)
					left = bigLeft;
				bigLeft = 0;
			}
		}

		void addBig(int l, int r) {
			if (bigLeft == 0) {
				bigLeft = l;
				bigRight = r;
			} else {
				if (l >= bigLeft && r >= bigRight) {
					left = bigLeft;
					right = bigRight;
					bigLeft = l;
					bigRight = r;
				} else if (l < bigLeft && r < bigRight) {
					left = l;
					right = r;
				} else {
					left = Math.max(l, bigLeft);
					right = Math.max(r, bigRight);
					bigLeft = 0;
				}
			}
		}
	}

	public int solution(String[] words) {
		int N = words.length;
		Node[] n = new Node[26];
		for (int i = 0; i < 26; i++)
			n[i] = new Node();

		for (int i = 0; i < N; i++) {
			char[] s = words[i].toCharArray();
			int l = 0, r = 0, c = 0;

			char b = 'a' - 1;
			char a = b;

			for (int j = 0; j < s.length; j++) {
				if (j == 0) {
					b = s[0];
					a = b;
					c = 1;
					continue;
				}
				if (b == s[j])
					c++;
				else {
					if (j == c)
						l = j;
					else
						n[b - 'a'].setWithin(c);
					b = s[j];
					c = 1;
				}
			}
			if (c == s.length)
				n[b - 'a'].add(c);
			else {
				r = c;
				if (a == b)
					n[b - 'a'].add(l, r);
				else {
					n[a - 'a'].add(l, 0);
					n[b - 'a'].add(0, r);
				}
			}
		}

		int R = 0;
		for (int i = 0; i < 26; i++) {
			Node m = n[i];
			R = Math.max(R, m.within);
			if (m.bigLeft > 0)
				R = Math.max(R, m.middle + Math.max(m.bigLeft + m.right, m.bigRight + m.left));
			else
				R = Math.max(R, m.left + m.middle + m.right);
		}

		return R;
	}
}
