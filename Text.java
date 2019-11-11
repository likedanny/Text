//节点类
class ListNode{
    public int data;
    public ListNode next;
    public ListNode(int date){
        this.data = data;
        this.next = null;
    }
}
//标志头
class SingleList {
    public ListNode head;
    public SingleList() {
        this.head = null;
    }
    //打印单链表数据
    public void diyplay() {
        if (this.head == null) {
            return;
        }
        ListNode cur = this.head;
        while (cur != null) {
            System.out.print(cur.data + " ");
            cur = cur.next;
        }
        System.out.println();
    }
    //头插法
    public void addFirst(int data) {
        ListNode node = new ListNode(data);
        if (this.head == null) {
            this.head = node;
        } else {
            node.next = this.head;
            this.head = node;
        }
    }
}
