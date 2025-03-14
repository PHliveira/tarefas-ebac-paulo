public class Main {

    public static void main(String[] args) throws ClassNotFoundException {
        // Obter o objeto Class da classe anotada
        Class<?> clazz = Class.forName("Tabela");// colocar o nome da classe


            Nometabela nometabela = clazz.getAnnotation(Nometabela.class);

            // Ler o valor da anotação
            System.out.println("Nome da tabela: " + nometabela.value());

    }

}
