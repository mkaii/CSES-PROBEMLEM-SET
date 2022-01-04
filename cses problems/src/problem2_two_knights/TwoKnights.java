package problem2_two_knights;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;



public class TwoKnights {

	

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
		
		
		int n = 0;
		FastReader in=new FastReader();
		FastWriter out = new FastWriter();
		n = in.nextInt();
		
		long [] outerRing =new long[10001];
		long []twoKnightsCanAttack = new long[10001];
		long [] answer =new long[10001];
		
		outerRing[0] = 0;
		twoKnightsCanAttack[0] = 0;
		answer[0] = 0;
		
		outerRing[1] = 0;
		twoKnightsCanAttack[1] = 0;
		answer[1] = 0;
		
		outerRing[2] = 0;
		twoKnightsCanAttack[2] = 0;
		answer[2] = 6;
		
		outerRing[3] = 8;		
		twoKnightsCanAttack[3] = 8;
		answer[3] = 28;
		
		outerRing[4] = 24;		
		twoKnightsCanAttack[4] = 24;
		answer[4] = 96;
		
		outerRing[5] = 40;
		twoKnightsCanAttack[5] = 48;
		answer[5] = 252;
		
		outerRing[6] = 56;
		twoKnightsCanAttack[6] = 80;
		answer[6] = 550;
		
		//formula for outer ring for number of places two knights can attack 16k-40
		for( int k = 7;k <= n; k++)
		{
			long K=k;
			outerRing[k] = 16 * K -40;
			twoKnightsCanAttack[k] = outerRing[k] + twoKnightsCanAttack[k-2];
			answer[k] = (((K*K) * ((K*K)- 1))/2) - twoKnightsCanAttack[k];
			
		}
		
		for( int t = 1;t <= n; t++)
		{
			long ans = answer[t];
			out.println(ans);
		}

		out.close();
		
	}
}
