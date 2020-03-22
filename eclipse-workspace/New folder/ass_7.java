import java.util.Scanner;

class Node  {
    int empcode;
    int basepay;
    int workinghours;
    Node next;
    Node()  {
        next = null;
    }
}

class LL {
    Node head = null;

    void insert(int ec, int bp, int wh) {
        Node n = new Node();
        n.empcode = ec;
        n.basepay = bp;
        n.workinghours = wh;
        n.next = null;

        if(head == null) {
            head = n;
        }

        Node temp = head;
        while(temp.next != null)    {
            temp = temp.next;
        }
        temp.next = n;
    }
}

class salarycla    {
        double salary = 0;
        private void calc_salary(Node n)   {
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


class ass_7  {

    public static void main(String[] args)  {
        
        Scanner s2 = new Scanner(System.in);
        salarycla a = new salarycla();
        LL b = new LL();

        int i = s2.nextInt(); int j = s2.nextInt(); int k = s2.nextInt();
        while(true)  {
            s2 = new Scanner(System.in);
            System.out.println("here"+i+j+k);
            b.insert(i, j, k);
        
            i = s2.nextInt(); j = s2.nextInt(); k = s2.nextInt();
            System.out.println("here"+i+j+k);
            if(i==-1||j==-1||k==-1)
                break;
            
        }

        System.out.println("Enter the emp code to get salary");
        int ecode = s2.nextInt();
        Node temp = b.head;
        while(ecode != -1)    {
            while(temp.empcode != ecode)    {
                temp = temp.next;
            }    
        }

            if(temp != null) {

                double val = a.get_sal(temp);

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
            else    {
                System.out.println("Record not found"); 
            }
            a.salary = 0;
            ecode = s2.nextInt();
        }       
    }