/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */

import java.util.*;

class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        int len1 = getLength(l1);
        int len2 = getLength(l2);

        int lenFinal = Math.max(len1, len2);

        int[] array1 = new int[lenFinal];
        int[] array2 = new int[lenFinal];

        ListNode curr1 = l1;
        for (int i = 0; i < len1; i++) {
            array1[i] = curr1.val;
            curr1 = curr1.next;
        }

        ListNode curr2 = l2;
        for (int i = 0; i < len2; i++) {
            array2[i] = curr2.val;
            curr2 = curr2.next;
        }

        int[] finalv = new int[lenFinal + 1];

        int carryOn = 0;

        for (int i = 0; i < lenFinal; i++) {
            int val = array1[i] + array2[i] + carryOn;
            finalv[i] = val % 10;
            carryOn = val / 10;
        }

        if (carryOn > 0) {
            finalv[lenFinal] = carryOn;
        }

        ListNode dummy = new ListNode(0);
        ListNode curr = dummy;

        int resultLength = carryOn > 0 ? lenFinal + 1 : lenFinal;

        for (int i = 0; i < resultLength; i++) {
            curr.next = new ListNode(finalv[i]);
            curr = curr.next;
        }

        return dummy.next;
    }

    private int getLength(ListNode node) {
        int length = 0;

        while (node != null) {
            length++;
            node = node.next;
        }

        return length;
    }
}