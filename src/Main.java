import br.com.dio.desafio.dominio.*;

import java.time.LocalDate;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Curso curso1 = new Curso();
        curso1.setTitulo("Programação a objetos Java");
        curso1.setDescricao("Descrição programação a objetos");
        curso1.setCargaHoraria(2);

        Curso curso2 = new Curso();
        curso2.setTitulo("Streams API");
        curso2.setDescricao("Descrição entendendo Streams APIs");
        curso2.setCargaHoraria(4);

        Mentoria mentoria = new Mentoria();
        mentoria.setTitulo("Mentoria de Java");
        mentoria.setDescricao("Descrição mentoria Java");
        mentoria.setData(LocalDate.now());

        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("Bootcamp Java developer");
        bootcamp.setDescricao("Descrição Bootcamp Java developer");
        bootcamp.getConteudos().add(curso1);
        bootcamp.getConteudos().add(curso2);
        bootcamp.getConteudos().add(mentoria);

        Dev devleorio = new Dev();
        devleorio.setNome("Leorio");
        devleorio.inscreverBootcamp(bootcamp);
        System.out.println("Conteudos inscritos leorio" + devleorio.getConteudosInscritos());
        devleorio.progredir();
        System.out.println("-");
        System.out.println("Conteudos inscritos leorio" + devleorio.getConteudosInscritos());
        System.out.println("Conteudos concluidos Leorio" + devleorio.getConteudoConcluidos());
        devleorio.progredir();
        System.out.println("Total XP: " + devleorio.calcularTotalXp());

        System.out.println("------------");
        Dev devKillua = new Dev();
        devKillua.inscreverBootcamp(bootcamp);
        devKillua.setNome("Killua");
        System.out.println("Conteudos inscritos Kill" + devKillua.getConteudosInscritos());
        System.out.println("Conteudos inscritos Kill" + devKillua.getConteudosInscritos());
        devKillua.progredir();
        System.out.println("-");
        System.out.println("Conteudos inscritos Kill" + devKillua.getConteudosInscritos());
        System.out.println("Conteudos concluidos Kill" + devKillua.getConteudoConcluidos());
        System.out.println("Total XP: " + devKillua.calcularTotalXp());


        System.out.println("-");
        System.out.println(bootcamp.getDevsInscritos());



//        System.out.println(curso1.calcularXp());
    }
}