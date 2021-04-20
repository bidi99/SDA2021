package pb2;
import java.util.*;

public class Main {
    private static class temp {
        private int id;
        private double temp;

        public temp(int id, double temp) {
            this.id = id;
            this.temp = temp;
        }

        public int getID() {
            return id;
        }

        public double getTemp() {
            return temp;
        }
    }
    
    static ArrayList<temp> tempp = new ArrayList<temp>();
    static ArrayList<temp> tempn = new ArrayList<temp>();
    
    public static void main(String[] args) {
        ArrayList<temp> lista = new ArrayList<temp>();
        addtemp(lista);
    }
    
    static int nr = 0;
    static Scanner x= new Scanner(System.in);
    
    
    private static void addtemp(ArrayList<temp> lista) {
        for (int i = 0; i < 5; i++) {
        	int id = i ;
            System.out.print(i+" temp : ");
            double temp = 0;
            try {
            temp = (x.nextDouble());
            }catch(Exception e) {
            	System.err.println("nu avem bo$$");
            	System.exit(0);
            }
            lista.add(new temp(id, temp));
            
        }
        for (temp list : lista) {
            
        	if(list.getTemp() <= 37) 
        		tempp.add(new temp(list.getID(),list.getTemp()));
        	else
        	    tempn.add(new temp(list.getID(),list.getTemp()));
        }
     
        System.out.print("normale sau anormale : ");
        String y = x.next();
		switch(y) {
        case "normale" : 
        	System.out.print("Temperaturile normale sunt :");        		
        	for(temp list : tempp) {
        		System.out.print("[" + list.getTemp() + ";" + list.getID() + "]");
        		nr = 1;
        	}
        	if(nr == 0)
        		System.out.println("nu avem bo$$");
        	break;
        case "anormale":
        	System.out.print("Temperaturile anormale sunt : ");
        	for(temp list : tempn) {
        		System.out.print("[" + list.getTemp() + ";" + list.getID() + "]");
        		nr = 1;
        	}
        	if(nr == 0)
        		System.out.println("nu avem bo$$");
        	break;
        }
    }
}