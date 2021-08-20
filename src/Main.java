import br.com.dio.desafio.dominio.*;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Curso curso1 = new Curso();
        Curso curso2 = new Curso();

        curso1.setTitulo("curso java");
        curso1.setDescricao("descricao curso java");
        curso1.setCargaHoraria(8);

        curso2.setTitulo("curso js");
        curso2.setDescricao("descricao curso js");
        curso2.setCargaHoraria(4);

        Conteudo conteudo = new Curso();

        Mentoria mentoria = new Mentoria();
        mentoria.setTitulo("mentoria de java");
        mentoria.setDescricao("descricao mentoria java");
        mentoria.setData(LocalDate.now());

//        System.out.println(curso1);
//        System.out.println(curso2);
//        System.out.println(mentoria);
        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("Bootcamp Java Developer");
        bootcamp.setDescricao("Descrição Bootcamp Java Developer");
        bootcamp.getConteudos().add(curso1);
        bootcamp.getConteudos().add(curso2);
        bootcamp.getConteudos().add(mentoria);

        Dev devMichelle = new Dev();
        devMichelle.setNome("Michelle");
        devMichelle.inscreverBootcamp(bootcamp);
        System.out.println("Conteúdos Inscritos Michelle" + devMichelle.getConteudosInscritos());
        devMichelle.progredir();
        System.out.println("Conteúdos Inscritos Michelle" + devMichelle.getConteudosInscritos());
        System.out.println("Conteúdos Concluidos Michelle" + devMichelle.getConteudosConcluidos());
        System.out.println("XP " + devMichelle.calcularTotalXp());

        System.out.println("----------");

        Dev devMichel = new Dev();
        devMichel.setNome("Michel");
        devMichel.inscreverBootcamp(bootcamp);
        System.out.println("Conteúdos Inscritos" + devMichel.getConteudosInscritos());
        devMichel.progredir();
        System.out.println("Conteúdos Inscritos" + devMichel.getConteudosInscritos());
        System.out.println("Conteúdos Concluidos Michel" + devMichel.getConteudosConcluidos());
        System.out.println("XP " + devMichel.calcularTotalXp());



    }

}
