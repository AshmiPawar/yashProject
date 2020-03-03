// Java implementation of the approach 
package LinkedList;
class Rotate 
{ 
	
/* Link list node */
static class Node 
{ 
	int data; 
	Node next; 
} 

static Node push(Node head_ref, int new_data) 
{ 
	/* allocate node */
	Node new_node = new Node(); 

	/* put in the data */
	new_node.data = new_data; 

	/* link the old list off the new node */
	new_node.next = (head_ref); 

	/* move the head to point to the new node */
	(head_ref) = new_node; 
	return head_ref; 
} 

static void printList(Node node) 
{ 
	while (node != null) 
	{ 
		System.out.print(node.data + " -> "); 
		node = node.next; 
	} 
	System.out.print( "null"); 
} 

 
static Node rightRotate(Node head, int k) 
{ 
	if (head == null) 
		return head; 
	Node tmp = head; 
	int len = 1; 
	while (tmp.next != null) 
	{ 
		tmp = tmp.next; 
		len++; 
	} 
	if (k > len) 
		k = k % len; 
	k = len - k; 
	if (k == 0) 
		return head; 
	Node current = head; 
	int cnt = 1; 
	while (cnt < k && current != null) 
	{ 
		current = current.next; 
		cnt++; 
	} 
	if (current == null) 
		return head; 
	Node kthnode = current; 
	tmp.next = head; 
	head = kthnode.next; 
	kthnode.next = null; 
	return head; 
} 

// Driver code 
public static void main(String args[]) 
{ 

	/* The constructed linked list is: 
	1.2.3.4.5 */
	Node head = null; 
	head = push(head, 5); 
	head = push(head, 4); 
	head = push(head, 3); 
	head = push(head, 2); 
	head = push(head, 1); 
	printList(head);
	System.out.println();
	int k = 2; 

	// Rotate the linked list 
	Node updated_head = rightRotate(head, k); 

	// Print the rotated linked list 
	printList(updated_head); 
} 
} 

// This code is contributed by Arnub Kundu 
