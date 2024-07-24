//{ Driver Code Starts
import java.util.Scanner;
import java.util.*;

class Collections_Set_5
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while(t>0)
		{
			LinkedHashSet<Integer> s = new LinkedHashSet<Integer>() ;
			int q = sc.nextInt();
			
			while(q>0)
			{
				GfG g = new GfG();
				char c = sc.next().charAt(0);
				if(c == 'a')
				{
					int x = sc.nextInt();
					g.insert(s,x);
				}
				if(c =='b')
				{
					g.print_Contents_Increasing_Order(s);
				}
				if(c == 'c')
				{
					int x = sc.nextInt();
					g.erase(s,x);
				}
				if(c == 'd')
				{
					int x = sc.nextInt();
					System.out.print(g.find(s,x)+" ");
				}
				if(c == 'e')
				{
					System.out.print(g.size(s)+" ");
				}
				if(c=='f')
				{
					g.print_Contents_Insertion_Order(s);
				}
			q--;
			//System.out.println();
			}
		t--;
		System.out.println();
		}
	}
}
// } Driver Code Ends


/* You are required to complete below methods */
class GfG
{
    /*inserts an element x to the set s */
    void insert( LinkedHashSet< Integer > s, int x ) {
    s.add( x );
}
void print_Contents_Increasing_Order( LinkedHashSet< Integer > s ) {
    Set< Integer > t = new TreeSet( s );
    for ( Integer i : t ) System.out.print( i + " " );
}
void print_Contents_Insertion_Order( LinkedHashSet< Integer > s ) {
    for ( Integer i : s ) System.out.print( i + " " );
}
void erase( LinkedHashSet< Integer > s, int x ) {
    s.remove( x );
}
int size( LinkedHashSet< Integer > s ) {
    return s.size();
}
int find( LinkedHashSet< Integer > s, int x ) {
    return s.contains( x ) ? 1 : -1;
}
}