package a8_24;

import a8_24.Node;

public class NodeImpl {

	Node init(String initString) {
		Node head = new Node(); // 创建一个头指针
		Node current = head;
		for (char x : initString.toCharArray()) {
			Node temp = new Node();
			temp.data = x;
			current.next = temp; // 把current 连接 起来 制定关系 的
			current = temp; // 赋值 只用这一步就行了 但是 这样每个current没有任何 关系
		}
		return head;
	}

	Node getNode(Node head, int index) {
		Node getnode = new Node();
		Node temp = head;
		int i = 0;
		while (temp.next != null && i < index) {
			temp = temp.next;
			i++;
		}
		if (temp.next == null) {
			System.out.println("集合长度不够");
		}
		getnode = temp;
		return getnode;
	}

	Node insertNode(Node head, int beforeIndex, char insertValue) {
		Node newNode = new Node();
		newNode.data = insertValue;
		Node current = getNode(head, beforeIndex);
		Node nextnode = current.next;
		current.next = newNode;
		newNode.next = nextnode;
		return head;
	}

	Node delNode(Node head, int index) {
		Node beforeDelNode = getNode(head, index - 1);
		beforeDelNode.next = getNode(head, index + 1);
		return head;
	}

	Node updateNode(Node head, int index, char value) {
		Node updateNode = getNode(head, index);
		updateNode.data = value;
		return head;
	}

	void show(Node head) {
		Node temp = head;
		while (temp.next != null) {
			temp = temp.next;
			System.out.print(temp.data);
		}
		System.out.println();
	}

	void show(String define, Node head) {
		Node temp = head;
		System.out.print(define);
		while (temp.next != null) {
			temp = temp.next;
			System.out.print(temp.data);
		}
		System.out.println();
	}

	public static void main(String[] args) {
		NodeImpl nImpl = new NodeImpl();
		Node head = nImpl.init("abcdefg");
		nImpl.show("预载:", head);
		head = nImpl.insertNode(head, 0, 'z');
		nImpl.show("新加:", head);
		head = nImpl.delNode(head, 4);
		nImpl.show("删除:", head);
		head = nImpl.updateNode(head, 5, 'x');
		nImpl.show("更新:", head);
	}
}
