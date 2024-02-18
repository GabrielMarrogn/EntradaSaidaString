import java.io.BufferedReader;
import java.io.InputStreamReader;

public class App {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder st = new StringBuilder();

        String a = br.readLine();
        String b = br.readLine();
        String c = br.readLine();

        System.out.println(a +b +c);
        System.out.println(b +c +a);
        System.out.println(c +a +b);
        
        if(a.length() > 9){
            st.append(a.substring(0, 10));
        }else{
            st.append(a);
        }

        if(b.length() > 9){
            st.append(b.substring(0, 10));
        }else{
            st.append(b);
        }

        if(c.length() > 9){
            st.append(c.substring(0, 10));
        }else{
            st.append(c);
        }

        System.out.println(st.toString());

        br.close();
    }
}
