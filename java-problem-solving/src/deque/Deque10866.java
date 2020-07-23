package deque;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.ArrayList;

public class Deque10866 {

	private ArrayList<Integer> deque = new ArrayList<Integer>();

	public void pushFront(int x) {
		deque.add(0, x);
	}

	public void pushBack(int x) {
		deque.add(x);
	}

	public void popFront() {
		if (deque.size() == 0) {
			System.out.println(-1);
		} else {
			System.out.println(deque.get(0));
			deque.remove(0);
		}
	}

	public void popBack() {
		if (deque.size() == 0) {
			System.out.println(-1);
		} else {
			System.out.println(deque.get(deque.size() - 1));
			deque.remove(deque.size() - 1);
		}
	}

	public void size() {
		System.out.println(deque.size());
	}

	public void empty() {
		if (deque.size() == 0) {
			System.out.println(1);
		} else {
			System.out.println(0);
		}
	}

	public void front() {
		if (deque.size() == 0) {
			System.out.println(-1);
		} else {
			System.out.println(deque.get(0));
		}
	}

	public void back() {
		if (deque.size() == 0) {
			System.out.println(-1);
		} else {
			System.out.println(deque.get(deque.size() - 1));
		}
	}

	public static void main(String[] args) throws IOException {
		
		java.util.Deque<Integer> d = new ArrayDeque<Integer>();
		d.size();
		
		Deque10866 deque = new Deque10866();

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String s = "";

		s = br.readLine();
		int count = Integer.parseInt(s);

		for (int i = 0; i < count; i++) {
			s = br.readLine();

			if (s.startsWith("push_back")) {
				String[] words = s.split(" ");
				int input = Integer.parseInt(words[1]);

				deque.pushBack(input);

			} else if (s.startsWith("push_front")) {
				String[] words = s.split(" ");
				int input = Integer.parseInt(words[1]);

				deque.pushFront(input);
			} else if (s.startsWith("front")) {
				deque.front();
			} else if (s.startsWith("back")) {
				deque.back();
			} else if (s.startsWith("size")) {
				deque.size();
			} else if (s.startsWith("empty")) {
				deque.empty();
			} else if (s.startsWith("pop_front")) {
				deque.popFront();
			} else if (s.startsWith("pop_back")) {
				deque.popBack();
			}

		}

	}

}
