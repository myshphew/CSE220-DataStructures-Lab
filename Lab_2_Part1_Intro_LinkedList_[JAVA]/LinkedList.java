class LinkedList{
    Node head;
    public void append(Integer val){
        // TO DO: Insert node at the end
        if (head != null){
            Node currentNode = head;
            while (currentNode.next != null){
                currentNode = currentNode.next;
            }
            currentNode.next = new Node(val);
        } else {
            head = new Node(val);
        }
    }
    public void printList(){
        // TO DO: Print all elements from head
        Node currentNode = head;
        while (currentNode != null){
            System.out.print(currentNode.elem + " ");
            currentNode = currentNode.next;
        }
        System.out.println();
    }
    public void prepend(Integer val){
        // TO DO: Insert node at the beginning
        Node n = new Node(val);
        n.next = head;
        head = n;
    }
    public Node nodeAt(int indx){
        // TO DO: Return node at given index (0-based)
        Node currentNode = head;
        int count = 0;
        while (currentNode.next != null && count < indx){
            currentNode = currentNode.next;
            count++;
        }
        return currentNode;
    }
    public void removeFirst(){
        // TO DO: Remove the first node
        head = head.next;
    }
    public void removeLast(){
        // TO DO: Remove the last node
        Node currentNode = head;
        while (currentNode.next.next != null){
            currentNode = currentNode.next;
        }
        currentNode.next = null;
    }
}