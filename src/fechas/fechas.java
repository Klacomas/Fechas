package fechas;
import java.util.Scanner;
public class fechas {

	public static void main(String[] args) {
		
				Scanner sc=new Scanner(System.in);
				
				//solicita fecha 1 y fecha 2
				System.out.println("ingrese la fecha 1 de la siguiente forma DD/MM/AAAA");
				String fecha1 =sc.nextLine();
				System.out.println("ingrese la fecha 2 de la siguiente forma DD/MM/AAAA");
				String fecha2 =sc.nextLine();
				
				//separa dia mes y año				
				int dia1 = Integer.parseInt(fecha1.substring(0, 2));
				int mes1 = Integer.parseInt(fecha1.substring(3, 5));
				int year1 = Integer.parseInt(fecha1.substring(6, 10));
				int dia2 = Integer.parseInt(fecha2.substring(0, 2));
				int mes2 = Integer.parseInt(fecha2.substring(3,5));
				int year2 = Integer.parseInt(fecha2.substring(6,10));
		
				//comienza comparación
				if(year1>year2) {//si año 1 es mayor que año 2
					System.out.println("persona 2 es mayor");
				} 
				else if(year2>year1) {;//si año 2 es mayor que año 1
					System.out.println("persona 1 es mayor");
				}
				else if (year1==year2){ //si ambos años son iguales, comparo meses;
					if(mes1>mes2) {
						System.out.println("persona 2 es mayor");
					} else if(mes2>mes1){
						System.out.println("persona 1 es mayor");
					}
					else if(mes1==mes2){ //si ambos meses son iguales, comparo días
				
						if(dia1>dia2) {
							System.out.println("persona 2 es mayor");
						} else if(dia2>dia1){
							System.out.println("persona 1 es mayor");
						}
						else if (dia1==dia2){
							System.out.println("tienen la misma edad");
						}
					}
		
				}
			}
}