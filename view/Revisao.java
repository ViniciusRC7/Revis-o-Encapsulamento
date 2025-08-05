
package revisao.view;

import revisao.model.Cliente;

public class Revisao {

    public static void main(String[] args) {
        System.out.println("Teste");
       Cliente c1 = new Cliente(1L," Jose", 400.50);
       Cliente c2 = new Cliente(2L," Joao", 740.30); 
        Cliente c3 = new Cliente(3L," Julia", 200.80);
        
        System.out.println(c1);
        System.out.println(c2);
        System.out.println(c3);
    }
    
}
