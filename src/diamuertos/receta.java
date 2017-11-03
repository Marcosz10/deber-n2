
package diamuertos;


public class receta {
    public receta(){
       
       escoger();
    }
    Integer opcion=0;
    public void setMenu(int opciones){
        
        opcion=opciones;
        switch(opcion){
            case 1:
System.out.println(" 1 1/2 tazas Leche Semidescremada\n");
System.out.println("2 cucharadas levadura fresca\n");
System.out.println("2 1/2 cucharaditas sal\n");
System.out.println("3 cucharaditas azúcar\n");
System.out.println("1 taza mantequilla blanda\n");
System.out.println("1 kilo harina de trigo\n");
System.out.println("3 unidades huevos batidos\n");

              break;
            case 2:

 System.out.println("½ kg de harina morada\n");
 System.out.println("50 grs. de azúcar o 1 panela\n");
 System.out.println("Hojas de naranja, hierbaluisa y arrayán\n");
 System.out.println("Pimienta dulce\n");
 System.out.println("Clavo de olor\n");
 System.out.println("Canela en rama\n");
 System.out.println("1 taza de pasas\n");
 System.out.println("10 naranjillas\n");
 System.out.println("½ babaco\n");
 System.out.println("1 piña\n ");
 System.out.println("¼ kg de frutillas\n");
 System.out.println("1/2kg. de moras\n");
 System.out.println("½ kg de mortiños\n");
                break;
            default:
                System.out.println("null");
                break;
                
            
        }
    }
    
    public void escoger(){
        System.out.println("opcion 1 receta guaguas de pan\n");
        System.out.println("opcion 2 receta colada morada\n");
    }
}
