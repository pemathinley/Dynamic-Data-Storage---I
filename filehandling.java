
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
public class filehandling {

	public static void main(String[] args) {
		
		
		
				
				File f=new File("C:/Users/user/Desktop/java/java/src/filehandling/pema.txt");
			
			try{
				FileInputStream fin=new FileInputStream(f);
				int i;
			i=fin.read();
				while(i!= -1)
				{
					System.out.print((char)i +" ");
					i=fin.read();
				}
				fin.close();
			}
				
				catch(IOException e)
				{
					System.out.println(e);
				}
				System.out.println();
				System.out.println(f.getPath());

			}


	}


