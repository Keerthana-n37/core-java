package com.xworkz.tostringandequals.toothpaste;

public class ToothPasteRunner {

    public static void main(String[] args)
    {
        ToothPaste toothPaste1 = new ToothPaste("Colgate", "Mint", 120);
        ToothPaste toothPaste2 = new ToothPaste("Closeup", "Gel", 110);
        ToothPaste toothPaste3 = new ToothPaste("Colgate", "Mint", 120);

        System.out.println(toothPaste1);
        System.out.println(toothPaste2);
        System.out.println(toothPaste3);
        boolean check = toothPaste1.equals(toothPaste3);
        System.out.println("check = " + check);
    }
}
