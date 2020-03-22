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

    double salary = 0;
        private void calc_salary(LinkedList list, int ecode)   {

            Node n =  list.head;
            while(n.empcode != ecode)    {
                n = n.next;
            }

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

        public double get_sal(LinkedList l, int ecode)    {
            calc_salary(l, ecode);
            return salary;
        }
}

class lluse {
    public static void main(String[] args)  {

        Scanner s = new Scanner(System.in);
        LinkedList list = new LinkedList(); 

        System.out.println("How many employees you want to add?");
        int n = s.nextInt();
        System.out.println("Enter the employee code, basepay and working hours of "+ n +" employees:");

        for(int i=0; i<n; i++)  {
        
            int a=s.nextInt(); int b = s.nextInt(); int c = s.nextInt();
            list = list.insert(list, a, b, c);

        }

        System.out.println("Enter the employee code");
        int ecode = s.nextInt();

        double val = list.get_sal(list, ecode); 
         if( val == 1.0)   {
                    System.out.println("Base pay is less than 800");
                }
        else if(val == 2.0)   {
                    System.out.println("Hours more than 60");
                }
        else    {
                    System.out.println("Salary is: "+ val);
                }
    } 
}
