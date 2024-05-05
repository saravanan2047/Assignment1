package ProblemSolving;
import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;
public class PerfectSquare 
{
	    static Set<String> st=new HashSet<>();
	    public static void main(String[] args) {
	        int k=8314;
	        if(k<0){
	            System.out.println("Only positive integer!..");
	            return;
	        }
	        String s = k+"";
	        String empty = "";
	        permut(s, empty);
	        int res=(int)findPerfect();
	        String getValue=res+"";
	        System.out.println(res+" "+(s.length()-getValue.length()));
	    }
	    public static double findPerfect(){
	        double max=Integer.MIN_VALUE;
	        for(String val:st){
	            int num=Integer.parseInt(val);
	            double sqrt=Math.sqrt(num);
	            if((sqrt-Math.floor(sqrt)) == 0){
	                max=Math.max(max,num);
	            }
	        }
	        return max;
	    }
	    private static void permut(String s, String empty) {
	        if (s.isEmpty() ) {
	            if(!empty.isEmpty()) {
	                st.add(empty);
	            }
	            return;
	        }
	        permut(s.substring(1), empty + s.charAt(0));
	        permut(s.substring(1), empty);
	    }
	

}
