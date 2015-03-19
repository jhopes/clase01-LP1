
import controlador.ClsVehiculo;
import modelo.vehiculo;

public class principal {

    
    public static void main(String[] args) {
        vehiculo v = new vehiculo();
        ClsVehiculo cv= new ClsVehiculo();
        
        v.setPlaca("RX-1587");
        v.setMarca("TOYOTA");
        v.setModelo("HIACE");
        
        System.out.println(v.getPlaca()+" "+ v.getMarca()+" "+v.getModelo()+" "+cv.frenar());
        
    }
    
}
