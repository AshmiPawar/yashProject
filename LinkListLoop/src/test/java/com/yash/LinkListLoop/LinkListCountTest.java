package com.yash.LinkListLoop;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import com.yash.LinkListLoop.LinkListCount;

public class LinkListCountTest {

	private LinkListCount linkListCount = new LinkListCount();

	@Test
	public void shouldCountLengthOfLoopInLinkList() {
		Node head = linkListCount.newNode(1);
		head.next = linkListCount.newNode(2);
		head.next.next = linkListCount.newNode(3);
		head.next.next.next = linkListCount.newNode(4);
		head.next.next.next.next = linkListCount.newNode(5);
		head.next.next.next.next.next = head.next;

		Integer expectedCount = 4;

		Integer actualCount = linkListCount.countNodesinLoop(head);

		assertEquals(expectedCount, actualCount);

	}

	@Test
	public void shouldReturnZeroIfNoLoopIsPresentInLinkList() {
		Node head = linkListCount.newNode(1);
		head.next = linkListCount.newNode(2);

		Integer expectedCount = 0;

		Integer actualCount = linkListCount.countNodesinLoop(head);

		assertEquals(expectedCount, actualCount);

	}

	@Test
	public void shouldReturnZeroIfOneNodeIsPresentInList() {
		Node head = linkListCount.newNode(1);
		head.next = null;

		Integer expectedCount = 0;

		Integer actualCount = linkListCount.countNodesinLoop(head);

		assertEquals(expectedCount, actualCount);

	}

	@Test
	public void shouldReturnZeroIfZeroIfListHasNoElements() {
		Integer expectedCount = 0;

		Integer actualCount = linkListCount.countNodesinLoop(null);

		assertEquals(expectedCount, actualCount);

	}

}
