public class Main {
    public static void main(String[] args){
        TelephoneDirectory phoneBook = new TelephoneDirectory();
        phoneBook.add("Vasya","79123456789");
        phoneBook.add("Vasya","79123456782");
        phoneBook.add("Vasya","79123456785");
        phoneBook.add("Vasya","79123456785");

        phoneBook.add("Pasha","79123456780");

        phoneBook.add("Denis","79123456780");

        phoneBook.add("Victor","+79123456710");
        phoneBook.add("Victor","+79123426710");


        System.out.println(phoneBook.get("Vasya"));
        System.out.println(phoneBook.get("Pasha"));
        System.out.println(phoneBook.get("Denis"));
        System.out.println(phoneBook.get("Victor"));
    }



}
