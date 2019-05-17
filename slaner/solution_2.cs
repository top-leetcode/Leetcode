/**
 *  2. Add Two Numbers
 *  - https://leetcode.com/problems/add-two-numbers/
 *
 *  HYEWON SLANER HWANG
 **/
public class Solution {
    public ListNode AddTwoNumbers(ListNode l1, ListNode l2) {
        int[] nodeValue1 = ResolveValue(l1);
        int[] nodeValue2 = ResolveValue(l2);
        int[] nodeResult = AddTwoValues(nodeValue1, nodeValue2);

        ListNode parent = new ListNode(nodeResult[0]);
        ListNode node = parent;
        for (int i = 1; i < nodeResult.Length; i++) {
            node.next = new ListNode(nodeResult[i]);
            node = node.next;
        }

        return parent;
    }
    private int[] ResolveValue(ListNode node) {
        List<int> values = new List<int>();
        while (node != null) {
            values.Add(node.val);
            node = node.next;
        }

        return values.ToArray();
    }
    private int[] AddTwoValues(int[] value1, int[] value2) {
        int[] master = value1, slave = value2;
        if (value2.Length > value1.Length) {
            master = value2;
            slave = value1;
        }

        List<int> result = new List<int>();
        bool carry = false;
        for (int i = 0; i < master.Length; i++) {
            int sum = master[i];
            if (i < slave.Length) sum += slave[i];

            if (carry) sum++;
            carry = sum >= 10;
            result.Add(sum % 10);
        }

        if (carry) result.Add(1);
        return result.ToArray();
    }
}