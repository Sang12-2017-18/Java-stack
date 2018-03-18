/*Program to implement array-stack in java*/ 
import java.util.Scanner;
public class sang13 {
       public static int[] A=new int[100];
       public static int top=-1;
       public static void main(String []args) 
                         {
                            Scanner var=new Scanner(System.in); 
                            int x,ch;
                            char ch1; 
                            System.out.println("MENU OF STACK OPERATIONS");
                            System.out.printf("1.Push\n2.Pop\n3.Display\n");
                            do 
                            { 
                                System.out.printf("Enter your choice: ");
                                ch=var.nextInt();
                                switch(ch)
                                {
                                    case 1: System.out.printf("Enter data: ");
                                            x=var.nextInt();
                                            push(x);
                                            break ;
                                    case 2: pop();
                                            break ;
                                    case 3: display();
                                            break ;
                                    default:System.out.printf("Invalid option\n");
                                            break;
                                }
                                System.out.printf("Do you want to continue?: ");
                                ch1=var.next().charAt(0); 
                            }while(ch1=='y' || ch1=='Y'); //end of do while loop  
                         }//end of main function 
              static void push(int x)
                         {
                            if(top==-1)
                                top=0;
                            else if(top==99)
                            {
                                System.out.println("Cannot Insert");
                                return ;
                            } 
                            else top++ ;
                            A[top]=x ;
                         }
              static void pop()
                         {
                            if(top==-1)
                            {
                                System.out.println("Stack is empty");
                                return ;
                            }
                            else
                            {
                                System.out.printf("The element to be deleted is:%d\n",A[top]) ;
                                top--;
                            }
                         }
              static void display()
                         {
                            if(top==-1)
                            {
                                System.out.println("Stack is empty");
                                return ;
                            }
                            else
                            {
                               System.out.println("The stack is: ");
                               int t=top;
                               while(t>=0)
                               {
                                  System.out.printf(A[t]+"->");
                                  t--;
                               }
                               System.out.printf("end\n");
                            }
                         }
               }//end of main class 
