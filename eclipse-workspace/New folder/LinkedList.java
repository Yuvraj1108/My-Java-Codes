import java.util.Scanner;

class LinkedList { 
  
    Node head; 

    class Node { 
  
        int empcode;
        int basepay;
        int workinghours; 
        Node next; 
  
        // Constructor 
        Node(int i, int j, int k) 
        { 
            empcode = i;
            basepay = j;
            workinghours = k; 
            next = null; 
        } 
    } 
  
    public LinkedList insert(LinkedList list, int ec, int bp, int wh) 
    {  
        Node new_node = new Node(ec, bp, wh); 
        new_node.next = null; 
  
        if (list.head == null) { 
            list.head = new_node; 
        } 
        else {  
            Node last = list.head; 
            while (last.next != null) { 
                last = last.next; 
            } 
            last.next = new_node; 
        } 
        return list; 
    }
    public void printList(LinkedList list) 
    { 
        Node currNode = list.head; 
   
        System.out.print("LinkedList: "); 
   
        while (currNode != null) {  
            System.out.print(currNode.empcode + " "); 
            currNode = currNode.next; 
        } 
    }

    class salarycla    {
        double salary = 0;
        private static void calc_salary(Node n)   {
            if(n.basepay >= 800)   {    
                if(n.workinghours <= 40) {
                    salary = salary + n.basepay*n.workinghours;
                }
                else if(n.workinghours <= 60)   {
                    salary = salary + 40*n.basepay;
                    salary = salary + (n.workinghours-40)*1.5*n.basepay;
                }
                else    {
                    salary = 2; //To tell that hours >60
                }
            }
            else    {
                salary = 1;   //To tell that base pay is less than 800
            }    
        }

        public double get_sal(Node n)    {
            calc_salary(n);
            return salary;
        }
    } 

    public static void main(String[] args)  {


        LinkedList list = new LinkedList(); 

        list = insert(list, 1, 45,67); 
        list = insert(list, 2,234, 456); 
        list = insert(list, 3, 456, 432); 
        list = insert(list, 4, 76, 345); 

        printList(list); 
    } 
    
}  