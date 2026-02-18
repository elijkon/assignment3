public class test {
    public static void main(String[] args) {
        song s1 = new song("Coral Crown", "Darren Korb", 4.07);
        song s2 = new song("CASANOVE POSSE", "ALI", 4.00);
        song s3 = new song("El Pibe De Mi Barrio", "Dr. Krapula", 2.47);

        System.out.println("Testing AList");

        GenericAList<song> list1 = new GenericAList<>();
        list1.addy(s1);
        list1.addy(s2);
        list1.addy(s3);

        System.out.println(list1.toString());

        System.out.println("Removing index 1");
        list1.removy(1);
        System.out.println(list1.toString());


        System.out.println("\nTesting SLList");

        GenericSLList<song> list2 = new GenericSLList<>();
        list2.addy(s1);
        list2.addy(s2);
        list2.addy(s3);

        System.out.println(list2.toString());

        System.out.println("Removing index 0");
        list2.removy(0);
        System.out.println(list2.toString());


        System.out.println("\nTesting DLList");

        GenericDLList<song> list3 = new GenericDLList<>();
        list3.addy(s1);
        list3.addy(s2);
        list3.addy(s3);

        System.out.println(list3.toString());

        System.out.println("Removing index 2");
        list3.removy(2);
        System.out.println(list3.toString());
    }
}