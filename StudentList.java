import java.io.*;
import java.text.*;
import java.util.*;
public class StudentList {
	public static void main(String[] args)
	{

//		Check arguments

		if(args[0].equals("a"))
		{
			System.out.println("Loading data ...");
			try
			{
				BufferedReader s = new BufferedReader(new InputStreamReader(new FileInputStream("students.txt")));
				String r = s.readLine();
				String i[] = r.split(", ");
				for(String j : i)
				{ System.out.println(j); }
			} catch (Exception e){} 
			System.out.println("Data Loaded.");
		}
		else if(args[0].equals("r")) 
		{
			System.out.println("Loading data ...");			
			try
			{
				BufferedReader s = new BufferedReader(new InputStreamReader(new FileInputStream("students.txt")));
				String r = s.readLine();
				String l[] = r.split(", ");
				int y;
				y = new Random().nextInt(l.length);
				System.out.println(l[y]);
			} catch (Exception e){} 
			System.out.println("Data Loaded.");			
		}
		else if(args[0].contains("+"))
		{
			System.out.println("Loading data ...");			
			try
			{
			BufferedWriter s = new BufferedWriter(new FileWriter("students.txt", true));
			BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(new FileInputStream("students.txt")));
			String r = bufferedReader.readLine();
			String t = args[0].substring(1);
			r=r+", "+t;
			BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter("students.txt"));
			bufferedWriter.flush();
			bufferedWriter.close();
	        Date d = new Date();
	        String df = "dd/mm/yyyy-hh:mm:ss a";
	        DateFormat dateFormat = new SimpleDateFormat(df);
	        String fd= dateFormat.format(d);
			s.write(r+"\nList last updated on "+fd);
			s.close();
			} catch (Exception e){}
			System.out.println("Data Loaded.");	
		}
		else if(args[0].contains("?")) 
		{
			System.out.println("Loading data ...");			
			try {
			BufferedReader s = new BufferedReader(new InputStreamReader(new FileInputStream("students.txt")));
			String r = s.readLine();
			String i[] = r.split(",");	
			boolean done = false;
			String t = args[0].substring(1);
			for(int idx = 0; idx<i.length && !done; idx++) {
				if(i[idx].equals(t)) {
					System.out.println("We found it!");
						done=true;
				}
			}
			if(done==false)
				System.out.println("We didn't found it!");
			} catch (Exception e){} 
			System.out.println("Data Loaded.");				
		}
		else if(args[0].contains("c")) 
		{
			System.out.println("Loading data ...");			
			try {
			BufferedReader s = new BufferedReader(new InputStreamReader(new FileInputStream("students.txt")));
			String D = s.readLine();
			String l[]=D.split(", ");
			System.out.println(" word(s) found " + l.length);
			} catch (Exception e){} 
			System.out.println("Data Loaded.");				
		}
	}
}