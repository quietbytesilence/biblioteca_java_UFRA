import java.util.HashMap;
//import java.util.ArrayList;
public class Biblioteca{
    //private ArrayList<Livro> livros = new ArrayList<>();
    private HashMap<Integer, Livro> livros = new HashMap<>();
    
    public Biblioteca(){
        livros.put(1234, new Livro("Pequena Esmeralda", "Gustavo C. C. Maciel", 2019));
        livros.put(2345, new Livro("O Universo em uma Casca de Noz", "Stephen Hawking", 2001));
        livros.put(3456, new Livro("A Teoria de Tudo", "Stephen Hawking", 2002));
        livros.put(4567, new Livro("Breve História do Tempo", "Stephen Hawking", 1988));
        livros.put(5678, new Livro("O Mundo Assombrado pelos Demônios", "Carl Sagan", 1995));
        livros.put(6789, new Livro("O Cérebro Nosso de Cada Dia", "Suzana Herculano-Houzel", 2002));
        livros.put(7890, new Livro("Pálido Ponto Azul", "Carl Sagan", 1994));
        livros.put(8901, new Livro("Cosmos", "Carl Sagan", 1980));
        livros.put(9012, new Livro("A Origem das Espécies", "Charles Darwin", 1859));
        livros.put(1023, new Livro("Sapiens: Uma Breve História da Humanidade", "Yuval Noah Harari", 2011));
        livros.put(2134, new Livro("Homo Deus: Uma Breve História do Amanhã", "Yuval Noah Harari", 2015));
        livros.put(3245, new Livro("O Gene Egoísta", "Richard Dawkins", 1976));
        livros.put(4356, new Livro("O Poder do Hábito", "Charles Duhigg", 2012));
        livros.put(5467, new Livro("Rápido e Devagar: Duas Formas de Pensar", "Daniel Kahneman", 2011));
        livros.put(6578, new Livro("A Revolução dos Bichos", "George Orwell", 1945));
        livros.put(7689, new Livro("1984", "George Orwell", 1949));

    }
    public boolean livroExiste(Integer codigo){
        if (livros.containsKey(codigo)){
            return true;
        }else{
            return false;
        }
    }
    public void excluirLivro(Integer codigo){
        livros.remove(codigo);
    }
    
    public void adicionarLivro(Integer codigo, Livro l){
        livros.put(codigo, l);
    }
    public void alterarLivro(Integer codigo, Livro l){
        livros.replace(codigo, l);
    }
    
    public Livro pegarDadosDeUmLivro(Integer codigo){
        return livros.get(codigo);
    }
    public void listarLivros(){
        livros.forEach((codigo, livro) ->
            System.out.println("\nCódigo: "+codigo+"\n"+livro)
            );
    }
}
/*
Incliur
Excluir
Alterar
Listar
*/



