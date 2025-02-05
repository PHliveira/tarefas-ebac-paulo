public class Resposta {

    public static void main(String args[]){

        Cliente cliente = new Cliente();


        cliente.setEndereco(" Rua : parapapa,252");
        cliente.setNome("Juca da silva junior ");
        cliente.setIdade(75);

        System.out.println(" Segue os dados ");
        System.out.println(" Nome -> " + cliente.getNome());
        System.out.println(" Idade -> " + cliente.getIdade());
        System.out.println(" Endereço -> " + cliente.getEndereco() + " SP");



    }
}

