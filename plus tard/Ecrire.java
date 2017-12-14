String[] data = {"colis", "lettre", "mandat", "colissimo"};
File f = new File ("postes");
try
{
    FileWriter fw = new FileWriter (f);
    for (String d : data)
    {
        fw.write (String.valueOf (d));
        fw.write ("\r\n");
    }
    fw.close();
}
catch (IOException exception)
{
    System.out.println ("Erreur sur écriture : " + exception.getMessage());
}