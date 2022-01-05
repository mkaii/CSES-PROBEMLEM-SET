package problem_3_two_sets;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;


public class TwoSets {
	static private class FastReader{
        BufferedReader br;
        StringTokenizer st;
        public FastReader(){
            br=new BufferedReader(new InputStreamReader(System.in));
        }
        String next(){
            while(st==null || !st.hasMoreTokens()){
                try {
                    st=new StringTokenizer(br.readLine());
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            return st.nextToken();
        }
        int nextInt(){
            return Integer.parseInt(next());
        }
        long nextLong(){
            return Long.parseLong(next());
        }
        double nextDouble(){
            return Double.parseDouble(next());
        }
        String nextLine(){
            String str="";
            try {
                str=br.readLine().trim();
            } catch (Exception e) {
                e.printStackTrace();
            }
            return str;
        }
    }
    static private class FastWriter {
		private final BufferedWriter bw;

		public FastWriter() {
			this.bw = new BufferedWriter(new OutputStreamWriter(System.out));
		}

		public void print(Object object) throws IOException {
			bw.append("" + object);
		}

		public void println(Object object) throws IOException {
			print(object);
			bw.append("\n");
		}

		public void close() throws IOException {
			bw.close();
		}
	}
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		
		int n;
		FastReader in=new FastReader();
		FastWriter out = new FastWriter();
		n = in.nextInt();
		List<Integer> arr1 = new ArrayList<Integer>();
		List<Integer> arr2 = new ArrayList<Integer>();
		
		
		try {
			if(n % 4 == 1 || n % 4 == 2)
			{
				out.println("NO");
			}
			else
			{
				out.println("YES");
				if (n % 4 == 0)
				{
					
					int num = 1;
					while (num + 3 <= n)
					{
						//fill both list
						arr1.add(num);
						arr1.add(num + 3);
						
						arr2.add(num + 1);
						arr2.add(num + 2);
						
						num = num + 4;
					}
					
					out.println(arr1.size());
					for(int x:arr1)
					{
						out.print(x);
						out.print(" ");
					}
					
					out.print("\n");
					
					out.println(arr2.size());
					for(int x:arr2)
					{
						out.print(x);
						out.print(" ");
					}
				}
				else
				{
					
					arr1.add(1);
					arr1.add(2);
					
					arr2.add(3);
					
					int num = 4;
					
					while(num + 3 <= n)
					{
						arr1.add(num);
						arr1.add(num + 3);
						
						arr2.add(num + 1);
						arr2.add(num + 2);
						
						num = num + 4;
					}
						
					out.println(arr1.size());
					
					for(int x:arr1)
					{
						out.print(x);
						out.print(" ");
					}
					out.print("\n");
					
					
					out.println(arr2.size());
					
					for(int x:arr2)
					{
						out.print(x);
						out.print(" ");
					}
				}
				
			}
			
			out.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
