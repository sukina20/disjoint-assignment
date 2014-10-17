import java.io.*;
class Node
{
	int data;
	Node next;
	Node prev;
	Node() throws IOException
	{
		prev=null;
		next=null;
	}
	Node(int d) throws IOException
	{
		data=d;
		prev=null;
		next=null;
	}

}

public class Double11
{
	Node head;
	Node tail;
	Double11() throws IOException	 
	{
		head=null;
		tail=null;
	}
	public static void main(String args[]) throws IOException
	{

		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		int d;
		Node head=null;
		Node tail=null;
		Double11 l=new Double11();
		Double11 l2=new Double11();
		Double11 l3=new Double11();
		System.out.println("Enter the number of elements in first disjoint set");
		int n=Integer.parseInt(br.readLine());
		for(int i=0;i<n;i++)
		{
			System.out.println("enter the data");
			d=Integer.parseInt(br.readLine());
			l.insertf(d);
		}
		l.trav();
		System.out.println("Enter the element for which representative to be found");
		int k=Integer.parseInt(br.readLine());
		l.findmin();
		System.out.println("\n Enter the number of elements in second disjoint set");
                int n1=Integer.parseInt(br.readLine());
                for(int i=0;i<n1;i++)
                {
                	System.out.println("enter the data");
                	d=Integer.parseInt(br.readLine());
                	l2.insertf(d);
                }
		l2.trav();
		System.out.println("Enter the element for which representative to be found");
		int k1=Integer.parseInt(br.readLine());
		l2.findmin();
		System.out.println("PERFORMING UNION OPERATION");
		System.out.println("Enter the number of elements in first disjoint set");
		int n3=Integer.parseInt(br.readLine());
		for(int i=0;i<n3;i++)
		{
			System.out.println("enter the data");
			d=Integer.parseInt(br.readLine());
			l3.insertf(d);
		}
		l3.trav();
		System.out.println("\n Enter the number of elements in second disjoint set");
                int n4=Integer.parseInt(br.readLine());
                for(int i=0;i<n4;i++)
                {
                	System.out.println("enter the data");
                	d=Integer.parseInt(br.readLine());
                	l3.insertf(d);
                }
		l3.trav();
		l3.findmin();
	}
	void trav() throws IOException	
	{

		Node t=head;
		while(t!=null)
		{

			System.out.print("<--->"+t.data);
			t=t.next;

		}
	}
	void findmin()throws IOException
	{
		Node t=head;
		int m=t.data;
		while(t!=null)
		{
			if(t.data<m)
			m=t.data;
			t=t.next;
		
		}
		
		System.out.println("\n Representative is\t"+m);
	}	
	
	void insertf(int d) throws IOException
	{
		Node p=new Node(d);
		if(head==null)
		{

			head=tail=p;
		}

		else

		{
			p.next=head;
			head.prev=p;
			head=p;
			

		}
	}
	
}
