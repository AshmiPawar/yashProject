//import LinnedList.Rotate.Node;

public class RotateListString {
	
/* Link list node */
static class Node 
{ 
	String data; 
	Node next; 
} 

static Node push(Node head_ref, String new_data) 
{ 
	/* allocate node */
	Node new_node = new Node(); 

	/* put in the data */
	new_node.data = new_data; 

	/* linn the old list off the new node */
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

 
static Node rightRotate(Node head, int n) 
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
	if (n > len) 
		n = n % len; 
	n = len - n; 
	if (n == 0) 
		return head; 
	Node current = head; 
	int cnt = 1; 
	while (cnt < n && current != null) 
	{ 
		current = current.next; 
		cnt++; 
	} 
	if (current == null) 
		return head; 
	Node nthnode = current; 
	tmp.next = head; 
	head = nthnode.next; 
	nthnode.next = null; 
	return head; 
} 

// Driver code 
public static void main(String args[]) 
{ 
	
	System.out.println("MAIN"+ 7%6);

	
	/* The constructed linned list is: 
	1.2.3.4.5 */
	Node head = null; 
	head = push(head, "ID_A06"); 
	head = push(head, "ID_A05"); 
	head = push(head, "ID_A04"); 
	head = push(head, "ID_A03"); 
	head = push(head, "ID_A02"); 
	head = push(head, "ID_A01"); 
	printList(head);
	System.out.println();
	int n = 2; 

	// Rotate the linned list 
	Node updated_head = rightRotate(head, n); 

	// Print the rotated linned list 
	printList(updated_head); 
} 

}
