import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;


public class JoinFiles {
	


	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		
		//ArrayList1 ar1 = new ArrayList1();
		
        String line;
        String line2;
        String[] strAry;
        FileReader in = null;
        BufferedReader br = null;
        ArrayList<String> t = new ArrayList<String>();
        ArrayList<String> t2 = new ArrayList<String>();
        ArrayList<String> t3 = new ArrayList<String>();
        ArrayList<ArrayList<String>> textsList=new ArrayList<ArrayList<String>>();
		
		try {
//	        in = new FileReader(args[0]);
	        in = new FileReader("test.stat");
	        br = new BufferedReader(in);
		} catch (FileNotFoundException e) {
			// TODO 自動生成された catch ブロック
			e.printStackTrace();
		}
	        
	   try {
		   int i;
		   //String tmp;
		   while ((line = br.readLine()) != null) {
			   //System.out.println(line);
			   line2 = line.replaceAll(" {2,}", " ");
			   line2 = line.replaceAll("^ ", "");
			   //System.out.println(line2);
			   strAry = line2.split(" ");
			   i=0;
			   for(String s : strAry){
				   if(i==0)
					   t.add(s);
				   else if(i==1){
					   t2.add(s);
					   t3.add(line);
				   }
					   

				   i++;
			   }
			   textsList.add(t);
			   textsList.add(t2);
			   textsList.add(t3);


			   //break;
		   }
		   		   
//		   while ((line = br.readLine()) != null) {
//			   System.out.println(line);
//			   line2 = line.replaceAll(" {2,}", " ");
//			   System.out.println(line2);
//			   strAry = line2.split(" ");
//			   i=0;
//			   for(String s : strAry){
//				   if(i==1)
//					   t.add(s);
//				   if(i==2){
//					   t2.add(s);
//					   t3.add(line);
//				   }
//					   
//
//				   i++;
//			   }
//			   textsList.add(t);
//			   textsList.add(t2);
//			   textsList.add(t3);
//
//
//			   //break;
//		   }
		   System.out.println("s");
		   System.out.println(textsList.get(3).get(1));
		   System.out.println("e");
	   } catch (IOException e1) {
				// TODO 自動生成された catch ブロック
				e1.printStackTrace();
	   }
	   
	   System.out.println(textsList.size());
	   
	   for(int j=0;j<6;j++){
		   for(int k=0;k<3;k++){
			   System.out.println(j + " " + k + " = " + textsList.get(k).get(j));
		   }
	   }
	   
	   
	   System.out.println(t.indexOf("3"));
	   System.out.println(t2.indexOf("CbrApp_cbr1_BytesReceived"));

	}

}
