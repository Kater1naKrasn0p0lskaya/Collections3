public class Main {
    public static void main(String[] args) {
      /*  String [] employees = {
                "Oleg",
                "Masha",
                "Natasha",
                "Igor",
                "Ivan"
        };
        String [] second = new String[employees.length +1];
        for(int i = 0; i < employees.length; i++){
            second[i] = employees[i];
        }
        second[second.length-1] = "Kate";
        employees = second;
        for(String name: employees){
            System.out.println(name);

        }*/
        MyArrayList MyArrayList = new MyArrayList();
        MyArrayList.add("Oleg");
        MyArrayList.add("Masha");
        MyArrayList.add("Natasha");
        MyArrayList.add("Igor");
        MyArrayList.add("Ivan");
        for(int i = 0; i< MyArrayList.getSize(); i++){
            System.out.println(MyArrayList.getArray()[i]);
        }
        System.out.println(MyArrayList.get(9));
        System.out.println(MyArrayList.get(4));
    }
}