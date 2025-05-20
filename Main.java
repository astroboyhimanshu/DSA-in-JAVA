import java.util.*;

public class Main {
  public static void main(String[] args) {
    System.out.println("Hello, World!");

    class TreeNode {
      int val;
      TreeNode left;
      TreeNode right;

      TreeNode(int x) {
        val = x;
      }
    }

    TreeNode root = new TreeNode(1);
    root.left = new TreeNode(0);
    root.right = new TreeNode(2);

    System.out.println("Root" + root.val);
    System.out.println("Root->Left" + root.left.val);
    System.out.println("Root->Right" + root.right.val);

    class ListNode {
      // Value of node
      int value;
      // Pointer to the next value
      ListNode next;

      ListNode(int x) {
        value = x;
      }
    }

    ListNode head = new ListNode(1);
    head.next = new ListNode(2);

    System.out.print(head.value);
    System.out.print(head.next.value);

    LinkedList<Integer> linkedlist = new LinkedList<>();

    linkedlist.add(19);
    linkedlist.addFirst(1);
    linkedlist.addLast(2);
    linkedlist.removeFirst();
    linkedlist.removeLast();
    int element = linkedlist.get(0);
    System.out.println("element" + element + "size " + linkedlist.size());

    Deque<Integer> deque = new ArrayDeque<>();

    deque.addFirst(1);
    deque.addFirst(2);
    deque.addLast(3);

    for (int it : deque) {
      System.out.print(it + " ");
    }

    int front = deque.peekFirst();

    int bac = deque.peekLast();
    System.out.print(bac);
    deque.size();

    // TreeMap is ordered -> Red Black Trees
    TreeMap<String, Integer> treeMap = new TreeMap<>();

    // unordered map
    HashMap<String, Integer> hashMap = new HashMap<>();

    hashMap.put("key", 1);
    hashMap.put("key2", 2);
    hashMap.put("key3", 3);
    hashMap.remove("key");

    boolean found = hashMap.containsKey("key2");
    System.out.println("Found" + found);

    boolean hasValue = hashMap.containsValue(22);
    System.out.println("Has 22? " + hasValue);

    Integer value = hashMap.get("key3");
    System.out.println("Key's value" + value);
    hashMap.size();
    System.out.println(hashMap.size());

    for (Map.Entry<String, Integer> entry : hashMap.entrySet()) {
      String key = entry.getKey();
      Integer value2 = entry.getValue();
      System.out.println("Key is " + key + " Value is " + value2);
    }

    TreeSet<Integer> treeSet = new TreeSet<>();
    HashSet<Integer> hashSet = new HashSet<>();

    hashSet.add(1);
    hashSet.add(2);
    hashSet.add(0);
    hashSet.add(12);
    hashSet.add(-19);
    treeSet.add(10);
    treeSet.add(-19);
    treeSet.add(98);
    treeSet.add(122);

    for (int i : treeSet) {
      System.out.print(i + " ");
    }

    System.out.print(" ");

    for (int j : hashSet) {
      System.out.print(j + " ");
    }

    boolean found2 = hashSet.contains(1);
    int size = hashSet.size();
    System.out.println(size);
    System.out.println(found2);

    PriorityQueue<Integer> minHeap = new PriorityQueue<>();

    minHeap.offer(1);
    System.out.println(minHeap.peek());
    int removed = minHeap.poll();
    System.out.println(minHeap.peek());
    minHeap.offer(12);
    int top = minHeap.peek();
    System.out.println(top);
    int size2 = minHeap.size();
    System.out.println(size2);

    Queue<Integer> queue = new LinkedList<>();

    queue.offer(1);
    System.out.println(queue.peek());
    queue.poll();
    System.out.println(queue.size());
    System.out.println(queue.peek());

    Stack<Integer> st = new Stack<>();

    st.push(1);
    int top2 = st.peek();
    System.out.println(top2);
    st.push(3);
    // int popped = st.pop();
    int size3 = st.size();

    System.out.println(size3);

    ArrayList<Integer> list = new ArrayList<>(Collections.nCopies(5, 10));

    for (int a : list) {
      System.out.print(a + " ");

    }

    list.add(12);

    for (int a : list) {
      System.out.print(a + " ");

    }
    list.remove(1);

    for (int a : list) {
      System.out.print(a + " ");

    }
    list.size();
    System.out.println(list.isEmpty());

    Collections.sort(list);
    for (int a : list) {
      System.out.print(a + " ");

    }
    Collections.reverse(list);
    for (int a : list) {
      System.out.print(a + " ");

    }
    System.out.println(Collections.max(list));
    Collections.min(list);

    // List<List<Integer>> adjList= new ArrayList<>();
    // int n = 10;
    // for(int i=0;i<n;i++){
    // adjList.add(new ArrayList<>());
    // }
    // adjList.get(u).add(v); // Add edge u->v

  }
}