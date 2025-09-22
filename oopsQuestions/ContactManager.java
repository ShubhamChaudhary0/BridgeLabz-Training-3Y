import java.util.*;

public class ContactManager {
    static HashMap<String,String> contacts=new HashMap<>();
    public static void add(String name,String phone){
        if (!phone.matches("\\d+")) { System.out.println("Invalid phone!"); return; }
        contacts.put(name,phone);
    }
    public static void search(String name){
        System.out.println(contacts.getOrDefault(name,"Not Found"));
    }
    public static void delete(String name){ contacts.remove(name); }
    public static void main(String[] args){
        add("Gaurav","1234567890");
        add("Amit","abcd"); // invalid
        search("Gaurav");
        delete("Gaurav");
        search("Gaurav");
    }
}
