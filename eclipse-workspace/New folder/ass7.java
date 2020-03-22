import java.util.Scanner;

class salarycla    {
        double salary = 0;
        private void calc_salary(int arr[][], int ec)   {
            if(arr[ec][1] >= 800)   {    
                if(arr[ec][2] <= 40) {
                    salary = salary + arr[ec][1]*arr[ec][2];
                }
                else if(arr[ec][2] <= 60)   {
                    salary = salary + 40*arr[ec][1];
                    salary = salary + (arr[ec][2]-40)*1.5*arr[ec][1];
                }
                else    {
                    salary = 2; //To tell that hours >60
                }
            }
            else    {
                salary = 1;   //To tell that base pay is less than 800
            }    
        }

        public double get_sal(int[][] arr, int ec)    {
            calc_salary(arr, ec);
            return salary;
        }
    }

class employees {
    Scanner s = new Scanner(System.in);
    int[][] employ;
    int n;
    public void empcreate() {
        System.out.println("Enter the number of employees: ");
        n = s.nextInt();
        System.out.println("Enter the employee code, basepay and working hours of "+ n +" employees");
        employ = new int[n][3];
        for(int i=0; i<n; i++)  {
            for(int j=0; j<3; j++)  {
                employ[i][j] = s.nextInt();
            }
        }
    }
}

class ass7  {

    public static void main(String[] args)  {
        // int[][] emp = {{1, 750, 35}, {2, 820, 53}, {3, 820, 65}};
        Scanner s2 = new Scanner(System.in);
        salarycla a = new salarycla();
        employees b = new employees();

        b.empcreate();

        System.out.println("Enter the emp code to get salary");
        int empcode = s2.nextInt();

            int k = -1;
            for(int i=0; i<b.n; i++)    {
                if(b.employ[i][0] == empcode)   {
                    k = i;
                    break;
                }
            }

            if(k != -1) {

                double val = a.get_sal(b.employ, k);

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

              
    }

}