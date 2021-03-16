
package Tugas;


public class managingpeople {
    
    public static void main(String[] args) {
        
        person p1 = new person("Bambang", 30);
        
        person p2 = new person("Tono", 20);
        
        
        if(p1.getAge() == p2.getAge()) {
            System.out.println(p1.getName() + " is the same age as " + p2.getName());
        } else {
            System.out.println(p1.getName() + " is NOT the same age as " + p2.getName());
        }
    }
}
