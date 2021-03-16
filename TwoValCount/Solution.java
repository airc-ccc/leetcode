package TwoValCount;

import TwoValCount.ListNode;

class Solution {

    public static void main (String[] args) {
        int[] valA = {2, 4, 6};
        int[] valB = {3, 7, 2};
        ListNode l1 = generateListNodeWithValue(valA);
        ListNode l2 = generateListNodeWithValue(valB);
        ListNode result = addTwoNumbers(l1, l2);
        while(result != null) {
          System.out.println("Val: " + result.val);

          result = result.next;
        }
    }


    public static ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode head = null, tail = null;
        int carray = 0;
        while(l1 != null || l2 != null) {
            int n1 = l1 != null ? l1.val : 0;
            int n2 = l2 != null ? l2.val : 0;
            int sum = n1 + n2 + carray;
            if (head == null) {
                head = tail = new ListNode(sum % 10);
            } else {
                tail.next = new ListNode(sum % 10);
                tail = tail.next;
            }
            carray = sum / 10;
            if (l1 != null) {
                l1 = l1.next;
            }
            if (l2 != null) {
                l2 = l2.next;
            }
        }
        if (carray > 0) {
            tail.next = new ListNode(carray);
        }
        return head;
    }



    /**
     * 生成链表
     * @param int[] valList
     * @return ListNode
     */
    public static ListNode generateListNodeWithValue(int[] valList) {
      ListNode l = null, head = null;
      if (valList.length < 1) {
          return l;
      }
      l = new ListNode(valList[0]);
      if (valList.length == 1) {
          return l;
      }
      for (int key = 1; key < valList.length; key++) {
          ListNode next = new ListNode(valList[key]);
          if (head == null) {
              l.next = head = next;
          } else {
             head.next = next; 
          }
      }
      return l;
    }
}
