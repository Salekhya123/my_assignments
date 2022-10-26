package com.company;
abstract class Persistence
{
   abstract void persist();
}
class FilePersistence extends Persistence
{
    public void persist()
    {
        System.out.println("data in file is stored");
    }
}
class Databasepersistence
{
    void persist()
    {
        System.out.println("Data in databse is saved");
    }
}
public class Persistentex
{
    public static void main(String[] args)
    {
     FilePersistence f=new FilePersistence();
        f.persist();
     Databasepersistence d=new Databasepersistence();
        d.persist();
    }
}
