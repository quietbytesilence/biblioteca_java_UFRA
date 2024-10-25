    public class Livro{
        private String nome;
        private String autor;
        private int publicacao;
        
        public Livro(String nome, String autor, int publicacao){
            this.nome = nome;
            this.autor = autor;
            this.publicacao = publicacao;
        }
        public String getNome(){return this.nome;}
        public String getAutor(){return this.autor;}
        //public int getCodigo(){return this.codigo;}
        public int getPublicacao(){return this.publicacao;}
        
        public void setNome(String nome){
            this.nome = nome;
        }
        public void setAutor(String autor){
            this.autor = autor;
        }
        public void setPublicacao(int publicacao){
            this.publicacao = publicacao;
        }
        public String toString(){
            return String.format("Nome: %s\nAutor: %s\nPublicação: %d", getNome(), getAutor(), getPublicacao());
        }
        
    }