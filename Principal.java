
import java.util.Scanner;

public class Principal {
 int a,b,resultado;
 
    public Principal() {
    	leerDatos();
    	System.out.print(suma(this.a, this.b));
    }
    
    
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new Principal();
    }
	
	public void leerDatos() {
	  Scanner leer=new Scanner(System.in);
		System.out.println("Ingrese primer numero");
		this.a=leer.nextInt();
		System.out.println("Ingrese Segundo numero");
		this.b=leer.nextInt();
		query("test","clave");
		
	}
	
	public int suma(int a, int b){
		this.resultado=a+b;
		return this.resultado;
	}
	
	public String query(String user, String pass) {
		String sql="select * from tabla where users='"+user+"' and pass='"+pass+"";
		return sql;
	}
	
}
