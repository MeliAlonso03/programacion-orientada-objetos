package agenda;

import java.util.Scanner;

public class Consola
{
    private Scanner scan;
    public Consola()
    {
        this.scan=new Scanner(System.in);
    }
    public void displayMSG(String msgs[])
    {
        for(int i=0;i<msgs.length;i++)
            System.out.println(msgs[i]);
    }
    public void drawLine(int length)
    {
        for(int i=0;i<length;i++)
            System.out.print('-');
        System.out.println();
    }
    public int getNum(String msg)
    {
        System.out.print(msg);
        return this.scan.nextInt();
    }
    public String getString(String msg)
    {
        System.out.print(msg);
        return this.scan.nextLine();
    }
    public void limpiarBuffer()
    {
        this.scan.nextLine();
    }
}
