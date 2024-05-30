import br.com.dio.desafio.dominio.Bootcamp;
import br.com.dio.desafio.dominio.Curso;
import br.com.dio.desafio.dominio.Dev;
import br.com.dio.desafio.dominio.Mentoria;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Curso curso1 = new Curso();
        curso1.setTitulo("curso java");
        curso1.setDescricao("Curso java -POO ");
        curso1.setCargaHoraria(8);

        Curso curso2 = new Curso();
        curso2.setTitulo("curso JS");
        curso2.setDescricao("Curso JavaScript ");
        curso2.setCargaHoraria(4);

        Mentoria mentoria = new Mentoria();
        mentoria.setTitulo("mentoria em java");
        mentoria.setDescricao("descrição mentoria java");
        mentoria.setData(LocalDate.now());

       // System.out.println(curso1);
       // System.out.println(curso2);
       // System.out.println(mentoria);

        Bootcamp bootcampDIO = new Bootcamp();
        bootcampDIO.setNome("Bootcamp java developer");
        bootcampDIO.setDescricao("Descrição do bootcamp, java developer!");
        bootcampDIO.getConteudos().add(curso1);
        bootcampDIO.getConteudos().add(curso2);
        bootcampDIO.getConteudos().add(mentoria);

        Dev dev001 = new Dev();
        dev001.setNome("Luiz Eduardo");
        dev001.inscreverBootcamp(bootcampDIO);
        System.out.println("O aluno : "+dev001.getNome());
        System.out.println("Conteudos inscritos: "+dev001.getConteudosInscritos());
        dev001.progredir();
        System.out.println("após progredir 1 modulo");
        System.out.println("Conteudos concluidos: "+ dev001.getConteudosConcluidos());
        System.out.println("Conteudos inscritos: "+dev001.getConteudosInscritos());
        System.out.println("XP: "+ dev001.calcularTotalXp());
        System.out.println("-----------------------------------------");

        Dev dev002 = new Dev();
        dev002.setNome("Laura");
        dev002.inscreverBootcamp(bootcampDIO);
        System.out.println("O aluno : "+dev002.getNome());
        System.out.println("Conteudos inscritos: "+dev002.getConteudosInscritos());
        dev002.progredir();
        dev002.progredir();
        System.out.println("após progredir 2 modulo");
        System.out.println("Conteudos concluidos: "+ dev002.getConteudosConcluidos());
        System.out.println("Conteudos inscritos: "+dev002.getConteudosInscritos());
        System.out.println("XP: "+ dev002.calcularTotalXp());




    }
}