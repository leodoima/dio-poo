package dio.me;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;

public class Main {
    public static void main(String[] args) throws Exception {

        System.out.println("Iniciando aplicação");

        ContentCourse introDev = new Discipline("Principios de agilidade de software", "", 16);
        ContentCourse dockerFundamentals = new Discipline("Docker do básico ao avançado", "", 12);
        ContentCourse javaBasic = new Discipline("Dominando princípios da linguagem Java", "", 20);
        ContentCourse refineJava = new Discipline("Refinando as técnicas de desenvolvimento Java", "", 8);
        ContentCourse kotlinBasic = new Discipline("Dominando a linguagem Kotlin", "", 15);
        ContentCourse introSql = new Discipline("Primeiros passos com SQL", "", 6);
        ContentCourse springFramework = new Discipline("Explorando spring framework", "", 20);

        ContentCourse welcomeBootcamp = new Mentory("Bem-vindos ao bootcamp DIO + TQI", "", LocalDate.now());
        ContentCourse cleanCode = new Mentory("Aplicando clean code aos projetos", "", LocalDate.now());
        ContentCourse finalClass = new Mentory("Live de finalização do curso", "", LocalDate.now());

        LinkedHashSet<ContentCourse> listContentCourses = new LinkedHashSet<>() {{
            add(introDev);
            add(dockerFundamentals);
            add(javaBasic);
            add(welcomeBootcamp);
            add(refineJava);
            add(kotlinBasic);
            add(cleanCode);
            add(introSql);
            add(springFramework);
            add(finalClass);
        }};

        Bootcamp bootcampDioTqi = new Bootcamp("Bootcamp DIO + TQI", listContentCourses);

        Developer pedroPaulo = new Developer("Pedro Paulo");

        pedroPaulo.enrollBootcamp(bootcampDioTqi);
        System.out.println(pedroPaulo.toString());

        pedroPaulo.completeDiscipline();
        pedroPaulo.completeDiscipline();
        pedroPaulo.completeDiscipline();

        System.out.println(pedroPaulo.toString());

        pedroPaulo.completeDiscipline();

        System.out.println(pedroPaulo.getDisciplinesSubscribed());
        System.out.println(pedroPaulo.getDisciplinesConcluded());
    }
}