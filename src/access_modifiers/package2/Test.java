package access_modifiers.package2;

//import access_modifiers.package1.BMW;
import access_modifiers.Table;
import access_modifiers.package1.Honda;

public class Test {
    public static void main(String[] args) {
        //we are able to create objects from public classes  anywhere in our project
        //BMW b1 = new BMW();//is not accessible from another package if it is frm default class
        Honda h1 = new Honda();

        Table.DinnerTable.dinnerTableMethod();



    }
}
