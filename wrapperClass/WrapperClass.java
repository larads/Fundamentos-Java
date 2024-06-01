package wrapperClass;

public class WrapperClass {
    public static void main(String[] args) {
        int tipoInt = 1;
        float tipoFloat = 1.0f; 
        boolean tipoBoolean = false;

        // Classes Wrapper correspondentes
        Integer tipoInteger = Integer.valueOf(tipoInt); 
        Float tipoFloat2 = Float.valueOf(tipoFloat); 
        Boolean tipoBoolean2 = Boolean.valueOf(tipoBoolean); 

        System.out.println("Tipo primitivo int: " + tipoInt);
        System.out.println("Classe Wrapper Integer: " + tipoInteger);

        System.out.println("Tipo primitivo float: " + tipoFloat);
        System.out.println("Classe Wrapper Float: " + tipoFloat2);

        System.out.println("Tipo primitivo boolean: " + tipoBoolean);
        System.out.println("Classe Wrapper Boolean: " + tipoBoolean2);
    }
}
