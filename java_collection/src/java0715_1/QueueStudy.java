package java0715_1;

import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;

public class QueueStudy {

	public static void main(String[] args) {
		PriorityQueue<Integer> pq = new PriorityQueue<>();
		pq.offer(56);
		pq.offer(100);
		pq.offer(5);
		pq.offer(30);
		pq.offer(2);
		
		System.out.println(pq);
		
		for(int i=1; i<=5; i++) {
			System.out.println(pq.poll());
		}
		//���ڰ� �������� �켱������ ����
		
		// �����ڰ� ������ Ŭ������ ��ü���� �켱������ ���Ϸ���
		// compare�޼��带 �����ؾ��Ѵ�.
		// �������̽� Comparator�� implements �ؾ� �Ѵ�.
		
		
		
		Queue<String> q = new LinkedList<>();
		
		q.add("�ڵ�");
		q.offer("����");
		q.offer("����");
		q.offer("�챸");
		q.offer("����");
		//������ �ߺ� ���� ����
		
		System.out.println(q.poll());
		System.out.println(q);
		System.out.println(q.peek());
		System.out.println(q);
		System.out.println(q.element());
		System.out.println(q.size());
		System.out.println(q.contains("������"));

	}

}

/*
	Queue - ť
	FIFO
	������ ó���Ҷ� ���
	

*/