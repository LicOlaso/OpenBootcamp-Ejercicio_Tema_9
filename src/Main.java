public class Main {
    public static void main(String[] args) {
        Cliente cliente = new Cliente();
        cliente.setEdad(18);
        cliente.setNombre("Dario");
        cliente.setTelefono(1165345678);
        cliente.setCredito(33000.56);
        System.out.println("==Mostrando Cliente=============================================");
        System.out.println("Edad: "+cliente.getEdad());
        System.out.println("Nombre: "+cliente.getNombre());
        System.out.println("Telefono: "+cliente.getTelefono());
        System.out.println("Credito: "+cliente.getCredito());

        Trabajador trabajador = new Trabajador();
        trabajador.setEdad(48);
        trabajador.setNombre("Miguel");
        trabajador.setTelefono(1158462411);
        trabajador.setSalario(50000.99);
        System.out.println("==Mostrando Trabajador=============================================");
        System.out.println("Edad: "+trabajador.getEdad());
        System.out.println("Nombre: "+trabajador.getNombre());
        System.out.println("Telefono: "+trabajador.getTelefono());
        System.out.println("Credito: "+trabajador.getSalario());
    }
}