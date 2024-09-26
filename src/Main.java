import br.com.dio.desafio.dominio.*;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {

        //instanciando professores
        Professor professor1 = new Professor();
        professor1.setNome("Camila");
        professor1.setIdade(28);

        Professor professor2 = new Professor();
        professor2.setNome("Venilton");
        professor2.setIdade(27);

        //instanciando cursos e mentoria
        Curso curso1 = new Curso();
        curso1.setTitulo("curso java");
        curso1.setDescricao("descrição curso java");
        curso1.setCargaHoraria(8);
        curso1.setProfessor(professor1);

        Curso curso2 = new Curso();
        curso2.setTitulo("curso js");
        curso2.setDescricao("descrição curso js");
        curso2.setCargaHoraria(4);
        curso2.setProfessor(professor1);

        Mentoria mentoria = new Mentoria();
        mentoria.setTitulo("mentoria de java");
        mentoria.setDescricao("descrição mentoria java");
        mentoria.setData(LocalDate.now());
        mentoria.setProfessor(professor2);

        /*System.out.println(curso1);
        System.out.println(curso2);
        System.out.println(professor1);
        System.out.println(professor2);
        System.out.println(mentoria);*/

        //instanciando bootcamp
        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("Bootcamp Java Developer");
        bootcamp.setDescricao("Descrição Bootcamp Java Developer");
        bootcamp.getConteudos().add(curso1);
        bootcamp.getConteudos().add(curso2);
        bootcamp.getConteudos().add(mentoria);

        //instanciando devs
        Dev devJulia = new Dev();
        devJulia.setNome("Julia");
        devJulia.setIdade(21);
        devJulia.inscreverBootcamp(bootcamp);
        System.out.println("Conteúdos Inscritos Júlia:" + devJulia.getConteudosInscritos());
        devJulia.progredir();
        devJulia.progredir();
        System.out.println("-");
        System.out.println("Conteúdos Inscritos Júlia:" + devJulia.getConteudosInscritos());
        System.out.println("Conteúdos Concluídos Júlia:" + devJulia.getConteudosConcluidos());
        System.out.println("XP:" + devJulia.calcularTotalXp());

        System.out.println("-------");

        Dev devJoao = new Dev();
        devJoao.setNome("Joao");
        devJoao.setIdade(25);
        devJoao.inscreverBootcamp(bootcamp);
        System.out.println("Conteúdos Inscritos João:" + devJoao.getConteudosInscritos());
        devJoao.concluirCurso(curso2);
        System.out.println("-");
        System.out.println("Conteúdos Inscritos João:" + devJoao.getConteudosInscritos());
        System.out.println("Conteúdos Concluidos João:" + devJoao.getConteudosConcluidos());
        System.out.println("XP:" + devJoao.calcularTotalXp());

        System.out.println("\n=================\n");
        System.out.println("Ranking Devs Bootcamp:");
        bootcamp.rankingDevs();

    }

}
