import java.util.*;

public class Test {
    // problem 1
    public static int [] reverseArray(int [] arr){
        int i = 0;
        int j = arr.length- 1;
        int temp;
        while(i<j){
            temp = arr[j];
            arr[j] = arr[i];
            arr[i] = temp;

        }
        return arr;
    }
    // problem 2
    public static ArrayList <String>  topKFrequent(String [] strings, int k) {
        Map<String, Integer> map = new HashMap<>();
        for (String i : strings) {
            map.put(i, map.getOrDefault(i, 0) + 1);
        }
        ArrayList<String> strs = new ArrayList<>();
        for (int i = 0; i < k; i++) {
            int max = 0;
            String st = "";
            for (String j : map.keySet()) {
                if (map.get(j) > max) {
                    max = map.get(j);
                    st = j;
                }
            }
            strs.add(st);
            map.remove(st);
            k--;
        }
        return strs;
    }
    // problem 3
    public class ListNode {
        int val;
        ListNode next;
        ListNode() {}
        ListNode(int val) { this.val = val; }
        ListNode(int val, ListNode next) {
            this.val = val;
            this.next = next;
        }
    }

    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        ListNode head;
        ListNode temp;
        ListNode temp2;
        ListNode i = list1;
        ListNode j = list2;
        if(i==null){
            return j;
        }
        if(j== null){
            return i;
        }

        if(i.val <= j.val){
            head = i;
            i = i.next;
        }
        else{
            head = j;
            j = j.next;
        }

        temp = head;

        while(i != null && j != null){
            if(i.val <= j.val){
                temp.next = i;
                i = i.next;
                temp = temp.next;
            }
            else{
                temp.next = j;
                j = j.next;
                temp = temp.next;
            }
        }

        while(i != null){
            temp.next = i;
            i = i.next;
            temp = temp.next;
        }

        while(j != null){
            temp.next = j;
            j = j.next;
            temp = temp.next;
        }

        return head;
    }

    public static void main(String [] args){
        System.out.println("");

    }
}
