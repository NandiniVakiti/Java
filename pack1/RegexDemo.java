package pack1;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexDemo {

	public static void main(String[] args) {
		
		String phnNo = "+ 91 124 2641407 (International call rates applicable)";
       // System.out.println(Pattern.matches("\\+\\s\\d{2}\\s\\d{3}\\s\\d{7}\\s.*", phnNo));//pattern
        System.out.println();
        Pattern pattern1 = Pattern.compile("\\+\\s(\\d{2})\\s(\\d{3})\\s(\\d{7})\\s.*");//PATTERN
        Matcher matcher1 = pattern1.matcher(phnNo);//string
        System.out.println(matcher1.matches());//true
        
        System.out.println(matcher1.group());
        System.out.println(matcher1.group(1));
        System.out.println(matcher1.group(2));
        System.out.println(matcher1.group(3));
       
		
		// 2nd question
		
		String Num = "011 24667473 (Monday to Friday ,0930 hrs - 1730 hrs IST)";
		//System.out.println(Pattern.matches("\\d{3}\\s\\d{8}\\s.*", Num));//pattern matches
		System.out.println();
		Pattern pattern2 = Pattern.compile("(\\d{3})\\s(\\d{8})\\s.*");//pattern compile
		Matcher matcher2 = pattern2.matcher(Num);//String
		System.out.println(matcher2.matches());//true
		
		System.out.println(matcher2.group());
        System.out.println(matcher2.group(1));//011
        System.out.println(matcher2.group(2));//24667473
        //System.out.println(matcher2.group(3));
        
        // 3rd question
        
        String str2 = "flyingreturn.base@airindia.in";
       // System.out.println(Pattern.matches("\\w{12}\\.\\w{4}\\@\\w{8}\\.\\w{2}", str2));
        System.out.println();
        Pattern pattern3 = Pattern.compile("(\\w{12})\\.(\\w{4})@(\\w{8})\\.(\\w{2})");
        Matcher matcher3 = pattern3.matcher(str2);
        System.out.println(matcher3.matches());
        
        System.out.println(matcher3.group());
        
        //  4th question
        String str3 = "mr.";
        System.out.println();
        Pattern pattern4 = Pattern.compile("(\\w{2})\\.");
        Matcher matcher4 = pattern4.matcher(str3);
        System.out.println(matcher4.matches());
        
        System.out.println(matcher4.group());
        
        // 5th question
        
        String str4 = "mrs.";
        System.out.println();
        Pattern pattern5 = Pattern.compile("(\\w{3})\\.");
        Matcher matcher5 = pattern5.matcher(str4);
        System.out.println(matcher5.matches());
        
        System.out.println(matcher5.group());
        
        // 6th question
        
        String str5 = "0124-2641407";
       // System.out.println(Pattern.matches(("\\d{4}-\\d{7}"), str5));
        System.out.println();
        Pattern pattern6 = Pattern.compile("(\\d{4})-(\\d{7})");
        Matcher matcher6 = pattern6.matcher(str5);
        System.out.println(matcher6.matches());
        
        System.out.println(matcher6.group());
        System.out.println(matcher6.group(1));
        System.out.println(matcher6.group(2));
        
        // 7th question
        
        String str6= "613 701 98270 (Toll Number) #";
      //  System.out.println(Pattern.matches(("\\d{3}\\s\\d{3}\\s\\d{5}\\s.* #"),str6));
        System.out.println();
        Pattern pattern7 = Pattern.compile("(\\d{3})\\s(\\d{3})\\s(\\d{5})\\s.* #");
        Matcher matcher7 = pattern7.matcher(str6);
        System.out.println(matcher7.matches()); 
        
        System.out.println(matcher7.group());
        System.out.println(matcher7.group(1));
        System.out.println(matcher7.group(2));
        System.out.println(matcher7.group(3));
        
        //8th question
        
        String str7= "golden.edge@airindia.in";
        System.out.println();
        Pattern pattern8 = Pattern.compile("(\\w{6})\\.(\\w{4})@(\\w{8})\\.(\\w{2})");
        Matcher matcher8 = pattern8.matcher(str7);
        System.out.println(matcher8.matches()); 
        
         System.out.println(matcher8.group());
        
         // 9th question
         
         String str8= "contactus@airindia.in";
         System.out.println();
         Pattern pattern9 = Pattern.compile("(\\w{9})@(\\w{8})\\.(\\w{2})");
         Matcher matcher9 = pattern9.matcher(str8);
         System.out.println(matcher9.matches()); 
         
          System.out.println(matcher9.group()); 
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
		
		
		
        
        
        
        
        
        
        
	}

}
