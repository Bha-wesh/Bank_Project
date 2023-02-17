class File{
	public static void main(String[] args){
	File f=new File("c:\\j");
	 if(f.exists())
	{
	  if(f.isFile())
	 System.out.println("That is file");
	if(f.isDirectory())
	 System.out.println("That is Folder");
	}
	else
	System.out.println("Not");
	}
}