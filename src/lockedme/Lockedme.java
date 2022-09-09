package lockedme; 

	import java.io.File;
	import java.io.FileWriter;
	import java.util.LinkedList;
	import java.util.Scanner; 
	public class Lockedme
	{ 
	static final String projectpath = "C:\\java session\\LockedMe.com\\Project files";

	 public static void main(String[] args) 
	{      Scanner obj = new Scanner(System.in); 
	int ch;    

	do
	{
	displayMenu(); 
	 System.out.println("Enter your choice:"); 
	ch=Integer.parseInt(obj.nextLine());   

	  switch(ch)  
	{    case 1: getAllFiles();   
	  break;  
	 case 2: createFiles();    
	 break;  
	 case 3: deleteFiles();   
	  break;   
	case 4: searchFiles();   
	  break;   
	case 5: System.exit(0);  
	   break;  
	   
	 default:{ System.out.println("Invalid Option");} 
	    break;
	}
	}
	while(ch>0);}
	public static void displayMenu()   
	  { 
	System.out.println("***************************************************"); 
	 System.out.println("\tHello Welcome to LockedMe.com");  
	System.out.println("\tDeveloper Name: Phani Pulicharla"); 
	System.out.println("***************************************************"); 
	 System.out.println("\t1. Display all the files");
	  System.out.println("\t2. Add files to existing directory"); 
	 System.out.println("\t3. Delete a file"); 
	 System.out.println("\t4. Search a file"); 
	 System.out.println("\t5. Exit"); 

	System.out.println("***************************************************"); 
	}   
	public static void getAllFiles() 
	{  
	File[] listOfFiles = new File(projectpath).listFiles();      
	//if the folder is empty 

	 if(listOfFiles.length==0)  
	 System.out.println("No files exist in the directory"); 
	 else   
	{ 
	  for(var l:listOfFiles)  
	{     System.out.println(l.getName());   }
	   }
	  }   
	public static void createFiles()
	 {  
	try 
	 {    Scanner obj = new Scanner (System.in); 

	  String fileName; 
	  int linesCount;      

	 System.out.println("Enter file name:"); 
	  fileName=obj.nextLine();      

	 System.out.println("Enter how many lines you want to add in file"); 
	  linesCount=Integer.parseInt(obj.nextLine());       

	FileWriter fw = new FileWriter(projectpath+"\\"+fileName);  
	     for(int i=1;i<=linesCount;i++) 

	  {     System.out.println("Enter file content line:");  
	         fw.write(obj.nextLine()+"\n");   
	}    

	   System.out.println("Congrats!File Created Successfully");  
	 fw.close(); 
	} 
	 catch (Exception ex)  
	{    System.out.println("Some error occured.");  
	    }      
	  }   
	 public static void deleteFiles()

	 {   Scanner obj = new Scanner(System.in);
	  try  
	{    String fileName;  

	 System.out.println("Enter file name to be deleted:"); 

	  fileName=obj.nextLine();     
	  File fl = new File(projectpath+"\\"+fileName); 

	if(fl.exists())  
	 {     fl.delete();  

	  System.out.println("File deleted successfully"); 
	  } 
	  else 
	  {     System.out.println("Sorry..File does not exist");  
	 } 
	 }  
	catch(Exception Ex)  
	{    System.out.println("Some error occured");   } 

	}   
	public static void searchFiles()
	{
	 Scanner obj = new Scanner(System.in);
		try 
	{   
		 LinkedList<String> fileNames = new LinkedList<String>(); 
				     
			   String fileName;  

			   System.out.println("Enter file name to be searched:"); 
			   fileName=obj.nextLine();   	  
			   
			  File[] listOfFiles = new File(projectpath).listFiles();
			   for (File l: listOfFiles)
			   {
				   
				   fileNames.add(l.getName());
			   
			   }
				if (fileNames.contains(fileName))   
			{  System.out.println("file is available");	}
	else  {
			   System.out.println("Sorry the file you’re looking is not available");
				      }
			   } 
			   catch(Exception Ex)  
			   {		   
		   }
		}
	}



