import java.text.Collator;
import java.util.Comparator;
import java.util.Locale;
import java.util.TreeSet;

enum Week{
	Monday, Tuesday, Sunday;
}

public class Practise1  implements Comparator<String>{
	
	static Locale   locale = Locale.UK;
	static Collator collator = Collator.getInstance(locale);
	public int compare(String str1, String str2)
    {
		if(str1.toLowerCase().equals(str2.toLowerCase())){			
			return collator.compare(str1,str2);
		}else{
			return collator.compare(str1.toLowerCase(),str2.toLowerCase());
		}
    }
	public static void main(String[] args) {
		
		System.out.println(collator.compare("systemkp","SystemKP"));
		TreeSet<String> t = new TreeSet<String>(new Practise1());
		System.out.println('S'<'s');
		t.add("systemKP");
		t.add("SystemKP");
		t.add("systemkp");
		t.add("dcs_gloss_parent1");
		t.add("dcs_gloss1");
		t.add("Maps_Sys10");
		t.add("Maps_Sys2");
		t.add("Maps_Sys4");
		t.add("systemKP");
		t.add("SystemKP");
		t.add("System111_Updated");
		t.add("system 1");
		t.add("SYS_C");
		t.add("ss");
		t.add("NewSysUpdate1");
		t.add("NewSysUpdate1");
		t.add("systemkp");
		t.add("systemKP");
		for(String s : t){
			System.out.println(s);
		}
		
		
		
	}

}
