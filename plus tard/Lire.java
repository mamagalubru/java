File f = new File ("postes");
try
{
	FileReader fr = new FileReader (f);
    int c = 0;
    while (c != -1)
    {
        System.out.print ((char) c);
        c = fr.read();
    }
}
catch (IOException exception)
{
    System.out.println ("Erreur lors de la lecture : " + exception.getMessage());
}